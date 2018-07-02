-- Generated by Oracle SQL Developer Data Modeler 18.1.0.082.1035
--   at:        2018-07-01 20:20:39 AMT
--   site:      Oracle9i
--   type:      Oracle9i



CREATE TABLE mos_checklist (
    chkl_id                   INTEGER NOT NULL,
    chkl_dtmovimento          TIMESTAMP WITHOUT TIME ZONE,
    chkl_dstipoveiculo        VARCHAR(60),
    chkl_nnmatricula          INTEGER,
    chkl_nmcondutor           VARCHAR(60),
    chkl_nmsetor              VARCHAR(60),
    chkl_dtsaida              TIMESTAMP WITHOUT TIME ZONE,
    chkl_nnkmsaida            FLOAT,
    chkl_dtretorno            TIMESTAMP WITHOUT TIME ZONE,
    chkl_nnkmretorno          FLOAT,
    chkl_nnplacaveiculo       VARCHAR(20),
    chkl_icfinalizousaida     SMALLINT,
    chkl_icfinalizouretorno   SMALLINT,
    chkl_nncnh                VARCHAR(20),
    mos_veiculo_veic_id       INTEGER NOT NULL
)
LOGGING;

ALTER TABLE mos_checklist ADD CONSTRAINT mos_checklist_pk PRIMARY KEY ( chkl_id );

CREATE TABLE mos_checklist_grupo (
    chgr_id                 INTEGER NOT NULL,
    chgr_dschecklistgrupo   VARCHAR(60)
)
LOGGING;

ALTER TABLE mos_checklist_grupo ADD CONSTRAINT mos_checklist_grupo_pk PRIMARY KEY ( chgr_id );

CREATE TABLE mos_checklist_item (
    chit_id                INTEGER NOT NULL,
    chgr_id                INTEGER NOT NULL,
    chit_dschecklistitem   VARCHAR(60)
)
LOGGING;

ALTER TABLE mos_checklist_item ADD CONSTRAINT mos_checklist_item_pk PRIMARY KEY ( chit_id );

CREATE TABLE mos_checklist_item_opcao (
    chio_id                     INTEGER NOT NULL,
    chit_id                     INTEGER NOT NULL,
    chio_dschecklistitemopcao   VARCHAR(60)
)
LOGGING;

ALTER TABLE mos_checklist_item_opcao ADD CONSTRAINT mos_checklist_item_opcao_pk PRIMARY KEY ( chio_id );

CREATE TABLE mos_checklist_resposta (
    chre_id                 INTEGER NOT NULL,
    chre_dtmovimento        TIMESTAMP WITHOUT TIME ZONE,
    chre_nnplacaveiculo     VARCHAR(20),
    chre_tmsaida            TIMESTAMP WITHOUT TIME ZONE,
    chre_tmretorno          VARCHAR 
--  ERROR: VARCHAR size not specified 
   ,
    chio_idsaida            INTEGER NOT NULL,
    chio_idretorno          INTEGER NOT NULL,
    mos_checklist_chkl_id   INTEGER NOT NULL
)
LOGGING;

ALTER TABLE mos_checklist_resposta ADD CONSTRAINT mos_checklist_resposta_pk PRIMARY KEY ( chre_id );

CREATE TABLE mos_corte_tipo (
    cotp_id            INTEGER NOT NULL,
    empr_id            INTEGER NOT NULL,
    cotp_dscortetipo   VARCHAR(60)
)
LOGGING;

ALTER TABLE mos_corte_tipo ADD CONSTRAINT mos_corte_tipo_pk PRIMARY KEY ( cotp_id );

CREATE TABLE mos_empresa (
    empr_id              INTEGER NOT NULL,
    empr_nmrazaosocial   VARCHAR(60),
    empr_nmfantasia      VARCHAR(60),
    empr_dsendereco      VARCHAR(60),
    empr_dscomplemento   VARCHAR(60),
    empr_nmbairro        VARCHAR(30),
    empr_nmcidade        VARCHAR(30),
    empr_coduf           VARCHAR(2),
    empr_codcep          VARCHAR(11),
    empr_nncnpj          VARCHAR(20),
    empr_nntelefone      VARCHAR(20),
    empr_dsemail         VARCHAR(100)
)
LOGGING;

ALTER TABLE mos_empresa ADD CONSTRAINT mos_empresa_pk PRIMARY KEY ( empr_id );

CREATE TABLE mos_equipe (
    eqpe_id                     INTEGER NOT NULL,
    empr_id                     INTEGER NOT NULL,
    eqpe_nmequipe               VARCHAR(60),
    eqpe_nnplacaveiculo         VARCHAR(20),
    eqpe_cargahorariotrabalho   SMALLINT
)
LOGGING;

ALTER TABLE mos_equipe ADD CONSTRAINT mos_equipe_pk PRIMARY KEY ( eqpe_id );

CREATE TABLE mos_equipe_componentes (
    eqpc_id              INTEGER NOT NULL,
    eqpe_id              INTEGER NOT NULL,
    func_id              INTEGER NOT NULL,
    eqpc_icresponsavel   VARCHAR(1)
)
LOGGING;

ALTER TABLE mos_equipe_componentes ADD CONSTRAINT mos_equipe_componentes_pk PRIMARY KEY ( eqpc_id );

CREATE TABLE mos_funcionario (
    func_id              INTEGER NOT NULL,
    empr_id              INTEGER NOT NULL,
    func_nnmatricula     INTEGER,
    func_nmfuncionario   VARCHAR(60),
    func_nncnh           VARCHAR(20)
)
LOGGING;

