package br.com.wsilva.mobileos.repository;

import br.com.wsilva.mobileos.entity.OrdemServicoReligacaoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdemServicoReligacaoRepository extends CrudRepository<OrdemServicoReligacaoEntity, Integer> {
}
