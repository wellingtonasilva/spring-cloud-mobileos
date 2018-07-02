package br.com.wsilva.mobileos.client;

import br.com.wsilva.mobileos.entity.ServicoTipoEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "MOBILEOS-SERVICES")
public interface ServicoTipoService {

    @RequestMapping(value = "/servicotipo", method = RequestMethod.GET)
    List<ServicoTipoEntity> findAll();

    @RequestMapping(value = "/servicotipo/{id}", method = RequestMethod.GET)
    public ServicoTipoEntity findById(@PathVariable("id") Long id);
}
