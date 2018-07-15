package br.com.wsilva.mobileos.repository;

import br.com.wsilva.mobileos.entity.InterrupcaoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterrupcaoRepository extends CrudRepository<InterrupcaoEntity, Integer> {
}
