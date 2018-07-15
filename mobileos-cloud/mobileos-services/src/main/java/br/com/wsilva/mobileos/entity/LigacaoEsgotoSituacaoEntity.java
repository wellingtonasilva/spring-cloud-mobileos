package br.com.wsilva.mobileos.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "mos_ligacao_esgoto_situacao")
@Data
public class LigacaoEsgotoSituacaoEntity {
    @Id
    @Column(name = "legs_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "empr_id")
    private EmpresaEntity empresa;

    @Column(name = "legs_dsligacaoesgotosituacao")
    private String descricao;

    public LigacaoEsgotoSituacaoEntity() {
    }
}