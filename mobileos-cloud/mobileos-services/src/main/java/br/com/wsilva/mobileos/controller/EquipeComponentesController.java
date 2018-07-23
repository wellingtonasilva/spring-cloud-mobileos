package br.com.wsilva.mobileos.controller;

import br.com.wsilva.mobileos.entity.EquipeComponentesEntity;
import br.com.wsilva.mobileos.repository.EquipeComponentesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "equipeComponentes")
public class EquipeComponentesController {
    @Autowired
    private EquipeComponentesRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public List<EquipeComponentesEntity> findAll() {
        return (List<EquipeComponentesEntity>) this.repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public EquipeComponentesEntity findById(@PathVariable("id") Long id) {
        return this.repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public EquipeComponentesEntity save(@RequestBody EquipeComponentesEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public EquipeComponentesEntity update(@RequestBody EquipeComponentesEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        this.repository.delete(id);
        return HttpStatus.OK.toString();
    }
}
