package br.com.wsilva.mobileos.repository;

import br.com.wsilva.mobileos.entity.ImovelEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImovelRepository extends CrudRepository<ImovelEntity, Long> {
}
