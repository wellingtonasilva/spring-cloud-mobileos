package br.com.wsilva.mobileos.repository;

import br.com.wsilva.mobileos.entity.VeiculoModeloEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoModeloRepository extends CrudRepository<VeiculoModeloEntity, Integer> {
}
