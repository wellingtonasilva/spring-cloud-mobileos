package br.com.wsilva.mobileos.entity;

import javax.persistence.*;

@Entity
@Table(name = "mos_corte_tipo")
public class CorteTipoEntity {
    @Id
    @Column(name = "cotp_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "cotp_dscortetipo")
    private String descricao;

    public CorteTipoEntity() {
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

