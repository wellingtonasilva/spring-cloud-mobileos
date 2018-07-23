package br.com.wsilva.mobileos.repository;

import br.com.wsilva.mobileos.entity.HidrometroProtecaoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HidrometroProtecaoRepository extends CrudRepository<HidrometroProtecaoEntity, Long> {
}
