package br.com.wsilva.mobileos.repository;

import br.com.wsilva.mobileos.entity.HidrometroSituacaoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HidrometroSituacaoRepository extends CrudRepository<HidrometroSituacaoEntity, Integer> {
}
