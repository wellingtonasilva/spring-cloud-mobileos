package br.com.wsilva.mobileos.controller;

import br.com.wsilva.mobileos.entity.OrdemServicoEntity;
import br.com.wsilva.mobileos.repository.OrdemServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/ordemServico")
public class OrdemServicoController {
    @Autowired
    private OrdemServicoRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public List<OrdemServicoEntity> findAll() {
        return (List<OrdemServicoEntity>) this.repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public OrdemServicoEntity findById(@PathVariable("id") Long id) {
        return this.repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public OrdemServicoEntity save(@RequestBody OrdemServicoEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public OrdemServicoEntity update(@RequestBody OrdemServicoEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        this.repository.delete(id);
        return HttpStatus.OK.toString();
    }
}
