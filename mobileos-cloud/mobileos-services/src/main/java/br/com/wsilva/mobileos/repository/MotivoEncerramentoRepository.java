package br.com.wsilva.mobileos.repository;

import br.com.wsilva.mobileos.entity.MotivoEncerramentoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotivoEncerramentoRepository extends CrudRepository<MotivoEncerramentoEntity, Integer> {
}
