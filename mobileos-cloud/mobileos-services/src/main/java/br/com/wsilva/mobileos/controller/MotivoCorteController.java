package br.com.wsilva.mobileos.controller;

import br.com.wsilva.mobileos.entity.MotivoCorteEntity;
import br.com.wsilva.mobileos.repository.MotivoCorteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public class MotivoCorteController {
    @Autowired
    private MotivoCorteRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public List<MotivoCorteEntity> findAll() {
        return (List<MotivoCorteEntity>) this.repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public MotivoCorteEntity findById(@PathVariable("id") Long id) {
        return this.repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public MotivoCorteEntity save(@RequestBody MotivoCorteEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public MotivoCorteEntity update(@RequestBody MotivoCorteEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        this.repository.delete(id);
        return HttpStatus.OK.toString();
    }
}
