package br.com.wsilva.mobileos.repository;

import br.com.wsilva.mobileos.entity.OrdemServicoCorteEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdemServicoCorteRepository extends CrudRepository<OrdemServicoCorteEntity, Integer> {
}
