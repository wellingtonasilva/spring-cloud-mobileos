package br.com.wsilva.mobileos.repository;

import br.com.wsilva.mobileos.entity.OrdemServicoInstacaoHidrometroEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdemServicoInstacaoHidrometroRepository extends CrudRepository<OrdemServicoInstacaoHidrometroEntity, Integer> {
}
