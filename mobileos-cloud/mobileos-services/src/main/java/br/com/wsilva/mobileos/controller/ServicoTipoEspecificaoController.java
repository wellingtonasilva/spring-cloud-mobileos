package br.com.wsilva.mobileos.controller;

import br.com.wsilva.mobileos.entity.ServicoTipoEspecificaoEntity;
import br.com.wsilva.mobileos.repository.ServicoTipoEspecificaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/servicoTipoEspecificao")
public class ServicoTipoEspecificaoController {
    @Autowired
    private ServicoTipoEspecificaoRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public List<ServicoTipoEspecificaoEntity> findAll() {
        return (List<ServicoTipoEspecificaoEntity>) this.repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ServicoTipoEspecificaoEntity findById(@PathVariable("id") Long id) {
        return this.repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ServicoTipoEspecificaoEntity save(@RequestBody ServicoTipoEspecificaoEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ServicoTipoEspecificaoEntity update(@RequestBody ServicoTipoEspecificaoEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        this.repository.delete(id);
        return HttpStatus.OK.toString();
    }
}
