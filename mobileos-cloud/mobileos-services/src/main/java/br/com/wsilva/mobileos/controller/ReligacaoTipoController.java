package br.com.wsilva.mobileos.controller;

import br.com.wsilva.mobileos.entity.ReligacaoTipoEntity;
import br.com.wsilva.mobileos.repository.ReligacaoTipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/religacaoTipo")
public class ReligacaoTipoController {
    @Autowired
    private ReligacaoTipoRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public List<ReligacaoTipoEntity> findAll() {
        return (List<ReligacaoTipoEntity>) this.repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ReligacaoTipoEntity findById(@PathVariable("id") Long id) {
        return this.repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ReligacaoTipoEntity save(@RequestBody ReligacaoTipoEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ReligacaoTipoEntity update(@RequestBody ReligacaoTipoEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        this.repository.delete(id);
        return HttpStatus.OK.toString();
    }
}
