package br.com.wsilva.mobileos.controller;

import br.com.wsilva.mobileos.entity.CorteTipoEntity;
import br.com.wsilva.mobileos.repository.CorteTipoRepository;
import com.netflix.ribbon.proxy.annotation.Http;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/cortetipo")
@Api(value = "cortetipo", description = "Tipos de Corte", tags = ("cortetipo"))
public class CorteTipoController {
    @Autowired
    private CorteTipoRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Lista de Tipo de Corte", notes = "Listagem de todos os Tipos de Corte", nickname = "findAllCorteTipo")
    public List<CorteTipoEntity> findAll() {
        return (List<CorteTipoEntity>) this.repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public CorteTipoEntity findById(@PathVariable("id") Long id) {
        return this.repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public CorteTipoEntity save(@RequestBody CorteTipoEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public CorteTipoEntity update(@RequestBody CorteTipoEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        this.repository.delete(id);
        return HttpStatus.OK.toString();
    }
}
