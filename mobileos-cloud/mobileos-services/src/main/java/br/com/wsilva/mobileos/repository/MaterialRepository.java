package br.com.wsilva.mobileos.repository;

import br.com.wsilva.mobileos.entity.MaterialEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialRepository extends CrudRepository<MaterialEntity, Long> {
}
