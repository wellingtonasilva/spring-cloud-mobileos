package br.com.wsilva.mobileos.controller;

import br.com.wsilva.mobileos.entity.InterrupcaoEntity;
import br.com.wsilva.mobileos.repository.InterrupcaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/interrupcao")
public class InterrupcaoController {
    @Autowired
    private InterrupcaoRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public List<InterrupcaoEntity> findAll() {
        return (List<InterrupcaoEntity>) this.repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public InterrupcaoEntity findById(@PathVariable("id") Long id) {
        return this.repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public InterrupcaoEntity save(@RequestBody InterrupcaoEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public InterrupcaoEntity update(@RequestBody InterrupcaoEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        this.repository.delete(id);
        return HttpStatus.OK.toString();
    }
}
