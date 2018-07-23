package br.com.wsilva.mobileos.repository;

import br.com.wsilva.mobileos.entity.CheckListGrupoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckListGrupoRepository extends CrudRepository<CheckListGrupoEntity, Long> {
}
