package br.com.wsilva.mobileos.model;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "mos_servico_tipo")
@Data
public class ServicoTipoEntity {

    @Id
    @Column(name = "svtp_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "svtp_dsservicotipo")
    private String descricao;
}
