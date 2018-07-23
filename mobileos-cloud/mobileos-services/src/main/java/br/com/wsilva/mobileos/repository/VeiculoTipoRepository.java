package br.com.wsilva.mobileos.repository;

import br.com.wsilva.mobileos.entity.VeiculoTipoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoTipoRepository extends CrudRepository<VeiculoTipoEntity, Long> {
}
