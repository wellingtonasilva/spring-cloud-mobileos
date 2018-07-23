package br.com.wsilva.mobileos.repository;

import br.com.wsilva.mobileos.entity.CheckListEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckListRepository extends CrudRepository<CheckListEntity, Long> {
}
