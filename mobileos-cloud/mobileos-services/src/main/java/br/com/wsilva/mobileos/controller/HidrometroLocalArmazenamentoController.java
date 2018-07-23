package br.com.wsilva.mobileos.controller;

import br.com.wsilva.mobileos.entity.HidrometroLocalArmazenamentoEntity;
import br.com.wsilva.mobileos.repository.HidrometroLocalArmazenamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "hidrometroLocalArmazenamento")
public class HidrometroLocalArmazenamentoController {
    @Autowired
    private HidrometroLocalArmazenamentoRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public List<HidrometroLocalArmazenamentoEntity> findAll() {
        return (List<HidrometroLocalArmazenamentoEntity>) this.repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public HidrometroLocalArmazenamentoEntity findById(@PathVariable("id") Long id) {
        return this.repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public HidrometroLocalArmazenamentoEntity save(@RequestBody HidrometroLocalArmazenamentoEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public HidrometroLocalArmazenamentoEntity update(@RequestBody HidrometroLocalArmazenamentoEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        this.repository.delete(id);
        return HttpStatus.OK.toString();
    }
}
