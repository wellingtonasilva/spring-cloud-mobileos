package br.com.wsilva.mobileos.controller;

import br.com.wsilva.mobileos.entity.OrdemServicoInstacaoHidrometroEntity;
import br.com.wsilva.mobileos.repository.OrdemServicoInstacaoHidrometroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public class OrdemServicoInstacaoHidrometroController {
    @Autowired
    private OrdemServicoInstacaoHidrometroRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public List<OrdemServicoInstacaoHidrometroEntity> findAll() {
        return (List<OrdemServicoInstacaoHidrometroEntity>) this.repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public OrdemServicoInstacaoHidrometroEntity findById(@PathVariable("id") Long id) {
        return this.repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public OrdemServicoInstacaoHidrometroEntity save(@RequestBody OrdemServicoInstacaoHidrometroEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public OrdemServicoInstacaoHidrometroEntity update(@RequestBody OrdemServicoInstacaoHidrometroEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        this.repository.delete(id);
        return HttpStatus.OK.toString();
    }
}
