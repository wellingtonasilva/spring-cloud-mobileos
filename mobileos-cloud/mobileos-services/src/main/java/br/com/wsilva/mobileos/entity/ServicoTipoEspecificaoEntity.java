package br.com.wsilva.mobileos.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "mos_servico_tipo_especificacao")
@Data
public class ServicoTipoEspecificaoEntity {
    @Id
    @Column(name = "step_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "svtp_id")
    private ServicoTipoEntity servicoTipo;

    @Column(name = "step_dssolicitacaotipo", length = 60)
    private String descricao;

    public ServicoTipoEspecificaoEntity() {
    }
}