package br.com.wsilva.mobileos.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "mos_veiculo")
@Data
public class VeiculoEntity {
    @Id
    @Column(name = "veic_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToMany
    @JoinColumn(name = "vemr_id")
    private VeiculoMarcaEntity veiculoMarca;

    @ManyToMany
    @JoinColumn(name = "vemo_id")
    private VeiculoModeloEntity veiculoModelo;

    @ManyToMany
    @JoinColumn(name = "vetp_id")
    private VeiculoTipoEntity veiculoTipo;

    @ManyToMany
    @JoinColumn(name = "empr_id")
    private EmpresaEntity empresa;

    @Column(name = "veic_nnplaca", length = 20)
    private String numeroPlaca;

    @Column(name = "veic_nnkmacumulada")
    private Float kmAcumulada;

    @Temporal(TemporalType.DATE)
    @Column(name = "veic_dtultimarevisao")
    private Date dataUltimaRevisao;

    @Temporal(TemporalType.DATE)
    @Column(name = "veic_dtproximarevisao")
    private Date dataProximaRevisao;

    public VeiculoEntity() {
    }

}

