package br.com.wsilva.mobileos.controller;

import br.com.wsilva.mobileos.entity.OrdemServicoSubstituicaoHidrometroEntity;
import br.com.wsilva.mobileos.repository.OrdemServicoSubstituicaoHidrometroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public class OrdemServicoSubstituicaoHidrometroController {
    @Autowired
    private OrdemServicoSubstituicaoHidrometroRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public List<OrdemServicoSubstituicaoHidrometroEntity> findAll() {
        return (List<OrdemServicoSubstituicaoHidrometroEntity>) this.repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public OrdemServicoSubstituicaoHidrometroEntity findById(@PathVariable("id") Long id) {
        return this.repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public OrdemServicoSubstituicaoHidrometroEntity save(@RequestBody OrdemServicoSubstituicaoHidrometroEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public OrdemServicoSubstituicaoHidrometroEntity update(@RequestBody OrdemServicoSubstituicaoHidrometroEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        this.repository.delete(id);
        return HttpStatus.OK.toString();
    }
}