ALTER TABLE mos_funcionario ADD CONSTRAINT mos_funcionario_pk PRIMARY KEY ( func_id );

CREATE TABLE mos_hidrometro_local_armaz (
    hdla_id                   INTEGER NOT NULL,
    empr_id                   INTEGER NOT NULL,
    hdla_dslocalarmazenagem   VARCHAR(60)
)
LOGGING;

ALTER TABLE mos_hidrometro_local_armaz ADD CONSTRAINT mos_hidrometro_local_armaz_pk PRIMARY KEY ( hdla_id );

CREATE TABLE mos_hidrometro_local_inst (
    hloi_id                  INTEGER NOT NULL,
    empr_id                  INTEGER NOT NULL,
    hloi_dslocalinstalacao   VARCHAR(60)
)
LOGGING;

--  ERROR: PK name length exceeds maximum allowed length(30) 
ALTER TABLE mos_hidrometro_local_inst ADD CONSTRAINT mos_hidrometro_local_instalacao_pk PRIMARY KEY ( hloi_id );

CREATE TABLE mos_hidrometro_protecao (
    hpro_id           INTEGER NOT NULL,
    empr_id           INTEGER NOT NULL,
    hpro_dsprotecao   VARCHAR(60)
)
LOGGING;

ALTER TABLE mos_hidrometro_protecao ADD CONSTRAINT mos_hidrometro_protecao_pk PRIMARY KEY ( hpro_id );

CREATE TABLE mos_hidrometro_situacao (
    hdst_id                 INTEGER NOT NULL,
    empr_id                 INTEGER NOT NULL,
    hdst_dstiposituacaohm   VARCHAR(60)
)
LOGGING;

ALTER TABLE mos_hidrometro_situacao ADD CONSTRAINT mos_hidrometro_situacao_pk PRIMARY KEY ( hdst_id );

CREATE TABLE mos_hidrometro_tipo_instal (
    htpi_id                   INTEGER NOT NULL,
    empr_id                   INTEGER NOT NULL,
    htpi_dstipoinstalacaohm   VARCHAR(60)
)
LOGGING;

ALTER TABLE mos_hidrometro_tipo_instal ADD CONSTRAINT mos_hidrometro_tipo_instal_pk PRIMARY KEY ( htpi_id );

CREATE TABLE mos_hidrometro_tipo_subs (
    hits_id                   INTEGER NOT NULL,
    empr_id                   INTEGER NOT NULL,
    hits_dstiposubstituicao   VARCHAR(60)
)
LOGGING;

ALTER TABLE mos_hidrometro_tipo_subs ADD CONSTRAINT mos_hidrometro_tipo_subs_pk PRIMARY KEY ( hits_id );

CREATE TABLE mos_imovel (
    imov_id                      INTEGER NOT NULL,
    empr_id                      INTEGER NOT NULL,
    legs_id                      INTEGER NOT NULL,
    lags_id                      INTEGER NOT NULL,
    imov_nninscricao             VARCHAR(30),
    imov_nmclienteresponsavel    VARCHAR(60),
    imov_nmclienteusuario        VARCHAR(60),
    imov_nmclienteproprietario   VARCHAR(60),
    imov_nncortes                INTEGER,
    imov_nnsupressoes            INTEGER,
    imov_nnreparcelamentos       INTEGER,
    imov_nndiavencimento         INTEGER,
    imov_icsituacaocobranca      SMALLINT,
    imov_icsituacaofaturamento   SMALLINT,
    imov_nnrota                  SMALLINT,
    imov_nnsequenciarota         SMALLINT,
    imov_dtligacao               TIMESTAMP WITHOUT TIME ZONE,
    imov_nnhidrometro            VARCHAR(20),
    imov_dtinstalacaohm          TIMESTAMP WITHOUT TIME ZONE
)
LOGGING;

ALTER TABLE mos_imovel ADD CONSTRAINT mos_imovel_pk PRIMARY KEY ( imov_id );

CREATE TABLE mos_interrupcao (
    inte_id                    INTEGER NOT NULL,
    inmo_id                    INTEGER NOT NULL,
    empr_id                    INTEGER NOT NULL,
    eqpe_id                    INTEGER NOT NULL,
    inte_dtmovimento           TIMESTAMP WITHOUT TIME ZONE,
    inte_nmequipe              VARCHAR(60),
    inte_nnmatricula           INTEGER,
    inte_nnos                  INTEGER,
    inte_dsinterrupcaomotivo   VARCHAR(60),
    inte_dsobervacaoinicio     VARCHAR(400),
    inte_dsobervacaofim        VARCHAR(400),
    inte_dtinicio              DATE,
    inte_hrinicio              VARCHAR(10),
    inte_dtfim                 DATE,
    inte_hrfim                 VARCHAR(10),
    inte_icenviousmsinicio     SMALLINT,
    inte_icenviousmsfim        SMALLINT
)
LOGGING;

ALTER TABLE mos_interrupcao ADD CONSTRAINT mos_interrupcao_pk PRIMARY KEY ( inte_id );

