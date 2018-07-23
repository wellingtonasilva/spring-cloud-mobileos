package br.com.wsilva.mobileos.repository;

import br.com.wsilva.mobileos.entity.OrdemServicoSubstituicaoHidrometroEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdemServicoSubstituicaoHidrometroRepository extends CrudRepository<OrdemServicoSubstituicaoHidrometroEntity, Long> {
}
