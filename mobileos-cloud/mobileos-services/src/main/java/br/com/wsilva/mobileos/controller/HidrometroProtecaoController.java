package br.com.wsilva.mobileos.controller;

import br.com.wsilva.mobileos.entity.HidrometroProtecaoEntity;
import br.com.wsilva.mobileos.repository.HidrometroProtecaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/hidrometroProtecao")
public class HidrometroProtecaoController {
    @Autowired
    private HidrometroProtecaoRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public List<HidrometroProtecaoEntity> findAll() {
        return (List<HidrometroProtecaoEntity>) this.repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public HidrometroProtecaoEntity findById(@PathVariable("id") Long id) {
        return this.repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public HidrometroProtecaoEntity save(@RequestBody HidrometroProtecaoEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public HidrometroProtecaoEntity update(@RequestBody HidrometroProtecaoEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        this.repository.delete(id);
        return HttpStatus.OK.toString();
    }
}
