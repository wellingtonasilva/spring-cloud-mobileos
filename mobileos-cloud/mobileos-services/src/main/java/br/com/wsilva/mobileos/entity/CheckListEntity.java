package br.com.wsilva.mobileos.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "mos_checklist")
@Data
public class CheckListEntity {
    @Id
    @Column(name = "chkl_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "chkl_dtmovimento")
    private Date dataMovimento;

    @Column(name = "chkl_dstipoveiculo", length = 60)
    private String descricaoTipoVeiculo;

    @Column(name = "chkl_nnmatricula")
    private Integer matricula;

    @Column(name = "chkl_nmcondutor", length = 60)
    private String nomeCondutor;

    @Column(name = "chkl_nmsetor", length = 60)
    private String setor;

    @Temporal(TemporalType.DATE)
    @Column(name = "chkl_dtsaida")
    private Date dataSaida;

    @Column(name = "chkl_nnkmsaida")
    private Float kmSaida;

    @Temporal(TemporalType.DATE)
    @Column(name = "chkl_dtretorno")
    private Date dataRetorno;

    @Column(name = "chkl_nnkmretorno")
    private Float kmRetorno;

    @Column(name = "chkl_icfinalizousaida")
    private Integer indicadorFinalizouSaida;

    @Column(name = "chkl_icfinalizouretorno")
    private Integer indicadorFinalizouRetorno;

    @Column(name = "chkl_nncnh")
    private Integer numeroCNH;

    @ManyToOne
    @JoinColumn(name = "veic_id")
    private VeiculoEntity veiculo;


    public CheckListEntity() {
    }

}

