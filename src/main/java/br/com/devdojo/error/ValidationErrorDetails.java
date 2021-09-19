package br.com.devdojo.error;

public class ValidationErrorDetails extends ErrorDetail {
    private String field;
    private String fieldMessage;

    public static final class Builder {
        private String title;
        private int status;
        private String details;
        private long timestamp;
        private String developerMessage;
        private String field;
        private String fieldMessage;


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

        public Builder details(String details) {
            this.details = details;
            return this;
        }

        public Builder timestamp(long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder developerMessage(String developerMessage) {
            this.developerMessage = developerMessage;
            return this;
        }
        public Builder field (String field) {
            this.field = field;
            return this;
        }
        public Builder fieldMessage (String fieldMessage) {
            this.fieldMessage = fieldMessage;
            return this;
        }

        public ValidationErrorDetails build() {
            ValidationErrorDetails ValidationErrorDetails = new ValidationErrorDetails();
            ValidationErrorDetails.setDeveloperMessage(developerMessage);
            ValidationErrorDetails.setTitle(title);
            ValidationErrorDetails.setDetails(details);
            ValidationErrorDetails.setTimestamp(timestamp);
            ValidationErrorDetails.setStatus(status);
            ValidationErrorDetails.fieldMessage = fieldMessage;
            ValidationErrorDetails.field = field;
            return ValidationErrorDetails;
        }
    }

    public String getField() {
        return field;
    }

    public String getFieldMessage() {
        return fieldMessage;
    }
}
