package br.com.wsilva.mobileos.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "mos_pavimento_tipo")
@Data
public class PavimentoTipoEntity {
    @Id
    @Column(name = "pavt_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "svtp_dsservicotipo")
    private String pavt_dspavimentotipo;

    public PavimentoTipoEntity() {
    }
}