package br.com.wsilva.mobileos.entity;

import javax.persistence.*;

@Entity
@Table(name = "mos_local_ocorrencia")
public class LocalOcorrenciaEntity {
    @Id
    @Column(name = "loco_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "empr_id")
    private EmpresaEntity empresa;

    @Column(name = "loco_dslocalocorrencia")
    private String descricao;

    public LocalOcorrenciaEntity() {
    }
}