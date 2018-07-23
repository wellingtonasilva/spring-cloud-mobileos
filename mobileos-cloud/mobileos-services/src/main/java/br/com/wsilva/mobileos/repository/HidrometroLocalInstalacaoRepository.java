package br.com.wsilva.mobileos.repository;

import br.com.wsilva.mobileos.entity.HidrometroLocalInstalacaoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HidrometroLocalInstalacaoRepository extends CrudRepository<HidrometroLocalInstalacaoEntity, Long> {
}
