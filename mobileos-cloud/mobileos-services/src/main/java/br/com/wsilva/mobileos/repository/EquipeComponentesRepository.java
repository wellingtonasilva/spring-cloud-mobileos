package br.com.wsilva.mobileos.repository;

import br.com.wsilva.mobileos.entity.EquipeComponentesEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipeComponentesRepository extends CrudRepository<EquipeComponentesEntity, Integer> {
}
