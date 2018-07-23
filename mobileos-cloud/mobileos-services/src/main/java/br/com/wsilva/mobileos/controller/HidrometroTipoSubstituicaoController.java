package br.com.wsilva.mobileos.controller;

import br.com.wsilva.mobileos.entity.HidrometroTipoSubstituicaoEntity;
import br.com.wsilva.mobileos.repository.HidrometroTipoSubstituicaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/hidrometroTipoSubstituicao")
public class HidrometroTipoSubstituicaoController {
    @Autowired
    private HidrometroTipoSubstituicaoRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public List<HidrometroTipoSubstituicaoEntity> findAll() {
        return (List<HidrometroTipoSubstituicaoEntity>) this.repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public HidrometroTipoSubstituicaoEntity findById(@PathVariable("id") Long id) {
        return this.repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public HidrometroTipoSubstituicaoEntity save(@RequestBody HidrometroTipoSubstituicaoEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public HidrometroTipoSubstituicaoEntity update(@RequestBody HidrometroTipoSubstituicaoEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        this.repository.delete(id);
        return HttpStatus.OK.toString();
    }
}
