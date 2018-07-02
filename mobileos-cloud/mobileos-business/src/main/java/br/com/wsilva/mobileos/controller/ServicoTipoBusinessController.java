package br.com.wsilva.mobileos.controller;

import br.com.wsilva.mobileos.client.ServicoTipoService;
import br.com.wsilva.mobileos.entity.ServicoTipoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ServicoTipoBusinessController {
    @Autowired
    private ServicoTipoService servicoTipoService;

    @RequestMapping(value = "/servicotipo", method = RequestMethod.GET)
    public List<ServicoTipoEntity> listAllServicoTipo() {
        return this.servicoTipoService.findAll();
    }

    @RequestMapping(value = "/servicotipo/{id}", method = RequestMethod.GET)
    public ServicoTipoEntity findById(@PathVariable("id") Long id) {
        return this.servicoTipoService.findById(id);
    }
}