CREATE TABLE mos_interrupcao_motivo (
    inmo_id                    INTEGER NOT NULL,
    empr_id                    INTEGER NOT NULL,
    inmo_dsinterrupcaomotivo   VARCHAR(60),
    inmo_dsabreviado           VARCHAR(5),
    inmo_icenviarsmsinicio     SMALLINT,
    inmo_icenviarsmsfim        SMALLINT,
    inmo_icinicioatividade     SMALLINT,
    inmo_icchecklistsaida      SMALLINT,
    inmo_icchecklistretorno    SMALLINT,
    inmo_icsolicitakminicio    SMALLINT,
    inmo_iccsolicitakmfim      SMALLINT
)
LOGGING;

ALTER TABLE mos_interrupcao_motivo ADD CONSTRAINT mos_interrupcao_motivo_pk PRIMARY KEY ( inmo_id );

CREATE TABLE mos_ligacao_agua_situacao (
    lags_id                      INTEGER NOT NULL,
    empr_id                      INTEGER NOT NULL,
    lags_dsligacaosituacaoagua   VARCHAR(60)
)
LOGGING;

ALTER TABLE mos_ligacao_agua_situacao ADD CONSTRAINT mos_ligacao_agua_situacao_pk PRIMARY KEY ( lags_id );

CREATE TABLE mos_ligacao_esgoto_situacao (
    legs_id                        INTEGER NOT NULL,
    empr_id                        INTEGER NOT NULL,
    legs_dsligacaoesgotosituacao   VARCHAR(60)
)
LOGGING;

ALTER TABLE mos_ligacao_esgoto_situacao ADD CONSTRAINT mos_ligacao_esgoto_situacao_pk PRIMARY KEY ( legs_id );

CREATE TABLE mos_local_ocorrencia (
    loco_id                  INTEGER NOT NULL,
    empr_id                  INTEGER NOT NULL,
    loco_dslocalocorrencia   VARCHAR(60)
)
LOGGING;

ALTER TABLE mos_local_ocorrencia ADD CONSTRAINT mos_local_ocorrencia_pk PRIMARY KEY ( loco_id );

CREATE TABLE mos_material (
    mate_id           INTEGER NOT NULL,
    empr_id           INTEGER NOT NULL,
    mate_dsmaterial   VARCHAR(60),
    unid_id           INTEGER NOT NULL,
    mate_dsunidade    VARCHAR(60)
)
LOGGING;

ALTER TABLE mos_material ADD CONSTRAINT mos_material_pk PRIMARY KEY ( mate_id );

CREATE TABLE mos_motivo_corte (
    mcor_id              INTEGER NOT NULL,
    empr_id              INTEGER NOT NULL,
    mcor_dsmotivocorte   VARCHAR(60)
)
LOGGING;

ALTER TABLE mos_motivo_corte ADD CONSTRAINT mos_motivo_corte_pk PRIMARY KEY ( mcor_id );

CREATE TABLE mos_motivo_encerramento (
    mote_id                     INTEGER NOT NULL,
    mote_dsmotivoencerramento   VARCHAR(60)
)
LOGGING;

ALTER TABLE mos_motivo_encerramento ADD CONSTRAINT mos_motivo_encerramento_pk PRIMARY KEY ( mote_id );

CREATE TABLE mos_ordem_servico (
    orse_id                       INTEGER NOT NULL,
    empr_id                       INTEGER NOT NULL,
    orse_cdsituacao               INTEGER,
    orse_dssituacao               VARCHAR(25),
    orse_tmgeracao                TIMESTAMP WITHOUT TIME ZONE,
    orse_dsobservacao             VARCHAR(400),
    rgat_id                       INTEGER,
    rgat_cdsituacao               INTEGER,
    rgat_dssituacao               VARCHAR(25),
    rgat_tmregistroatendimento    TIMESTAMP WITHOUT TIME ZONE,
    rgat_dsobservacao             VARCHAR(400),
    svtp_id                       INTEGER NOT NULL,
    logr_nmlogradouro             VARCHAR(60),
    bair_nmbairro                 VARCHAR(60),
    rgat_nnimovel                 VARCHAR(20),
    clie_id                       INTEGER,
    imov_id                       INTEGER,
    clie_nmcliente                VARCHAR(60),
    svtp_idexecutado              INTEGER NOT NULL,
    orse_tmencerramento           TIMESTAMP WITHOUT TIME ZONE,
    mote_id                       INTEGER NOT NULL,
    orse_dsparecerencerramento    VARCHAR(400),
    orse_dtexecucao               NUMBER,
    orse_tmexecucao_inicio        VARCHAR(10),
    orse_tmexecucao_fim           VARCHAR(10),
    eqpe_idexecucao               INTEGER NOT NULL,
    orse_nnprofunidaderede        VARCHAR(25),
    orse_nnpressaorede            VARCHAR(25),
    orse_tmcancelamento           TIMESTAMP WITHOUT TIME ZONE,
    svtp_idgerar                  INTEGER NOT NULL,
    orse_nnkminicial              INTEGER,
    orse_nnkmfinal                INTEGER,
    orse_dtprogramacao            TIMESTAMP WITHOUT TIME ZONE,
    eqpe_idprogramada             INTEGER NOT NULL,
    hidr_nnanofabricacao          INTERVAL DAY(9) TO SECOND(0),
    hidr_nnhidrometro             VARCHAR(20),
    rgat_dscomplementoendereco    VARCHAR(60),
    hidi_dtinstalacaohidrometro   TIMESTAMP WITHOUT TIME ZONE,
    hidi_nnselo                   VARCHAR(20),
    imov_nnlote                   INTEGER,
    qdra_nnquadra                 VARCHAR(10),
    imov_nnsequencialrota         INTEGER,
    imov_nnsublote                INTEGER,
    stcm_id                       INTEGER
)
LOGGING;

