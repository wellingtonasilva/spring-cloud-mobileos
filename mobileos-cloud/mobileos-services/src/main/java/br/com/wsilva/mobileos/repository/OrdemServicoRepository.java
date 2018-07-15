package br.com.wsilva.mobileos.repository;

import br.com.wsilva.mobileos.entity.OrdemServicoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdemServicoRepository extends CrudRepository<OrdemServicoEntity, Integer> {
}
