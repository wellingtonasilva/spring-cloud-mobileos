package br.com.wsilva.mobileos.controller;

import br.com.wsilva.mobileos.entity.VeiculoModeloEntity;
import br.com.wsilva.mobileos.repository.VeiculoModeloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public class VeiculoModeloController {
    @Autowired
    private VeiculoModeloRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public List<VeiculoModeloEntity> findAll() {
        return (List<VeiculoModeloEntity>) this.repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public VeiculoModeloEntity findById(@PathVariable("id") Long id) {
        return this.repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public VeiculoModeloEntity save(@RequestBody VeiculoModeloEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public VeiculoModeloEntity update(@RequestBody VeiculoModeloEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        this.repository.delete(id);
        return HttpStatus.OK.toString();
    }
}
