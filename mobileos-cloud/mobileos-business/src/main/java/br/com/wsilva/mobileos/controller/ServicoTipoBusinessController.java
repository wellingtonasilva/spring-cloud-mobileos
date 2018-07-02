package br.com.wsilva.mobileos.controller;

import br.com.wsilva.mobileos.entity.ServicoTipoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ServicoTipoBusinessController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/servicotipo", method = RequestMethod.GET)
    public List<ServicoTipoEntity> listAllServicoTipo() {
        ResponseEntity<List<ServicoTipoEntity>> servicoTipoResponse = this.restTemplate.exchange(
                "http://MOBILEOS-SERVICES/servicotipo", HttpMethod.GET, null,
                new ParameterizedTypeReference<List<ServicoTipoEntity>>() {
                }
        );

        return servicoTipoResponse.getBody();
    }

}
