package br.com.wsilva.mobileos.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "mos_motivo_corte")
@Data
public class MotivoCorteEntity {
    @Id
    @Column(name = "mcor_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "empr_id")
    private EmpresaEntity empresa;

    @Column(name = "mcor_dsmotivocorte")
    private String descricao;

    public MotivoCorteEntity() {
    }
}