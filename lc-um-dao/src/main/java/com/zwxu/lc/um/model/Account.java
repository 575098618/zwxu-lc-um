package com.zwxu.lc.um.model;

import java.util.Date;

public class Account {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account.id
     *
     * @mbggenerated Thu Nov 24 11:10:03 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account.loginname
     *
     * @mbggenerated Thu Nov 24 11:10:03 CST 2016
     */
    private String loginname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account.password
     *
     * @mbggenerated Thu Nov 24 11:10:03 CST 2016
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account.rid
     *
     * @mbggenerated Thu Nov 24 11:10:03 CST 2016
     */
    private Integer rid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account.create_time
     *
     * @mbggenerated Thu Nov 24 11:10:03 CST 2016
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account.id
     *
     * @return the value of t_account.id
     *
     * @mbggenerated Thu Nov 24 11:10:03 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account.id
     *
     * @param id the value for t_account.id
     *
     * @mbggenerated Thu Nov 24 11:10:03 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account.loginname
     *
     * @return the value of t_account.loginname
     *
     * @mbggenerated Thu Nov 24 11:10:03 CST 2016
     */
    public String getLoginname() {
        return loginname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account.loginname
     *
     * @param loginname the value for t_account.loginname
     *
     * @mbggenerated Thu Nov 24 11:10:03 CST 2016
     */
    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account.password
     *
     * @return the value of t_account.password
     *
     * @mbggenerated Thu Nov 24 11:10:03 CST 2016
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account.password
     *
     * @param password the value for t_account.password
     *
     * @mbggenerated Thu Nov 24 11:10:03 CST 2016
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account.rid
     *
     * @return the value of t_account.rid
     *
     * @mbggenerated Thu Nov 24 11:10:03 CST 2016
     */
    public Integer getRid() {
        return rid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account.rid
     *
     * @param rid the value for t_account.rid
     *
     * @mbggenerated Thu Nov 24 11:10:03 CST 2016
     */
    public void setRid(Integer rid) {
        this.rid = rid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account.create_time
     *
     * @return the value of t_account.create_time
     *
     * @mbggenerated Thu Nov 24 11:10:03 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account.create_time
     *
     * @param createTime the value for t_account.create_time
     *
     * @mbggenerated Thu Nov 24 11:10:03 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}