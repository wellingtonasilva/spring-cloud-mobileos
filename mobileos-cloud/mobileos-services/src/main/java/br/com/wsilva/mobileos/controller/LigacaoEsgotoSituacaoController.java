package br.com.wsilva.mobileos.controller;

import br.com.wsilva.mobileos.entity.LigacaoEsgotoSituacaoEntity;
import br.com.wsilva.mobileos.repository.LigacaoEsgotoSituacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/ligacaoEsgotoSituacao")
public class LigacaoEsgotoSituacaoController {
    @Autowired
    private LigacaoEsgotoSituacaoRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public List<LigacaoEsgotoSituacaoEntity> findAll() {
        return (List<LigacaoEsgotoSituacaoEntity>) this.repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public LigacaoEsgotoSituacaoEntity findById(@PathVariable("id") Long id) {
        return this.repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public LigacaoEsgotoSituacaoEntity save(@RequestBody LigacaoEsgotoSituacaoEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public LigacaoEsgotoSituacaoEntity update(@RequestBody LigacaoEsgotoSituacaoEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        this.repository.delete(id);
        return HttpStatus.OK.toString();
    }
}
