package br.com.wsilva.mobileos.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "mos_hidrometro_tipo_instal")
@Data
public class HidrometroTipoInstalacaoEntity {
    @Id
    @Column(name = "htpi_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "empr_id")
    private EmpresaEntity empresa;

    @Column(name = "htpi_dstipoinstalacaohm")
    private String descricao;

    public HidrometroTipoInstalacaoEntity() {
    }
}