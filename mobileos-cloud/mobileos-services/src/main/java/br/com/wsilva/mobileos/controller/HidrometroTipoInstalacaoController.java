package br.com.wsilva.mobileos.controller;

import br.com.wsilva.mobileos.entity.HidrometroTipoInstalacaoEntity;
import br.com.wsilva.mobileos.repository.HidrometroTipoInstalacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/hidrometroTipoInstalacao")
public class HidrometroTipoInstalacaoController {
    @Autowired
    private HidrometroTipoInstalacaoRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public List<HidrometroTipoInstalacaoEntity> findAll() {
        return (List<HidrometroTipoInstalacaoEntity>) this.repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public HidrometroTipoInstalacaoEntity findById(@PathVariable("id") Long id) {
        return this.repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public HidrometroTipoInstalacaoEntity save(@RequestBody HidrometroTipoInstalacaoEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public HidrometroTipoInstalacaoEntity update(@RequestBody HidrometroTipoInstalacaoEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        this.repository.delete(id);
        return HttpStatus.OK.toString();
    }
}
