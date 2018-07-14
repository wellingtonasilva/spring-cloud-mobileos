package br.com.wsilva.mobileos.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "mos_empresa")
@Data
public class EmpresaEntity {
    @Id
    @Column(name = "empr_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "empr_nmrazaosocial")
    private String razaoSocial;

    @Column(name = "empr_nmfantasia")
    private String nomeFantasia;

    @Column(name = "empr_dsendereco")
    private String endereco;

    @Column(name = "empr_dscomplemento")
    private String complemento;

    @Column(name = "empr_nmbairro")
    private String bairro;

    @Column(name = "empr_nmcidade")
    private String cidade;

    @Column(name = "empr_coduf")
    private String uf;

    @Column(name = "empr_codcep")
    private String cep;

    @Column(name = "empr_nncnpj")
    private String cnpj;

    @Column(name = "empr_nntelefone")
    private String telefone;

    @Column(name = "empr_dsemail")
    private String email;

    public EmpresaEntity() {
    }
}