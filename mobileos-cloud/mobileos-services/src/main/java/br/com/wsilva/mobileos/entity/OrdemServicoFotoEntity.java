package br.com.wsilva.mobileos.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "mos_ordem_servico_foto")
@Data
public class OrdemServicoFotoEntity {
    @Id
    @Column(name = "osft_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "orse_id")
    private OrdemServicoEntity ordemServico;

    @Column(name = "osft_nmfoto")
    private String nomeFoto;

    @Column(name = "osft_dsfoto")
    private String descricao;

    @Column(name = "osft_nnlatitude")
    private String latitude;

    @Column(name = "osft_nnlongitude")
    private String longitude;

    @Column(name = "osft_dtfoto")
    private Date dataFoto;

    @Column(name = "osft_fttipo")
    private Integer fotoTipo;

    @Column(name = "osft_foto")
    private byte[] foto;

    public OrdemServicoFotoEntity() {
    }
}