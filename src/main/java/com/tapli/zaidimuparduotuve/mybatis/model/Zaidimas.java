package com.tapli.zaidimuparduotuve.mybatis.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Zaidimas {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.ZAIDIMAS.ID
     *
     * @mbg.generated Tue Apr 05 17:37:16 EEST 2022
     */
    private Integer id;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.ZAIDIMAS.KAINA
     *
     * @mbg.generated Tue Apr 05 17:37:16 EEST 2022
     */
    private Double kaina;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.ZAIDIMAS.PAVADINIMAS
     *
     * @mbg.generated Tue Apr 05 17:37:16 EEST 2022
     */
    private String pavadinimas;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.ZAIDIMAS.SERIJINIS_NR
     *
     * @mbg.generated Tue Apr 05 17:37:16 EEST 2022
     */
    private Integer serijinis_Nr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.ZAIDIMAS.KATEGORIJA_ID
     *
     * @mbg.generated Tue Apr 05 17:37:16 EEST 2022
     */
    private Integer kategorijaId;

    private Kategorija kategorija;
    private List<Atsiliepimas> atsiliepimai;
}