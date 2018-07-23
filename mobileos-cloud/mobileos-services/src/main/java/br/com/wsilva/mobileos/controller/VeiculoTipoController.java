package br.com.wsilva.mobileos.controller;

import br.com.wsilva.mobileos.entity.VeiculoTipoEntity;
import br.com.wsilva.mobileos.repository.VeiculoTipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public class VeiculoTipoController {
    @Autowired
    private VeiculoTipoRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public List<VeiculoTipoEntity> findAll() {
        return (List<VeiculoTipoEntity>) this.repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public VeiculoTipoEntity findById(@PathVariable("id") Long id) {
        return this.repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public VeiculoTipoEntity save(@RequestBody VeiculoTipoEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public VeiculoTipoEntity update(@RequestBody VeiculoTipoEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        this.repository.delete(id);
        return HttpStatus.OK.toString();
    }
}
