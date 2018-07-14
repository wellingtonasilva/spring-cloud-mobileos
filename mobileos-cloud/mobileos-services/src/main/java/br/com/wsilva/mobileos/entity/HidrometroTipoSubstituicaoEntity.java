package br.com.wsilva.mobileos.entity;

import javax.persistence.*;

@Entity
@Table(name = "mos_hidrometro_tipo_subs")
public class HidrometroTipoSubstituicaoEntity {
    @Id
    @Column(name = "hits_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "empr_id")
    private EmpresaEntity empresa;

    @Column(name = "hits_dstiposubstituicao")
    private String descricao;

    public HidrometroTipoSubstituicaoEntity() {
    }
}