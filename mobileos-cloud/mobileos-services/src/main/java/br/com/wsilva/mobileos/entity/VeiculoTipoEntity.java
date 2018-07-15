package br.com.wsilva.mobileos.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "mos_veiculo_tipo")
@Data
public class VeiculoTipoEntity {
    @Id
    @Column(name = "vetp_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "vetp_dsveiculotipo")
    private String descricao;

    public VeiculoTipoEntity() {
    }
}