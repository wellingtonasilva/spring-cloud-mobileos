package br.com.wsilva.mobileos.repository;

import br.com.wsilva.mobileos.entity.MotivoCorteEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotivoCorteRepository extends CrudRepository<MotivoCorteEntity, Long> {
}
