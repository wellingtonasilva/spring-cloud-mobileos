package br.com.wsilva.mobileos.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "mos_equipe_componentes")
@Data
public class EquipeComponentesEntity {
    @Id
    @Column(name = "eqpc_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "eqpe_id")
    private EquipeEntity equipe;

    @ManyToOne
    @JoinColumn(name = "func_id")
    private FuncionarioEntity funcionario;

    @Column(name = "eqpc_icresponsavel")
    private String indicadorResponsavel;

    public EquipeComponentesEntity() {
    }
}