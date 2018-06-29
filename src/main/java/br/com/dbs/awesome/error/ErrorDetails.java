package br.com.dbs.awesome.error;

public class ErrorDetails {
    private String title;
    private int status;
    private String detail;
    private Long timeStamp;
    private String developerMesasge;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getDeveloperMesasge() {
        return developerMesasge;
    }

    public void setDeveloperMesasge(String developerMesasge) {
        this.developerMesasge = developerMesasge;
    }

    public static final class Builder {
        private String title;
        private int status;
        private String detail;
        private Long timeStamp;
        private String developerMesasge;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder status(int status) {
            this.status = status;
            return this;
        }

        public Builder detail(String detail) {
            this.detail = detail;
            return this;
        }

        public Builder timeStamp(Long timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }

        public Builder developerMesasge(String developerMesasge) {
            this.developerMesasge = developerMesasge;
            return this;
        }

        public ErrorDetails build() {
            ErrorDetails errorDetails = new ErrorDetails();
            errorDetails.setTitle(title);
            errorDetails.setStatus(status);
            errorDetails.setDetail(detail);
            errorDetails.setTimeStamp(timeStamp);
            errorDetails.setDeveloperMesasge(developerMesasge);
            return errorDetails;
        }
    }
}
