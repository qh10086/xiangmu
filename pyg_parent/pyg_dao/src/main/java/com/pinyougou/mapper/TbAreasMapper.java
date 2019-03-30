package com.pinyougou.mapper;

import com.pinyougou.pojo.TbAreas;
import com.pinyougou.pojo.TbAreasExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbAreasMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_areas
     *
     * @mbggenerated Sat Mar 02 16:57:17 CST 2019
     */
    int countByExample(TbAreasExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_areas
     *
     * @mbggenerated Sat Mar 02 16:57:17 CST 2019
     */
    int deleteByExample(TbAreasExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_areas
     *
     * @mbggenerated Sat Mar 02 16:57:17 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_areas
     *
     * @mbggenerated Sat Mar 02 16:57:17 CST 2019
     */
    int insert(TbAreas record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_areas
     *
     * @mbggenerated Sat Mar 02 16:57:17 CST 2019
     */
    int insertSelective(TbAreas record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_areas
     *
     * @mbggenerated Sat Mar 02 16:57:17 CST 2019
     */
    List<TbAreas> selectByExample(TbAreasExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_areas
     *
     * @mbggenerated Sat Mar 02 16:57:17 CST 2019
     */
    TbAreas selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_areas
     *
     * @mbggenerated Sat Mar 02 16:57:17 CST 2019
     */
    int updateByExampleSelective(@Param("record") TbAreas record, @Param("example") TbAreasExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_areas
     *
     * @mbggenerated Sat Mar 02 16:57:17 CST 2019
     */
    int updateByExample(@Param("record") TbAreas record, @Param("example") TbAreasExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_areas
     *
     * @mbggenerated Sat Mar 02 16:57:17 CST 2019
     */
    int updateByPrimaryKeySelective(TbAreas record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_areas
     *
     * @mbggenerated Sat Mar 02 16:57:17 CST 2019
     */
    int updateByPrimaryKey(TbAreas record);
}