package br.com.wsilva.mobileos.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "mos_checklist_item_opcao")
@Data
public class CheckListItemOpcaoEntity {
    @Id
    @Column(name = "chio_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "chit_id")
    private CheckListItemEntity checkListItem;

    @Column(name = "chio_dschecklistitemopcao")
    private String descricao;

    public CheckListItemOpcaoEntity() {
    }
}