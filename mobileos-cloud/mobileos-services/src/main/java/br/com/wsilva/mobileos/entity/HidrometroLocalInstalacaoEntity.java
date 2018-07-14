package br.com.wsilva.mobileos.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "mos_hidrometro_local_inst")
@Data
public class HidrometroLocalInstalacaoEntity {
    @Id
    @Column(name = "hloi_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "empr_id")
    private EmpresaEntity empresa;

    @Column(name = "hloi_dslocalinstalacao")
    private String descricao;

    public HidrometroLocalInstalacaoEntity() {
    }
}