COMMENT ON COLUMN mos_ordem_servico.orse_id IS
    'Id. da tabela';

ALTER TABLE mos_ordem_servico ADD CONSTRAINT mos_ordem_servico_pk PRIMARY KEY ( orse_id );

CREATE TABLE mos_ordem_servico_corte (
    osco_id               INTEGER NOT NULL,
    orse_id               INTEGER NOT NULL,
    mcor_id               INTEGER NOT NULL,
    cotp_id               INTEGER NOT NULL,
    func_id               INTEGER NOT NULL,
    osco_dtcorte          TIMESTAMP WITHOUT TIME ZONE,
    osco_tmcorte          VARCHAR(10),
    osco_nnleituracorte   INTEGER,
    osco_nnselocorte      VARCHAR(20)
)
LOGGING;

ALTER TABLE mos_ordem_servico_corte ADD CONSTRAINT mos_ordem_servico_corte_pk PRIMARY KEY ( osco_id );

CREATE TABLE mos_ordem_servico_foto (
    osft_id            INTEGER NOT NULL,
    orse_id            INTEGER NOT NULL,
    osft_nmfoto        VARCHAR(60),
    osft_dsfoto        VARCHAR(60),
    osft_nnlatitude    VARCHAR(25),
    osft_nnlongitude   VARCHAR(25),
    osft_dtfoto        TIMESTAMP WITHOUT TIME ZONE,
    osft_fttipo        SMALLINT,
    osft_foto          BLOB
)
LOGGING;

ALTER TABLE mos_ordem_servico_foto ADD CONSTRAINT mos_ordem_servico_foto_pk PRIMARY KEY ( osft_id );

CREATE TABLE mos_ordem_servico_insthm (
    osih_id                    INTEGER NOT NULL,
    orse_id                    INTEGER NOT NULL,
    hloi_id                    INTEGER NOT NULL,
    hpro_id                    INTEGER NOT NULL,
    htpi_id                    INTEGER NOT NULL,
    osih_dtinstalacao          TIMESTAMP WITHOUT TIME ZONE,
    osih_ictipoprotecao        VARCHAR(1),
    osih_ictrocaprotecao       SMALLINT,
    osih_ictrocaregistro       SMALLINT,
    osih_nnleiturainstalacao   INTEGER,
    osih_nnselo                VARCHAR(20),
    osih_iccavalete            VARCHAR(1)
)
LOGGING;

COMMENT ON COLUMN mos_ordem_servico_insthm.hloi_id IS
    'Local de Instalação do Hidrometro';

ALTER TABLE mos_ordem_servico_insthm ADD CONSTRAINT mos_ordem_servico_insthm_pk PRIMARY KEY ( osih_id );

CREATE TABLE mos_ordem_servico_material (
    osmu_id             INTEGER NOT NULL,
    orse_id             INTEGER NOT NULL,
    mate_id             INTEGER NOT NULL,
    mate_dsmaterial     VARCHAR(60),
    unid_id             INTEGER NOT NULL,
    unid_dsunidade      VARCHAR(60),
    osmu_nnquantidade   FLOAT
)
LOGGING;

ALTER TABLE mos_ordem_servico_material ADD CONSTRAINT mos_ordem_servico_material_pk PRIMARY KEY ( osmu_id );

CREATE TABLE mos_ordem_servico_religacao (
    osre_id                   INTEGER NOT NULL,
    orse_id                   INTEGER NOT NULL,
    osre_dtreligacao          TIMESTAMP WITHOUT TIME ZONE,
    osre_tmreligacao          VARCHAR(10),
    osre_nnhidrometro         VARCHAR(20),
    osre_dtinstalacao         TIMESTAMP WITHOUT TIME ZONE,
    osre_nneiturainstalacao   INTEGER,
    osre_nnselo               VARCHAR(20),
    osre_iccavelete           VARCHAR(1),
    osre_ictrocaprotecao      SMALLINT,
    osre_ictrocaregistro      SMALLINT,
    hloi_id                   INTEGER NOT NULL,
    hpro_id                   INTEGER NOT NULL,
    retp_id                   INTEGER NOT NULL
)
LOGGING;

COMMENT ON COLUMN mos_ordem_servico_religacao.osre_id IS
    'Id. da tabela';

ALTER TABLE mos_ordem_servico_religacao ADD CONSTRAINT mos_ordem_servico_religacao_pk PRIMARY KEY ( osre_id );

CREATE TABLE mos_ordem_servico_subshm (
    ossh_id                    INTEGER NOT NULL,
    orse_id                    INTEGER NOT NULL,
    ossh_nnhidrometroatual     VARCHAR(20),
    ossh_ictipomedicaoatual    SMALLINT,
    ossh_dtretirada            TIMESTAMP WITHOUT TIME ZONE,
    ossh_nnleituraretirada     INTEGER,
    hdst_id                    INTEGER NOT NULL,
    hdla_id                    INTEGER NOT NULL,
    ossh_nnhidrometronovo      VARCHAR(20),
    ossh_dtinstalacao          TIMESTAMP WITHOUT TIME ZONE,
    ossh_ictipomedicao         SMALLINT,
    hloi_id                    INTEGER NOT NULL,
    hpro_id                    INTEGER NOT NULL,
    ossh_ictrocaprotecao       SMALLINT,
    ossh_ictrocaregistro       SMALLINT,
    ossh_nnleiturainstalacao   INTEGER,
    ossh_nnselo                VARCHAR(20),
    ossh_iccavalete            VARCHAR(1),
    hits_id                    INTEGER NOT NULL,
    ossh_tminstalacao          VARCHAR(10)
)
LOGGING;

