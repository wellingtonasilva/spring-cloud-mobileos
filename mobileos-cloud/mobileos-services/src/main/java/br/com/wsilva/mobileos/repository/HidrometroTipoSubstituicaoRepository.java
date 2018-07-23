package br.com.wsilva.mobileos.repository;

import br.com.wsilva.mobileos.entity.HidrometroTipoSubstituicaoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HidrometroTipoSubstituicaoRepository extends CrudRepository<HidrometroTipoSubstituicaoEntity, Long> {
}
