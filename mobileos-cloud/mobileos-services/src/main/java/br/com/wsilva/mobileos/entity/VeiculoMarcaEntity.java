package br.com.wsilva.mobileos.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "mos_veiculo_marca")
@Data
public class VeiculoMarcaEntity {
    @Id
    @Column(name = "vemr_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "vemr_dsveiculomarca")
    private String descricao;

    public VeiculoMarcaEntity() {
    }
}

