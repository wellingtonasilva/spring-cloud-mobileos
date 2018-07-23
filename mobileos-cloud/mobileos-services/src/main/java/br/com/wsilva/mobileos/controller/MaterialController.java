package br.com.wsilva.mobileos.controller;

import br.com.wsilva.mobileos.entity.MaterialEntity;
import br.com.wsilva.mobileos.repository.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/material")
public class MaterialController {
    @Autowired
    private MaterialRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public List<MaterialEntity> findAll() {
        return (List<MaterialEntity>) this.repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public MaterialEntity findById(@PathVariable("id") Long id) {
        return this.repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public MaterialEntity save(@RequestBody MaterialEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public MaterialEntity update(@RequestBody MaterialEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        this.repository.delete(id);
        return HttpStatus.OK.toString();
    }
}
