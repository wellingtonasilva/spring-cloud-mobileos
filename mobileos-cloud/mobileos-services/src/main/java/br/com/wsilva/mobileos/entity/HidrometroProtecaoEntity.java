package br.com.wsilva.mobileos.entity;

import javax.persistence.*;

@Entity
@Table(name = "mos_hidrometro_protecao")
public class HidrometroProtecaoEntity {
    @Id
    @Column(name = "hpro_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "empr_id")
    private EmpresaEntity empresa;

    @Column(name = "hpro_dsprotecao")
    private String descricao;

    public HidrometroProtecaoEntity() {
    }
}