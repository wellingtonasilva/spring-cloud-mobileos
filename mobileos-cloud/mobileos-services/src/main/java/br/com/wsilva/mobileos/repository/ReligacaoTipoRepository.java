package br.com.wsilva.mobileos.repository;

import br.com.wsilva.mobileos.entity.ReligacaoTipoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReligacaoTipoRepository extends CrudRepository<ReligacaoTipoEntity, Long> {
}
