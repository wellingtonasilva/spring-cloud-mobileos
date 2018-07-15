package br.com.wsilva.mobileos.repository;

import br.com.wsilva.mobileos.entity.LigacaoAguaSituacaoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LigacaoAguaSituacaoRepository extends CrudRepository<LigacaoAguaSituacaoEntity, Integer> {
}
