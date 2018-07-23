package br.com.wsilva.mobileos.controller;

import br.com.wsilva.mobileos.entity.EquipeEntity;
import br.com.wsilva.mobileos.repository.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "equipe")
public class EquipeController {
    @Autowired
    private EquipeRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public List<EquipeEntity> findAll() {
        return (List<EquipeEntity>) this.repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public EquipeEntity findById(@PathVariable("id") Long id) {
        return this.repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public EquipeEntity save(@RequestBody EquipeEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public EquipeEntity update(@RequestBody EquipeEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        this.repository.delete(id);
        return HttpStatus.OK.toString();
    }
}
