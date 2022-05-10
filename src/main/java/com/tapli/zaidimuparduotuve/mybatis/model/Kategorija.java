package com.tapli.zaidimuparduotuve.mybatis.model;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Kategorija {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.KATEGORIJA.ID
     *
     * @mbg.generated Tue Apr 05 17:37:16 EEST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.KATEGORIJA.PAVADINIMAS
     *
     * @mbg.generated Tue Apr 05 17:37:16 EEST 2022
     */
    private String pavadinimas;

    private List<Zaidimas> zaidimai;

}