package br.com.wsilva.mobileos.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "mos_ordem_servico_corte")
@Data
public class OrdemServicoCorteEntity {
    @Id
    @Column(name = "osco_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "orse_id")
    private OrdemServicoEntity ordemServico;

    @ManyToOne
    @JoinColumn(name = "mcor_id")
    private MotivoCorteEntity motivoCorte;

    @ManyToOne
    @JoinColumn(name = "cotp_id")
    private CorteTipoEntity corteTipo;

    @ManyToOne
    @JoinColumn(name = "func_id")
    private FuncionarioEntity funcionario;

    @Column(name = "osco_dtcorte")
    private Date dataCorte;

    @Column(name = "osco_tmcorte", length = 10)
    private String horaCorte;

    @Column(name = "osco_nnleituracorte")
    private Integer leituraCorte;

    @Column(name = "osco_nnselocorte", length = 20)
    private String numeroSeloCorte;

    public OrdemServicoCorteEntity() {
    }
}