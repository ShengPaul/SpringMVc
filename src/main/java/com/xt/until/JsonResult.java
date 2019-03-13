package com.xt.until;

public class JsonResult {

    private String status;
    private Object object;
    private String msg;

    public JsonResult(String status, Object object, String msg) {
        this.status = status;
        this.object = object;
        this.msg = msg;
    }

    public JsonResult(String status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public JsonResult() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
