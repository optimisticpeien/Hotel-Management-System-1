package com.spawpaw.ssm.dao;

import com.spawpaw.ssm.entity.Masterinfo;
import com.spawpaw.ssm.entity.MasterinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MasterinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table masterinfo
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    int countByExample(MasterinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table masterinfo
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    int deleteByExample(MasterinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table masterinfo
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table masterinfo
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    int insert(Masterinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table masterinfo
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    int insertSelective(Masterinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table masterinfo
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    List<Masterinfo> selectByExample(MasterinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table masterinfo
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    Masterinfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table masterinfo
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    int updateByExampleSelective(@Param("record") Masterinfo record, @Param("example") MasterinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table masterinfo
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    int updateByExample(@Param("record") Masterinfo record, @Param("example") MasterinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table masterinfo
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    int updateByPrimaryKeySelective(Masterinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table masterinfo
     *
     * @mbggenerated Mon Feb 19 12:24:04 CST 2018
     */
    int updateByPrimaryKey(Masterinfo record);
}