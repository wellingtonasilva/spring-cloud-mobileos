package br.com.wsilva.mobileos.repository;

import br.com.wsilva.mobileos.entity.VeiculoMarcaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoMarcaRepository extends CrudRepository<VeiculoMarcaEntity, Long> {
}
