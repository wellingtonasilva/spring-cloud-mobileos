package br.com.wsilva.mobileos.controller;

import br.com.wsilva.mobileos.entity.CheckListItemOpcaoEntity;
import br.com.wsilva.mobileos.repository.CheckListItemOpcaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/checkListItemOpcao")
public class CheckListItemOpcaoController {
    @Autowired
    private CheckListItemOpcaoRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public List<CheckListItemOpcaoEntity> findAll() {
        return (List<CheckListItemOpcaoEntity>) this.repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public CheckListItemOpcaoEntity findById(@PathVariable("id") Long id) {
        return this.repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public CheckListItemOpcaoEntity save(@RequestBody CheckListItemOpcaoEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public CheckListItemOpcaoEntity update(@RequestBody CheckListItemOpcaoEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        this.repository.delete(id);
        return HttpStatus.OK.toString();
    }
}
