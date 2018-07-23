package br.com.wsilva.mobileos.controller;

import br.com.wsilva.mobileos.entity.EmpresaEntity;
import br.com.wsilva.mobileos.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "empresa")
public class EmpresaController {
    @Autowired
    private EmpresaRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public List<EmpresaEntity> findAll() {
        return (List<EmpresaEntity>) this.repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public EmpresaEntity findById(@PathVariable("id") Long id) {
        return this.repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public EmpresaEntity save(@RequestBody EmpresaEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public EmpresaEntity update(@RequestBody EmpresaEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        this.repository.delete(id);
        return HttpStatus.OK.toString();
    }
}
