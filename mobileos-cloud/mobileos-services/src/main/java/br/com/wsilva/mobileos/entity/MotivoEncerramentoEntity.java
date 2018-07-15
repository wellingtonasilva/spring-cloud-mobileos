package br.com.wsilva.mobileos.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "mos_motivo_encerramento")
@Data
public class MotivoEncerramentoEntity {
    @Id
    @Column(name = "mote_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "mote_dsmotivoencerramento")
    private String descricao;

    public MotivoEncerramentoEntity() {
    }
}