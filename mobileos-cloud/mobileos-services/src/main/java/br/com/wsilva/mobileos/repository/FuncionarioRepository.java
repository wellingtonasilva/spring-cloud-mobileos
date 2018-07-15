package br.com.wsilva.mobileos.repository;

import br.com.wsilva.mobileos.entity.FuncionarioEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends CrudRepository<FuncionarioEntity, Integer> {
}
