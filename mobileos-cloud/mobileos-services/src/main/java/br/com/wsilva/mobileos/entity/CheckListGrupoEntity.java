package br.com.wsilva.mobileos.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "mos_checklist_grupo")
@Data
public class CheckListGrupoEntity {
    @Id
    @Column(name = "chgr_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "chgr_dschecklistgrupo")
    private String descricao;

    public CheckListGrupoEntity() {
    }
}