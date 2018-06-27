package br.com.dbs.awesome.error;

public class ErrorDetail {
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
}
