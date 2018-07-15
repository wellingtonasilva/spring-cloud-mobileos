package br.com.wsilva.mobileos.repository;

import br.com.wsilva.mobileos.entity.HidrometroTipoInstalacaoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HidrometroTipoInstalacaoRepository extends CrudRepository<HidrometroTipoInstalacaoEntity, Integer> {
}
