package br.com.dbs.awesome.error;

import java.util.Map;

public class ValidationErrorDetails extends ErrorDetails {
    private Map<String, String> fieldMessage;

    public Map<String, String> getFieldMessage() {
        return fieldMessage;
    }

    public void setFieldMessage(Map<String, String> fieldMessage) {
        this.fieldMessage = fieldMessage;
    }

    public static final class builder {
        private String title;
        private int status;
        private String detail;
        private Long timeStamp;
        private String developerMesasge;
        private Map<String, String> fieldMessage;

        private builder() {
        }

        public static builder newBuilder() {
            return new builder();
        }

        public builder title(String title) {
            this.title = title;
            return this;
        }

        public builder status(int status) {
            this.status = status;
            return this;
        }

        public builder detail(String detail) {
            this.detail = detail;
            return this;
        }

        public builder timeStamp(Long timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }

        public builder developerMesasge(String developerMesasge) {
            this.developerMesasge = developerMesasge;
            return this;
        }

        public builder fieldMessage(Map<String, String> fieldMessage) {
            this.fieldMessage = fieldMessage;
            return this;
        }

        public ValidationErrorDetails build() {
            ValidationErrorDetails validationErrorDetails = new ValidationErrorDetails();
            validationErrorDetails.setDetail(detail);
            validationErrorDetails.setTimeStamp(timeStamp);
            validationErrorDetails.setTitle(title);
            validationErrorDetails.setDeveloperMesasge(developerMesasge);
            validationErrorDetails.setStatus(status);
            validationErrorDetails.fieldMessage = this.fieldMessage;
            return validationErrorDetails;
        }
    }
}
