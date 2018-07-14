package br.com.wsilva.mobileos.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "mos_checklist_item")
@Data
public class CheckListItemEntity {
    @Id
    @Column(name = "chit_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "chgr_id")
    private CheckListGrupoEntity checkListGrupo;

    @Column(name = "chit_dschecklistitem", length = 60)
    private String descricao;

    public CheckListItemEntity() {
    }
}
