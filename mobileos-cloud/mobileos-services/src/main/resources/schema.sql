CREATE TABLE mos_servico_tipo (
    svtp_id              BIGINT AUTO_INCREMENT PRIMARY KEY,
    svtp_dsservicotipo   VARCHAR(60)
);

CREATE TABLE mos_corte_tipo (
    cotp_id            BIGINT AUTO_INCREMENT PRIMARY KEY,
    empr_id            INTEGER NOT NULL,
    cotp_dscortetipo   VARCHAR(60)
);