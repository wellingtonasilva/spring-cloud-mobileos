package br.com.wsilva.mobileos.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "mos_hidrometro_local_armaz")
@Data
public class HidrometroLocalArmazenamentoEntity {
    @Id
    @Column(name = "hdla_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @JoinColumn(name = "empr_id")
    private EmpresaEntity empresa;

    @Column(name = "hdla_dslocalarmazenagem")
    private String descricao;

    public HidrometroLocalArmazenamentoEntity() {
    }
}