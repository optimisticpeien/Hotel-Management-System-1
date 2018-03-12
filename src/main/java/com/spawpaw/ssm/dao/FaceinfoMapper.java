package com.spawpaw.ssm.dao;

import com.spawpaw.ssm.entity.Faceinfo;
import com.spawpaw.ssm.entity.FaceinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FaceinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table faceinfo
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    int countByExample(FaceinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table faceinfo
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    int deleteByExample(FaceinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table faceinfo
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table faceinfo
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    int insert(Faceinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table faceinfo
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    int insertSelective(Faceinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table faceinfo
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    List<Faceinfo> selectByExampleWithBLOBs(FaceinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table faceinfo
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    List<Faceinfo> selectByExample(FaceinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table faceinfo
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    Faceinfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table faceinfo
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    int updateByExampleSelective(@Param("record") Faceinfo record, @Param("example") FaceinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table faceinfo
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") Faceinfo record, @Param("example") FaceinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table faceinfo
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    int updateByExample(@Param("record") Faceinfo record, @Param("example") FaceinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table faceinfo
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    int updateByPrimaryKeySelective(Faceinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table faceinfo
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(Faceinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table faceinfo
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    int updateByPrimaryKey(Faceinfo record);
}