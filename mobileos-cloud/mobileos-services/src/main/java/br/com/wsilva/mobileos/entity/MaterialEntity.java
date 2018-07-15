package br.com.wsilva.mobileos.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "mos_material")
@Data
public class MaterialEntity {
    @Id
    @Column(name = "mate_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "empr_id")
    private EmpresaEntity empresa;

    @Column(name = "mate_dsmaterial")
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "unid_id")
    private UnidadeMedidaEntity unidadeMedida;

    @Column(name = "mate_dsunidade")
    private String unidadeDescricao;


    public MaterialEntity() {
    }
}