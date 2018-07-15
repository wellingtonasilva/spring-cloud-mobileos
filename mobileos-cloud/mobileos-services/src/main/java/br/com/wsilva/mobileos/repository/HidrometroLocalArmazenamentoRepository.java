package br.com.wsilva.mobileos.repository;

import br.com.wsilva.mobileos.entity.HidrometroLocalArmazenamentoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HidrometroLocalArmazenamentoRepository extends CrudRepository<HidrometroLocalArmazenamentoEntity, Integer> {
}
