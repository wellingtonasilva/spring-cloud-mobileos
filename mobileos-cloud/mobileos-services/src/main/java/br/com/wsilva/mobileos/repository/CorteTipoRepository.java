package br.com.wsilva.mobileos.repository;

import br.com.wsilva.mobileos.entity.CorteTipoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CorteTipoRepository extends CrudRepository<CorteTipoEntity, Long> {
}
