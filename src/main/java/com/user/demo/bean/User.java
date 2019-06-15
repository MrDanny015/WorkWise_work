package com.user.demo.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_user.uid
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    private Integer uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_user.uname
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    private String uname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_user.brithday
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date brithday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_user.fans
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    private Integer fans;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_user.attention
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    private Integer attention;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_user.viewcount
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    private Integer viewcount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_user.signature
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    private String signature;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_user.username
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_user.userpwd
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    private String userpwd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_user.stauts
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    private Integer stauts;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_user.leftstauts
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    private Integer leftstauts;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table c_user
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_user.uid
     *
     * @return the value of c_user.uid
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_user.uid
     *
     * @param uid the value for c_user.uid
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_user.uname
     *
     * @return the value of c_user.uname
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    public String getUname() {
        return uname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_user.uname
     *
     * @param uname the value for c_user.uname
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_user.brithday
     *
     * @return the value of c_user.brithday
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getBrithday() {
        return brithday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_user.brithday
     *
     * @param brithday the value for c_user.brithday
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_user.fans
     *
     * @return the value of c_user.fans
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    public Integer getFans() {
        return fans;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_user.fans
     *
     * @param fans the value for c_user.fans
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    public void setFans(Integer fans) {
        this.fans = fans;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_user.attention
     *
     * @return the value of c_user.attention
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    public Integer getAttention() {
        return attention;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_user.attention
     *
     * @param attention the value for c_user.attention
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    public void setAttention(Integer attention) {
        this.attention = attention;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_user.viewcount
     *
     * @return the value of c_user.viewcount
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    public Integer getViewcount() {
        return viewcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_user.viewcount
     *
     * @param viewcount the value for c_user.viewcount
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    public void setViewcount(Integer viewcount) {
        this.viewcount = viewcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_user.signature
     *
     * @return the value of c_user.signature
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    public String getSignature() {
        return signature;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_user.signature
     *
     * @param signature the value for c_user.signature
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_user.username
     *
     * @return the value of c_user.username
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_user.username
     *
     * @param username the value for c_user.username
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_user.userpwd
     *
     * @return the value of c_user.userpwd
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    public String getUserpwd() {
        return userpwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_user.userpwd
     *
     * @param userpwd the value for c_user.userpwd
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd == null ? null : userpwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_user.stauts
     *
     * @return the value of c_user.stauts
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    public Integer getStauts() {
        return stauts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_user.stauts
     *
     * @param stauts the value for c_user.stauts
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    public void setStauts(Integer stauts) {
        this.stauts = stauts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_user.leftstauts
     *
     * @return the value of c_user.leftstauts
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    public Integer getLeftstauts() {
        return leftstauts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_user.leftstauts
     *
     * @param leftstauts the value for c_user.leftstauts
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    public void setLeftstauts(Integer leftstauts) {
        this.leftstauts = leftstauts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_user
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uid=").append(uid);
        sb.append(", uname=").append(uname);
        sb.append(", brithday=").append(brithday);
        sb.append(", fans=").append(fans);
        sb.append(", attention=").append(attention);
        sb.append(", viewcount=").append(viewcount);
        sb.append(", signature=").append(signature);
        sb.append(", username=").append(username);
        sb.append(", userpwd=").append(userpwd);
        sb.append(", stauts=").append(stauts);
        sb.append(", leftstauts=").append(leftstauts);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}