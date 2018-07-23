package br.com.wsilva.mobileos.repository;

import br.com.wsilva.mobileos.entity.LigacaoEsgotoSituacaoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LigacaoEsgotoSituacaoRepository extends CrudRepository<LigacaoEsgotoSituacaoEntity, Long> {
}
