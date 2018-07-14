package br.com.wsilva.mobileos.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "mos_ordem_servico_vala")
@Data
public class OrdemServicoValaEntity {
    @Id
    @Column(name = "osva_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "orse_id")
    private OrdemServicoEntity ordemServico;

    @ManyToOne
    @JoinColumn(name = "loco_id")
    private LocalOcorrenciaEntity localOcorrencia;

    @ManyToOne
    @JoinColumn(name = "pavt_id")
    private PavimentoTipoEntity pavimentoTipo;

    @Column(name = "osva_nnvala")
    private Integer numeroVala;

    @Column(name = "osva_nncomprimento")
    private Float comprimento;

    @Column(name = "osva_nnlargura")
    private Float largura;

    @Column(name = "osva_nnprofundidade")
    private Float profundidade;

    @Column(name = "osva_icaterro")
    private Integer indicadorAterro;

    @Column(name = "osva_icentulho")
    private Integer indicadorEntulho;

    @Column(name = "osva_nnbags")
    private Integer numeroBags;

    public OrdemServicoValaEntity() {
    }
}

