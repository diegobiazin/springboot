package br.com.dbs.awesome.error;

public class ResourceNotFoundDetails extends ErrorDetail{

    public static final class builder {
        private String title;
        private int status;
        private String detail;
        private Long timeStamp;
        private String developerMesasge;

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

        public ResourceNotFoundDetails build() {
            ResourceNotFoundDetails resourceNotFoundDetails = new ResourceNotFoundDetails();
            resourceNotFoundDetails.setDetail(detail);
            resourceNotFoundDetails.setTimeStamp(timeStamp);
            resourceNotFoundDetails.setTitle(title);
            resourceNotFoundDetails.setDeveloperMesasge(developerMesasge);
            resourceNotFoundDetails.setStatus(status);
            return resourceNotFoundDetails;
        }
    }
}
