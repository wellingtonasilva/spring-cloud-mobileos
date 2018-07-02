package br.com.wsilva.mobileos.repository;

import br.com.wsilva.mobileos.entity.ServicoTipoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicoTipoRepository extends CrudRepository<ServicoTipoEntity, Long> {
}
