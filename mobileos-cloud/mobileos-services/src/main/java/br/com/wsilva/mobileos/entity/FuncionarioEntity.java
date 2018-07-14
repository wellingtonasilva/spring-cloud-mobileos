package br.com.wsilva.mobileos.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "mos_funcionario")
@Data
public class FuncionarioEntity {
    @Id
    @Column(name = "func_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "empr_id")
    private EmpresaEntity empresa;

    @Column(name = "func_nnmatricula")
    private Integer matricula;

    @Column(name = "func_nmfuncionario")
    private String nomeFuncionario;

    @Column(name = "func_nncnh")
    private String numeroCNH;

    public FuncionarioEntity() {
    }
}

