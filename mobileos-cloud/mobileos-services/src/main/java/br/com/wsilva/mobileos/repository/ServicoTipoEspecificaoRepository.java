package br.com.wsilva.mobileos.repository;

import br.com.wsilva.mobileos.entity.ServicoTipoEspecificaoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicoTipoEspecificaoRepository extends CrudRepository<ServicoTipoEspecificaoEntity, Long> {
}
