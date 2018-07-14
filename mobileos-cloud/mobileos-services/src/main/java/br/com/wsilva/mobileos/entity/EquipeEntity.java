package br.com.wsilva.mobileos.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "mos_equipe")
@Data
public class EquipeEntity {
    @Id
    @Column(name = "eqpe_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "empr_id")
    private EmpresaEntity empresa;

    @Column(name = "eqpe_nmequipe")
    private String nomeEquipe;

    @Column(name = "eqpe_nnplacaveiculo")
    private String numeroPlacaVeiculo;

    @Column(name = "eqpe_cargahorariotrabalho")
    private String cargaHorarioTrabalho;

    public EquipeEntity() {
    }
}