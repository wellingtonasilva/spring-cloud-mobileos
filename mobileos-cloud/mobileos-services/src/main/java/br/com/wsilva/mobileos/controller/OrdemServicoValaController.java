package br.com.wsilva.mobileos.controller;

import br.com.wsilva.mobileos.entity.OrdemServicoValaEntity;
import br.com.wsilva.mobileos.repository.OrdemServicoValaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/ordemServicoVala")
public class OrdemServicoValaController {
    @Autowired
    private OrdemServicoValaRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public List<OrdemServicoValaEntity> findAll() {
        return (List<OrdemServicoValaEntity>) this.repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public OrdemServicoValaEntity findById(@PathVariable("id") Long id) {
        return this.repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public OrdemServicoValaEntity save(@RequestBody OrdemServicoValaEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public OrdemServicoValaEntity update(@RequestBody OrdemServicoValaEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        this.repository.delete(id);
        return HttpStatus.OK.toString();
    }
}
