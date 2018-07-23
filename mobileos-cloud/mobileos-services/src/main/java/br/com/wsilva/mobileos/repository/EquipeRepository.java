package br.com.wsilva.mobileos.repository;

import br.com.wsilva.mobileos.entity.EquipeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipeRepository extends CrudRepository<EquipeEntity, Long> {
}
