package br.com.wsilva.mobileos.controller;

import br.com.wsilva.mobileos.entity.PavimentoTipoEntity;
import br.com.wsilva.mobileos.repository.PavimentoTipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/pavimentoTipo")
public class PavimentoTipoController {
    @Autowired
    private PavimentoTipoRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public List<PavimentoTipoEntity> findAll() {
        return (List<PavimentoTipoEntity>) this.repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public PavimentoTipoEntity findById(@PathVariable("id") Long id) {
        return this.repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public PavimentoTipoEntity save(@RequestBody PavimentoTipoEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public PavimentoTipoEntity update(@RequestBody PavimentoTipoEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        this.repository.delete(id);
        return HttpStatus.OK.toString();
    }
}
