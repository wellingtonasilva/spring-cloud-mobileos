package br.com.wsilva.mobileos.controller;

import br.com.wsilva.mobileos.entity.UnidadeMedidaEntity;
import br.com.wsilva.mobileos.repository.UnidadeMedidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/unidadeMedida")
public class UnidadeMedidaController {
    @Autowired
    private UnidadeMedidaRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public List<UnidadeMedidaEntity> findAll() {
        return (List<UnidadeMedidaEntity>) this.repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public UnidadeMedidaEntity findById(@PathVariable("id") Long id) {
        return this.repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public UnidadeMedidaEntity save(@RequestBody UnidadeMedidaEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public UnidadeMedidaEntity update(@RequestBody UnidadeMedidaEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        this.repository.delete(id);
        return HttpStatus.OK.toString();
    }
}
