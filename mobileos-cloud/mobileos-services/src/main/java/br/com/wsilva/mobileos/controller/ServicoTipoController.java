package br.com.wsilva.mobileos.controller;

import br.com.wsilva.mobileos.entity.ServicoTipoEntity;
import br.com.wsilva.mobileos.repository.ServicoTipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(value = "/servicotipo")
public class ServicoTipoController {
    @Autowired
    private ServicoTipoRepository servicoTipoRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<ServicoTipoEntity> findAll() {
        return (List<ServicoTipoEntity>) this.servicoTipoRepository.findAll();
    }
}
