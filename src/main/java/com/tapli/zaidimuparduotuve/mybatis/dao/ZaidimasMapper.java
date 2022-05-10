package com.tapli.zaidimuparduotuve.mybatis.dao;

import com.tapli.zaidimuparduotuve.mybatis.model.Zaidimas;
import org.mybatis.cdi.Mapper;

import java.util.List;

@Mapper
public interface ZaidimasMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.ZAIDIMAS
     *
     * @mbg.generated Tue May 05  17:37:16 EEST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.ZAIDIMAS
     *
     * @mbg.generated Tue May 05  17:37:16 EEST 2022
     */
    int insert(Zaidimas record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.ZAIDIMAS
     *
     * @mbg.generated Tue May 05  17:37:16 EEST 2022
     */
    Zaidimas selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.ZAIDIMAS
     *
     * @mbg.generated Tue May 05  17:37:16 EEST 2022
     */
    List<Zaidimas> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.ZAIDIMAS
     *
     * @mbg.generated Tue May 05  17:37:16 EEST 2022
     */
    int updateByPrimaryKey(Zaidimas record);
}