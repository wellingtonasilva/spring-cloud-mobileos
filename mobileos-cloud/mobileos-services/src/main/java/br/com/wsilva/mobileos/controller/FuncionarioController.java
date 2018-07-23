package br.com.wsilva.mobileos.controller;

import br.com.wsilva.mobileos.entity.FuncionarioEntity;
import br.com.wsilva.mobileos.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "funcionario")
public class FuncionarioController {
    @Autowired
    private FuncionarioRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public List<FuncionarioEntity> findAll() {
        return (List<FuncionarioEntity>) this.repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public FuncionarioEntity findById(@PathVariable("id") Long id) {
        return this.repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public FuncionarioEntity save(@RequestBody FuncionarioEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public FuncionarioEntity update(@RequestBody FuncionarioEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        this.repository.delete(id);
        return HttpStatus.OK.toString();
    }
}
