package br.com.dbs.awesome.handler;

import br.com.dbs.awesome.error.ResourceNotFoundDetails;
import br.com.dbs.awesome.error.ResourceNotFoundException;
import br.com.dbs.awesome.error.ValidationErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@ControllerAdvice
public class RestExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException rfnException){
        ResourceNotFoundDetails rfnDetails = ResourceNotFoundDetails.builder
                .newBuilder()
                .timeStamp(new Date().getTime())
                .status(HttpStatus.NOT_FOUND.value())
                .title("Resource not found")
                .detail(rfnException.getMessage())
                .developerMesasge(rfnException.getClass().getName())
                .build();

        return new ResponseEntity<>(rfnDetails, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleMethodArgumentNotValidException(MethodArgumentNotValidException manvException){
        Map<String, String> fieldErrorsReturn = new HashMap<>();
        for (FieldError field: manvException.getBindingResult().getFieldErrors()) {
            fieldErrorsReturn.put(field.getField(), field.getDefaultMessage());
        }

        ValidationErrorDetails rfnDetails = ValidationErrorDetails.builder
                .newBuilder()
                .timeStamp(new Date().getTime())
                .status(HttpStatus.BAD_REQUEST.value())
                .title("Field Validation Error")
                .detail("Field Validation Error")
                .developerMesasge(manvException.getClass().getName())
                .fieldMessage(fieldErrorsReturn)
                .build();

        return new ResponseEntity<>(rfnDetails, HttpStatus.BAD_REQUEST);
    }
}

