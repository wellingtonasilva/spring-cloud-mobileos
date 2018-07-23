package br.com.wsilva.mobileos.controller;

import br.com.wsilva.mobileos.entity.LocalOcorrenciaEntity;
import br.com.wsilva.mobileos.repository.LocalOcorrenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/localOcorrencia")
public class LocalOcorrenciaController {
    @Autowired
    private LocalOcorrenciaRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public List<LocalOcorrenciaEntity> findAll() {
        return (List<LocalOcorrenciaEntity>) this.repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public LocalOcorrenciaEntity findById(@PathVariable("id") Long id) {
        return this.repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public LocalOcorrenciaEntity save(@RequestBody LocalOcorrenciaEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public LocalOcorrenciaEntity update(@RequestBody LocalOcorrenciaEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        this.repository.delete(id);
        return HttpStatus.OK.toString();
    }
}
