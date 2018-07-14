package br.com.wsilva.mobileos.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "mos_veiculo_modelo")
@Data
public class VeiculoModeloEntity {
    @Id
    @Column(name = "vemo_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "vemo_dsveiculomodelo")
    private String descricao;

    public VeiculoModeloEntity() {
    }
}