COMMENT ON COLUMN mos_ordem_servico_subshm.hdst_id IS
    'Situação do Hidrometro';

COMMENT ON COLUMN mos_ordem_servico_subshm.hdla_id IS
    'Local de Armazenagem do Hidrometro';

COMMENT ON COLUMN mos_ordem_servico_subshm.hloi_id IS
    'Local de Instalação do Hidrometro';

COMMENT ON COLUMN mos_ordem_servico_subshm.hpro_id IS
    'Proteção do Hidrômetro';

COMMENT ON COLUMN mos_ordem_servico_subshm.hits_id IS
    'Tipo Substituição';

ALTER TABLE mos_ordem_servico_subshm ADD CONSTRAINT mos_ordem_servico_subshm_pk PRIMARY KEY ( ossh_id );

CREATE TABLE mos_ordem_servico_vala (
    osva_id               INTEGER NOT NULL,
    orse_id               INTEGER NOT NULL,
    loco_id               INTEGER NOT NULL,
    pavt_id               INTEGER NOT NULL,
    osva_nnvala           SMALLINT,
    osva_nncomprimento    FLOAT,
    osva_nnlargura        FLOAT,
    osva_nnprofundidade   FLOAT,
    osva_icaterro         SMALLINT,
    osva_icentulho        SMALLINT,
    osva_nnbags           SMALLINT
)
LOGGING;

ALTER TABLE mos_ordem_servico_vala ADD CONSTRAINT mos_ordem_servico_vala_pk PRIMARY KEY ( osva_id );

CREATE TABLE mos_pavimento_tipo (
    pavt_id                INTEGER NOT NULL,
    empr_id                INTEGER NOT NULL,
    pavt_dspavimentotipo   VARCHAR(60)
)
LOGGING;

ALTER TABLE mos_pavimento_tipo ADD CONSTRAINT mos_pavimento_tipo_pk PRIMARY KEY ( pavt_id );

CREATE TABLE mos_religacao_tipo (
    retp_id                INTEGER NOT NULL,
    empr_id                INTEGER NOT NULL,
    rept_dsreligacaotipo   VARCHAR(60)
)
LOGGING;

ALTER TABLE mos_religacao_tipo ADD CONSTRAINT mos_religacao_tipo_pk PRIMARY KEY ( retp_id );

CREATE TABLE mos_servico_tipo (
    svtp_id              INTEGER NOT NULL,
    svtp_dsservicotipo   VARCHAR(60)
)
LOGGING;

ALTER TABLE mos_servico_tipo ADD CONSTRAINT mos_servico_tipo_pk PRIMARY KEY ( svtp_id );

CREATE TABLE mos_servico_tipo_especificacao (
    step_id                  INTEGER NOT NULL,
    svtp_id                  INTEGER NOT NULL,
    step_dssolicitacaotipo   VARCHAR(60)
)
LOGGING;

--  ERROR: PK name length exceeds maximum allowed length(30) 
ALTER TABLE mos_servico_tipo_especificacao ADD CONSTRAINT mos_servico_tipo_especificacao_pk PRIMARY KEY ( step_id );

CREATE TABLE mos_unidade_medida (
    unid_id          INTEGER NOT NULL,
    empr_id          INTEGER NOT NULL,
    unid_dsunidade   VARCHAR(60)
)
LOGGING;

ALTER TABLE mos_unidade_medida ADD CONSTRAINT mos_unidade_medida_pk PRIMARY KEY ( unid_id );

CREATE TABLE mos_veiculo (
    veic_id                 INTEGER NOT NULL,
    vemr_id                 INTEGER NOT NULL,
    vemo_id                 INTEGER NOT NULL,
    vetp_id                 INTEGER NOT NULL,
    empr_id                 INTEGER NOT NULL,
    veic_nnplaca            VARCHAR(20),
    veic_nnkmacumulada      FLOAT,
    veic_dtultimarevisao    TIMESTAMP WITHOUT TIME ZONE,
    veic_dtproximarevisao   TIMESTAMP WITHOUT TIME ZONE
)
LOGGING;

ALTER TABLE mos_veiculo ADD CONSTRAINT mos_veiculo_pk PRIMARY KEY ( veic_id );

CREATE TABLE mos_veiculo_marca (
    vemr_id               INTEGER NOT NULL,
    empr_id               INTEGER NOT NULL,
    vemr_dsveiculomarca   VARCHAR(60)
)
LOGGING;

ALTER TABLE mos_veiculo_marca ADD CONSTRAINT mos_veiculo_marca_pk PRIMARY KEY ( vemr_id );

CREATE TABLE mos_veiculo_modelo (
    vemo_id                INTEGER NOT NULL,
    empr_id                INTEGER NOT NULL,
    vemo_dsveiculomodelo   VARCHAR(60)
)
LOGGING;

ALTER TABLE mos_veiculo_modelo ADD CONSTRAINT mos_veiculo_modelo_pk PRIMARY KEY ( vemo_id );

