package br.com.wsilva.mobileos.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "mos_servico_tipo")
@Data
public class VeiculoTipoEntity {
    @Id
    @Column(name = "svtp_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "svtp_dsservicotipo")
    private String descricao;

    public VeiculoTipoEntity() {
    }
}

