package br.com.wsilva.mobileos.controller;

import br.com.wsilva.mobileos.entity.OrdemServicoCorteEntity;
import br.com.wsilva.mobileos.repository.OrdemServicoCorteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/ordemServicoCorte")
public class OrdemServicoCorteController {
    @Autowired
    private OrdemServicoCorteRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public List<OrdemServicoCorteEntity> findAll() {
        return (List<OrdemServicoCorteEntity>) this.repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public OrdemServicoCorteEntity findById(@PathVariable("id") Long id) {
        return this.repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public OrdemServicoCorteEntity save(@RequestBody OrdemServicoCorteEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public OrdemServicoCorteEntity update(@RequestBody OrdemServicoCorteEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        this.repository.delete(id);
        return HttpStatus.OK.toString();
    }
}
