package com.msgbean;

public class Receipt {

    private Integer code;

    private String msg;

    private Boolean flag;

    @Override
    public String toString() {
        return "Receipt{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", flag=" + flag +
                '}';
    }

    public Receipt() {
    }

    public Receipt(Integer code, String msg, Boolean flag) {
        this.code = code;
        this.msg = msg;
        this.flag = flag;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }
}
