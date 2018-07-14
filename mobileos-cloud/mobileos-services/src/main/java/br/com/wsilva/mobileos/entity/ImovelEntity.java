package br.com.wsilva.mobileos.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "mos_imovel")
@Data
public class ImovelEntity {
    @Id
    @Column(name = "imov_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "empr_id")
    private EmpresaEntity empresa;

    @ManyToOne
    @JoinColumn(name = "legs_id")
    private LigacaoEsgotoSituacaoEntity ligacaoEsgotoSituacao;

    @ManyToOne
    @JoinColumn(name = "lags_id")
    private LigacaoAguaSituacaoEntity ligacaoAguaSituacao;

    @Column(name = "imov_nninscricao")
    private String numeroInscricao;

    @Column(name = "imov_nmclienteresponsavel")
    private String clienteResponavel;

    @Column(name = "imov_nmclienteusuario")
    private String clienteUsuario;

    @Column(name = "imov_nmclienteproprietario")
    private String clienteProprietario;

    @Column(name = "imov_nncortes")
    private Integer numeroCortes;

    @Column(name = "imov_nnsupressoes")
    private Integer numeroSupressoes;

    @Column(name = "imov_nnreparcelamentos")
    private Integer numeroReparcelamentos;

    @Column(name = "imov_nndiavencimento")
    private Integer diaVencimento;

    @Column(name = "imov_icsituacaocobranca")
    private Integer indicadorSituacaoCobranca;

    @Column(name = "imov_icsituacaofaturamento")
    private Integer indicadorSituacaoFaturamento;

    @Column(name = "imov_nnrota")
    private Integer numeroRota;

    @Column(name = "imov_nnsequenciarota")
    private Integer sequenciaRota;

    @Column(name = "imov_dtligacao")
    private Integer dataLigacao;

    @Column(name = "imov_nnhidrometro")
    private String numeroHidromentro;

    @Column(name = "imov_dtinstalacaohm")
    private String dataInstalacaoHM;

    public ImovelEntity() {
    }
}



