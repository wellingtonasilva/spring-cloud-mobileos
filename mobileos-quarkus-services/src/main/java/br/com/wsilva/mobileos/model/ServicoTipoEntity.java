package br.com.wsilva.mobileos.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "mos_servico_tipo")
public class ServicoTipoEntity {

    @Id
    @Column(name = "svtp_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "svtp_dsservicotipo")
    private String descricao;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServicoTipoEntity that = (ServicoTipoEntity) o;
        return id == that.id &&
                Objects.equals(descricao, that.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, descricao);
    }
}