CREATE TABLE mos_veiculo_tipo (
    vetp_id              INTEGER NOT NULL,
    empr_id              INTEGER NOT NULL,
    vetp_dsveiculotipo   VARCHAR(60)
)
LOGGING;

ALTER TABLE mos_veiculo_tipo ADD CONSTRAINT mos_veiculo_tipo_pk PRIMARY KEY ( vetp_id );

ALTER TABLE mos_veiculo_tipo
    ADD CONSTRAINT mos_veiculo_tipo FOREIGN KEY ( empr_id )
        REFERENCES mos_empresa ( empr_id );

ALTER TABLE mos_checklist
    ADD CONSTRAINT xfk1_checklist FOREIGN KEY ( mos_veiculo_veic_id )
        REFERENCES mos_veiculo ( veic_id );

ALTER TABLE mos_checklist_item
    ADD CONSTRAINT xfk1_checklist_item FOREIGN KEY ( chgr_id )
        REFERENCES mos_checklist_grupo ( chgr_id );

ALTER TABLE mos_checklist_item_opcao
    ADD CONSTRAINT xfk1_checklist_item_opcao FOREIGN KEY ( chit_id )
        REFERENCES mos_checklist_item ( chit_id );

ALTER TABLE mos_checklist_resposta
    ADD CONSTRAINT xfk1_checklist_resposta FOREIGN KEY ( chio_idsaida )
        REFERENCES mos_checklist_item_opcao ( chio_id );

ALTER TABLE mos_corte_tipo
    ADD CONSTRAINT xfk1_corte_tipo FOREIGN KEY ( empr_id )
        REFERENCES mos_empresa ( empr_id );

ALTER TABLE mos_equipe
    ADD CONSTRAINT xfk1_equipe FOREIGN KEY ( empr_id )
        REFERENCES mos_empresa ( empr_id );

ALTER TABLE mos_equipe_componentes
    ADD CONSTRAINT xfk1_equipe_componentes FOREIGN KEY ( func_id )
        REFERENCES mos_funcionario ( func_id );

ALTER TABLE mos_hidrometro_local_armaz
    ADD CONSTRAINT xfk1_hidrometro_local_armaz FOREIGN KEY ( empr_id )
        REFERENCES mos_empresa ( empr_id );

ALTER TABLE mos_hidrometro_protecao
    ADD CONSTRAINT xfk1_hidrometro_protecao FOREIGN KEY ( empr_id )
        REFERENCES mos_empresa ( empr_id );

ALTER TABLE mos_hidrometro_situacao
    ADD CONSTRAINT xfk1_hidrometro_situacao FOREIGN KEY ( empr_id )
        REFERENCES mos_empresa ( empr_id );

ALTER TABLE mos_imovel
    ADD CONSTRAINT xfk1_imovel FOREIGN KEY ( empr_id )
        REFERENCES mos_empresa ( empr_id );

ALTER TABLE mos_imovel
    ADD CONSTRAINT xfk1_imovelv2 FOREIGN KEY ( legs_id )
        REFERENCES mos_ligacao_esgoto_situacao ( legs_id );

ALTER TABLE mos_interrupcao
    ADD CONSTRAINT xfk1_interrupcao FOREIGN KEY ( inmo_id )
        REFERENCES mos_interrupcao_motivo ( inmo_id );

ALTER TABLE mos_interrupcao_motivo
    ADD CONSTRAINT xfk1_interrupcao_motivo FOREIGN KEY ( empr_id )
        REFERENCES mos_empresa ( empr_id );

ALTER TABLE mos_ligacao_agua_situacao
    ADD CONSTRAINT xfk1_ligacao_agua_situacao FOREIGN KEY ( empr_id )
        REFERENCES mos_empresa ( empr_id );

ALTER TABLE mos_ligacao_esgoto_situacao
    ADD CONSTRAINT xfk1_ligacao_esgoto_situacao FOREIGN KEY ( empr_id )
        REFERENCES mos_empresa ( empr_id );

ALTER TABLE mos_local_ocorrencia
    ADD CONSTRAINT xfk1_local_ocorrencia FOREIGN KEY ( empr_id )
        REFERENCES mos_empresa ( empr_id );

ALTER TABLE mos_material
    ADD CONSTRAINT xfk1_material FOREIGN KEY ( empr_id )
        REFERENCES mos_empresa ( empr_id );

ALTER TABLE mos_motivo_corte
    ADD CONSTRAINT xfk1_motivo_corte FOREIGN KEY ( empr_id )
        REFERENCES mos_empresa ( empr_id );

ALTER TABLE mos_ordem_servico
    ADD CONSTRAINT xfk1_ordem_servico FOREIGN KEY ( svtp_id )
        REFERENCES mos_servico_tipo ( svtp_id );

ALTER TABLE mos_ordem_servico_corte
    ADD CONSTRAINT xfk1_ordem_servico_corte FOREIGN KEY ( mcor_id )
        REFERENCES mos_motivo_corte ( mcor_id );

ALTER TABLE mos_ordem_servico_foto
    ADD CONSTRAINT xfk1_ordem_servico_foto FOREIGN KEY ( orse_id )
        REFERENCES mos_ordem_servico ( orse_id );

ALTER TABLE mos_ordem_servico_insthm
    ADD CONSTRAINT xfk1_ordem_servico_insthm FOREIGN KEY ( orse_id )
        REFERENCES mos_ordem_servico ( orse_id );

ALTER TABLE mos_ordem_servico_material
    ADD CONSTRAINT xfk1_ordem_servico_material FOREIGN KEY ( mate_id )
        REFERENCES mos_material ( mate_id );

