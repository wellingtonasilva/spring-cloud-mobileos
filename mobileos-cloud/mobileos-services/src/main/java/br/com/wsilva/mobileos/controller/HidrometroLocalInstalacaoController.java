package br.com.wsilva.mobileos.controller;

import br.com.wsilva.mobileos.entity.HidrometroLocalInstalacaoEntity;
import br.com.wsilva.mobileos.repository.HidrometroLocalInstalacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/hidrometroLocalInstalacao")
public class HidrometroLocalInstalacaoController {
    @Autowired
    private HidrometroLocalInstalacaoRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public List<HidrometroLocalInstalacaoEntity> findAll() {
        return (List<HidrometroLocalInstalacaoEntity>) this.repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public HidrometroLocalInstalacaoEntity findById(@PathVariable("id") Long id) {
        return this.repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public HidrometroLocalInstalacaoEntity save(@RequestBody HidrometroLocalInstalacaoEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public HidrometroLocalInstalacaoEntity update(@RequestBody HidrometroLocalInstalacaoEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        this.repository.delete(id);
        return HttpStatus.OK.toString();
    }
}
