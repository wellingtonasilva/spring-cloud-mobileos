package br.com.wsilva.mobileos.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "mos_unidade_medida")
@Data
public class UnidadeMedidaEntity {
    @Id
    @Column(name = "unid_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "unid_dsunidade")
    private String descricao;

    public UnidadeMedidaEntity() {
    }
}