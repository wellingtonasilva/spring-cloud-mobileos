package br.com.wsilva.mobileos.repository;

import br.com.wsilva.mobileos.entity.EmpresaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends CrudRepository<EmpresaEntity, Integer> {
}
