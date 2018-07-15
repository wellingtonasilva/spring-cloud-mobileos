package br.com.wsilva.mobileos.repository;

import br.com.wsilva.mobileos.entity.VeiculoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoRepository extends CrudRepository<VeiculoEntity, Integer> {
}
