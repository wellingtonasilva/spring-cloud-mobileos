package br.com.wsilva.mobileos.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "mos_ordem_servico_material")
@Data
public class OrdemServicoMaterialEntity {
    @Id
    @Column(name = "osmu_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "orse_id")
    private OrdemServicoEntity ordemServico;

    @ManyToOne
    @JoinColumn(name = "mate_id")
    private MaterialEntity material;

    @Column(name = "mate_dsmaterial")
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "unid_id")
    private UnidadeMedidaEntity unidadeMedida;

    @Column(name = "unid_dsunidade")
    private String unidadeDescricao;

    @Column(name = "osmu_nnquantidade")
    private Float quantidade;

    public OrdemServicoMaterialEntity() {
    }
}