package br.com.wsilva.mobileos.repository;

import br.com.wsilva.mobileos.entity.CheckListRespostaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckListRespostaRepository extends CrudRepository<CheckListRespostaEntity, Long> {
}
