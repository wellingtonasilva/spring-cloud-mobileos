package br.com.wsilva.mobileos.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "mos_ligacao_agua_situacao")
@Data
public class LigacaoAguaSituacaoEntity {
    @Id
    @Column(name = "lags_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "empr_id")
    private EmpresaEntity empresa;

    @Column(name = "lags_dsligacaosituacaoagua")
    private String descricao;

    public LigacaoAguaSituacaoEntity() {
    }
}