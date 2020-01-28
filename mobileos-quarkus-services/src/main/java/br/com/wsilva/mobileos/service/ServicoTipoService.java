package br.com.wsilva.mobileos.service;

import br.com.wsilva.mobileos.model.ServicoTipoEntity;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class ServicoTipoService {

    @Inject
    EntityManager entityManager;

    public List<ServicoTipoEntity> listAll() {
        return entityManager.createQuery("select s from ServicoTipoEntity s").getResultList();
    }
}