ALTER TABLE mos_ordem_servico_religacao
    ADD CONSTRAINT xfk1_ordem_servico_religacao FOREIGN KEY ( orse_id )
        REFERENCES mos_ordem_servico ( orse_id );

ALTER TABLE mos_ordem_servico_subshm
    ADD CONSTRAINT xfk1_ordem_servico_subshm FOREIGN KEY ( hdst_id )
        REFERENCES mos_hidrometro_situacao ( hdst_id );

ALTER TABLE mos_ordem_servico_vala
    ADD CONSTRAINT xfk1_ordem_servico_vala FOREIGN KEY ( loco_id )
        REFERENCES mos_local_ocorrencia ( loco_id );

ALTER TABLE mos_pavimento_tipo
    ADD CONSTRAINT xfk1_pavimento_tipo FOREIGN KEY ( empr_id )
        REFERENCES mos_empresa ( empr_id );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE mos_servico_tipo_especificacao
    ADD CONSTRAINT xfk1_servico_tipo_especificacao FOREIGN KEY ( svtp_id )
        REFERENCES mos_servico_tipo ( svtp_id );

ALTER TABLE mos_veiculo
    ADD CONSTRAINT xfk1_veiculo FOREIGN KEY ( vemr_id )
        REFERENCES mos_veiculo_marca ( vemr_id );

ALTER TABLE mos_veiculo_marca
    ADD CONSTRAINT xfk1_veiculo_marca FOREIGN KEY ( empr_id )
        REFERENCES mos_empresa ( empr_id );

ALTER TABLE mos_veiculo_modelo
    ADD CONSTRAINT xfk1_veiculo_modelo FOREIGN KEY ( empr_id )
        REFERENCES mos_empresa ( empr_id );

ALTER TABLE mos_checklist_resposta
    ADD CONSTRAINT xfk2_checklist_resposta FOREIGN KEY ( chio_idretorno )
        REFERENCES mos_checklist_item_opcao ( chio_id );

ALTER TABLE mos_hidrometro_tipo_subs
    ADD CONSTRAINT xfk2_hidrometro_tipo_subs FOREIGN KEY ( empr_id )
        REFERENCES mos_empresa ( empr_id );

ALTER TABLE mos_imovel
    ADD CONSTRAINT xfk2_imovel FOREIGN KEY ( lags_id )
        REFERENCES mos_ligacao_agua_situacao ( lags_id );

ALTER TABLE mos_interrupcao
    ADD CONSTRAINT xfk2_interrupcao FOREIGN KEY ( empr_id )
        REFERENCES mos_empresa ( empr_id );

ALTER TABLE mos_material
    ADD CONSTRAINT xfk2_material FOREIGN KEY ( unid_id )
        REFERENCES mos_unidade_medida ( unid_id );

ALTER TABLE mos_ordem_servico_corte
    ADD CONSTRAINT xfk2_ordem_servico_corte FOREIGN KEY ( cotp_id )
        REFERENCES mos_corte_tipo ( cotp_id );

ALTER TABLE mos_ordem_servico_insthm
    ADD CONSTRAINT xfk2_ordem_servico_insthm FOREIGN KEY ( hloi_id )
        REFERENCES mos_hidrometro_local_inst ( hloi_id );

ALTER TABLE mos_ordem_servico_material
    ADD CONSTRAINT xfk2_ordem_servico_material FOREIGN KEY ( unid_id )
        REFERENCES mos_unidade_medida ( unid_id );

ALTER TABLE mos_ordem_servico_religacao
    ADD CONSTRAINT xfk2_ordem_servico_religacao FOREIGN KEY ( hloi_id )
        REFERENCES mos_hidrometro_local_inst ( hloi_id );

ALTER TABLE mos_ordem_servico_subshm
    ADD CONSTRAINT xfk2_ordem_servico_subshm FOREIGN KEY ( hdla_id )
        REFERENCES mos_hidrometro_local_armaz ( hdla_id );

ALTER TABLE mos_ordem_servico_vala
    ADD CONSTRAINT xfk2_ordem_servico_vala FOREIGN KEY ( pavt_id )
        REFERENCES mos_pavimento_tipo ( pavt_id );

ALTER TABLE mos_veiculo
    ADD CONSTRAINT xfk2_veiculo FOREIGN KEY ( vemo_id )
        REFERENCES mos_veiculo_modelo ( vemo_id );

ALTER TABLE mos_checklist_resposta
    ADD CONSTRAINT xfk3_checklist_resposta FOREIGN KEY ( mos_checklist_chkl_id )
        REFERENCES mos_checklist ( chkl_id );

ALTER TABLE mos_interrupcao
    ADD CONSTRAINT xfk3_interrupcao FOREIGN KEY ( eqpe_id )
        REFERENCES mos_equipe ( eqpe_id );

ALTER TABLE mos_ordem_servico
    ADD CONSTRAINT xfk3_ordem_servico FOREIGN KEY ( svtp_idexecutado )
        REFERENCES mos_servico_tipo ( svtp_id );

ALTER TABLE mos_ordem_servico_insthm
    ADD CONSTRAINT xfk3_ordem_servico_insthm FOREIGN KEY ( hpro_id )
        REFERENCES mos_hidrometro_protecao ( hpro_id );

