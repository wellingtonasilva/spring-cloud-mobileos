package br.com.wsilva.mobileos.repository;

import br.com.wsilva.mobileos.entity.CheckListItemOpcaoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckListItemOpcaoRepository extends CrudRepository<CheckListItemOpcaoEntity, Integer> {
}
