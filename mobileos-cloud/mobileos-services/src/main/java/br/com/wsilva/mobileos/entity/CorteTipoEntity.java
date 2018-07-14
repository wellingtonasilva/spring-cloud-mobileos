package br.com.wsilva.mobileos.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "mos_corte_tipo")
@Data
public class CorteTipoEntity {
    @Id
    @Column(name = "cotp_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "cotp_dscortetipo")
    private String descricao;

    public CorteTipoEntity() {
    }
}

