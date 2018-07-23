package br.com.wsilva.mobileos.controller;

import br.com.wsilva.mobileos.entity.HidrometroSituacaoEntity;
import br.com.wsilva.mobileos.repository.HidrometroSituacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/hidrometroSituacao")
public class HidrometroSituacaoController {
    @Autowired
    private HidrometroSituacaoRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public List<HidrometroSituacaoEntity> findAll() {
        return (List<HidrometroSituacaoEntity>) this.repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public HidrometroSituacaoEntity findById(@PathVariable("id") Long id) {
        return this.repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public HidrometroSituacaoEntity save(@RequestBody HidrometroSituacaoEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public HidrometroSituacaoEntity update(@RequestBody HidrometroSituacaoEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        this.repository.delete(id);
        return HttpStatus.OK.toString();
    }
}
