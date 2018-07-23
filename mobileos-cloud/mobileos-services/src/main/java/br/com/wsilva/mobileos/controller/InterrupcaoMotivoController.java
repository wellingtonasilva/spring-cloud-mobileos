package br.com.wsilva.mobileos.controller;

import br.com.wsilva.mobileos.entity.InterrupcaoMotivoEntity;
import br.com.wsilva.mobileos.repository.InterrupcaoMotivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/interrupcaoMotivo")
public class InterrupcaoMotivoController {
    @Autowired
    private InterrupcaoMotivoRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public List<InterrupcaoMotivoEntity> findAll() {
        return (List<InterrupcaoMotivoEntity>) this.repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public InterrupcaoMotivoEntity findById(@PathVariable("id") Long id) {
        return this.repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public InterrupcaoMotivoEntity save(@RequestBody InterrupcaoMotivoEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public InterrupcaoMotivoEntity update(@RequestBody InterrupcaoMotivoEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        this.repository.delete(id);
        return HttpStatus.OK.toString();
    }
}
