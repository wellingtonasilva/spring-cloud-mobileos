package br.com.wsilva.mobileos.repository;

import br.com.wsilva.mobileos.entity.InterrupcaoMotivoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterrupcaoMotivoRepository extends CrudRepository<InterrupcaoMotivoEntity, Long> {
}
