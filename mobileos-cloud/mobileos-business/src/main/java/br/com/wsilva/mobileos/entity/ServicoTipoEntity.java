package br.com.wsilva.mobileos.entity;

public class ServicoTipoEntity {
    private long id;
    private String descricao;

    public ServicoTipoEntity() {
    }

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
}

