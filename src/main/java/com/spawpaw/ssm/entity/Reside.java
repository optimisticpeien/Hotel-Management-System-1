package com.spawpaw.ssm.entity;

import java.util.Date;

public class Reside {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column reside.id
     *
     * @mbggenerated Thu Jan 04 16:26:19 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column reside.dtlid
     *
     * @mbggenerated Thu Jan 04 16:26:19 CST 2018
     */
    private Integer dtlid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column reside.residedate
     *
     * @mbggenerated Thu Jan 04 16:26:19 CST 2018
     */
    private Date residedate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column reside.roomername
     *
     * @mbggenerated Thu Jan 04 16:26:19 CST 2018
     */
    private String roomername;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column reside.idcard
     *
     * @mbggenerated Thu Jan 04 16:26:19 CST 2018
     */
    private String idcard;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column reside.id
     *
     * @return the value of reside.id
     *
     * @mbggenerated Thu Jan 04 16:26:19 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column reside.id
     *
     * @param id the value for reside.id
     *
     * @mbggenerated Thu Jan 04 16:26:19 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column reside.dtlid
     *
     * @return the value of reside.dtlid
     *
     * @mbggenerated Thu Jan 04 16:26:19 CST 2018
     */
    public Integer getDtlid() {
        return dtlid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column reside.dtlid
     *
     * @param dtlid the value for reside.dtlid
     *
     * @mbggenerated Thu Jan 04 16:26:19 CST 2018
     */
    public void setDtlid(Integer dtlid) {
        this.dtlid = dtlid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column reside.residedate
     *
     * @return the value of reside.residedate
     *
     * @mbggenerated Thu Jan 04 16:26:19 CST 2018
     */
    public Date getResidedate() {
        return residedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column reside.residedate
     *
     * @param residedate the value for reside.residedate
     *
     * @mbggenerated Thu Jan 04 16:26:19 CST 2018
     */
    public void setResidedate(Date residedate) {
        this.residedate = residedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column reside.roomername
     *
     * @return the value of reside.roomername
     *
     * @mbggenerated Thu Jan 04 16:26:19 CST 2018
     */
    public String getRoomername() {
        return roomername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column reside.roomername
     *
     * @param roomername the value for reside.roomername
     *
     * @mbggenerated Thu Jan 04 16:26:19 CST 2018
     */
    public void setRoomername(String roomername) {
        this.roomername = roomername == null ? null : roomername.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column reside.idcard
     *
     * @return the value of reside.idcard
     *
     * @mbggenerated Thu Jan 04 16:26:19 CST 2018
     */
    public String getIdcard() {
        return idcard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column reside.idcard
     *
     * @param idcard the value for reside.idcard
     *
     * @mbggenerated Thu Jan 04 16:26:19 CST 2018
     */
    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }
}