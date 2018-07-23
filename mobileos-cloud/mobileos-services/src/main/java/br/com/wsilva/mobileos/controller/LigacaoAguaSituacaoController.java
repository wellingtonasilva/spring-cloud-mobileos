package br.com.wsilva.mobileos.controller;

import br.com.wsilva.mobileos.entity.LigacaoAguaSituacaoEntity;
import br.com.wsilva.mobileos.repository.LigacaoAguaSituacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public class LigacaoAguaSituacaoController {
    @Autowired
    private LigacaoAguaSituacaoRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public List<LigacaoAguaSituacaoEntity> findAll() {
        return (List<LigacaoAguaSituacaoEntity>) this.repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public LigacaoAguaSituacaoEntity findById(@PathVariable("id") Long id) {
        return this.repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public LigacaoAguaSituacaoEntity save(@RequestBody LigacaoAguaSituacaoEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public LigacaoAguaSituacaoEntity update(@RequestBody LigacaoAguaSituacaoEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        this.repository.delete(id);
        return HttpStatus.OK.toString();
    }
}
