package br.com.wsilva.mobileos.entity;

import javax.persistence.*;

@Entity
@Table(name = "mos_servico_tipo")
public class OrdemServicoFotoEntity {
    @Id
    @Column(name = "svtp_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "svtp_dsservicotipo")
    private String descricao;

    public OrdemServicoFotoEntity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

