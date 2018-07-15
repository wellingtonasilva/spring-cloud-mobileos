package br.com.wsilva.mobileos.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "mos_hidrometro_situacao")
@Data
public class HidrometroSituacaoEntity {
    @Id
    @Column(name = "hdst_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "empr_id")
    private EmpresaEntity empresa;

    @Column(name = "hdst_dstiposituacaohm")
    private String descricao;

    public HidrometroSituacaoEntity() {
    }
}