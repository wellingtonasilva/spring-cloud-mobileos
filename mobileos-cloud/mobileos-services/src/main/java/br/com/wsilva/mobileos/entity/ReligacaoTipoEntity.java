package br.com.wsilva.mobileos.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "mos_religacao_tipo")
@Data
public class ReligacaoTipoEntity {
    @Id
    @Column(name = "retp_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "rept_dsreligacaotipo")
    private String descricao;

    public ReligacaoTipoEntity() {
    }
}