ALTER TABLE mos_ordem_servico_subshm
    ADD CONSTRAINT xfk3_ordem_servico_subshm FOREIGN KEY ( hloi_id )
        REFERENCES mos_hidrometro_local_inst ( hloi_id );

ALTER TABLE mos_veiculo
    ADD CONSTRAINT xfk3_veiculo FOREIGN KEY ( vetp_id )
        REFERENCES mos_veiculo_tipo ( vetp_id );

ALTER TABLE mos_ordem_servico
    ADD CONSTRAINT xfk4_ordem_servico FOREIGN KEY ( mote_id )
        REFERENCES mos_motivo_encerramento ( mote_id );

ALTER TABLE mos_ordem_servico_corte
    ADD CONSTRAINT xfk4_ordem_servico_corte FOREIGN KEY ( func_id )
        REFERENCES mos_funcionario ( func_id );

ALTER TABLE mos_ordem_servico_subshm
    ADD CONSTRAINT xfk4_ordem_servico_subshm FOREIGN KEY ( hpro_id )
        REFERENCES mos_hidrometro_protecao ( hpro_id );

ALTER TABLE mos_veiculo
    ADD CONSTRAINT xfk4_veiculo FOREIGN KEY ( empr_id )
        REFERENCES mos_empresa ( empr_id );

ALTER TABLE mos_ordem_servico
    ADD CONSTRAINT xfk5_ordem_servico FOREIGN KEY ( eqpe_idexecucao )
        REFERENCES mos_equipe ( eqpe_id );

ALTER TABLE mos_ordem_servico_subshm
    ADD CONSTRAINT xfk5_ordem_servico_subshm FOREIGN KEY ( hits_id )
        REFERENCES mos_hidrometro_tipo_subs ( hits_id );

ALTER TABLE mos_ordem_servico
    ADD CONSTRAINT xfk6_ordem_servico FOREIGN KEY ( svtp_idgerar )
        REFERENCES mos_servico_tipo ( svtp_id );

ALTER TABLE mos_ordem_servico
    ADD CONSTRAINT xfk7_ordem_servico FOREIGN KEY ( eqpe_idprogramada )
        REFERENCES mos_equipe ( eqpe_id );

ALTER TABLE mos_funcionario
    ADD CONSTRAINT xkf1_funcionario FOREIGN KEY ( empr_id )
        REFERENCES mos_empresa ( empr_id );

ALTER TABLE mos_hidrometro_local_inst
    ADD CONSTRAINT xkf1_hidrometro_local_inst FOREIGN KEY ( empr_id )
        REFERENCES mos_empresa ( empr_id );

ALTER TABLE mos_hidrometro_tipo_instal
    ADD CONSTRAINT xkf1_hidrometro_tipo_instal FOREIGN KEY ( empr_id )
        REFERENCES mos_empresa ( empr_id );

ALTER TABLE mos_religacao_tipo
    ADD CONSTRAINT xkf1_religacao_tipo FOREIGN KEY ( empr_id )
        REFERENCES mos_empresa ( empr_id );

ALTER TABLE mos_unidade_medida
    ADD CONSTRAINT xkf1_unidade_medida FOREIGN KEY ( empr_id )
        REFERENCES mos_empresa ( empr_id );

ALTER TABLE mos_equipe_componentes
    ADD CONSTRAINT xkf2_equipe_componentes FOREIGN KEY ( eqpe_id )
        REFERENCES mos_equipe ( eqpe_id );

ALTER TABLE mos_ordem_servico
    ADD CONSTRAINT xkf2_ordem_servico FOREIGN KEY ( empr_id )
        REFERENCES mos_empresa ( empr_id );

ALTER TABLE mos_ordem_servico_corte
    ADD CONSTRAINT xkf3_ordem_servico_corte FOREIGN KEY ( orse_id )
        REFERENCES mos_ordem_servico ( orse_id );

ALTER TABLE mos_ordem_servico_material
    ADD CONSTRAINT xkf3_ordem_servico_material FOREIGN KEY ( orse_id )
        REFERENCES mos_ordem_servico ( orse_id );

ALTER TABLE mos_ordem_servico_religacao
    ADD CONSTRAINT xkf3_ordem_servico_religacao FOREIGN KEY ( hpro_id )
        REFERENCES mos_hidrometro_protecao ( hpro_id );

ALTER TABLE mos_ordem_servico_vala
    ADD CONSTRAINT xkf3_ordem_servico_vala FOREIGN KEY ( orse_id )
        REFERENCES mos_ordem_servico ( orse_id );

ALTER TABLE mos_ordem_servico_insthm
    ADD CONSTRAINT xkf4_ordem_servico_insthm FOREIGN KEY ( htpi_id )
        REFERENCES mos_hidrometro_tipo_instal ( htpi_id );

ALTER TABLE mos_ordem_servico_religacao
    ADD CONSTRAINT xkf4_ordem_servico_religacao FOREIGN KEY ( retp_id )
        REFERENCES mos_religacao_tipo ( retp_id );

ALTER TABLE mos_ordem_servico_subshm
    ADD CONSTRAINT xkf6_ordem_servico_subshm FOREIGN KEY ( orse_id )
        REFERENCES mos_ordem_servico ( orse_id );



-- Oracle SQL Developer Data Modeler Summary Report: 
-- 
-- CREATE TABLE                            42
-- CREATE INDEX                             0
-- ALTER TABLE                            115
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          0
-- CREATE MATERIALIZED VIEW                 0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- ERRORS                                   4
-- WARNINGS                                 0