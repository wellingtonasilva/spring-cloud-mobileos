package br.com.wsilva.mobileos.repository;

import br.com.wsilva.mobileos.entity.PavimentoTipoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PavimentoTipoRepository extends CrudRepository<PavimentoTipoEntity, Integer> {
}
