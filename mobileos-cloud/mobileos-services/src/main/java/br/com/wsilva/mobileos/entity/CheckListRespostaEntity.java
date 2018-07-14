package br.com.wsilva.mobileos.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "mos_checklist_resposta")
@Data
public class CheckListRespostaEntity {
    @Id
    @Column(name = "chre_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "chre_dtmovimento")
    private Date dataMovimento;

    @Column(name = "chre_nnplacaveiculo", length = 20)
    private String numeroPlacaVeiculo;

    @Column(name = "chre_tmsaida", length = 10)
    private String horaSaida;

    @Column(name = "chre_tmretorno", length = 10)
    private String horaRetorno;

    @ManyToOne
    @JoinColumn(name = "chio_idsaida")
    private CheckListItemOpcaoEntity checkListItemOpcaoSaida;

    @ManyToOne
    @JoinColumn(name = "chio_idretorno")
    private CheckListItemOpcaoEntity checkListItemOpcaoRetorno;

    public CheckListRespostaEntity() {
    }
}
