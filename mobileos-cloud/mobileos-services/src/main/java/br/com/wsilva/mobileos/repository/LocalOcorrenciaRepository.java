package br.com.wsilva.mobileos.repository;

import br.com.wsilva.mobileos.entity.LocalOcorrenciaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalOcorrenciaRepository extends CrudRepository<LocalOcorrenciaEntity, Integer> {
}
