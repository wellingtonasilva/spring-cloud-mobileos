package br.com.wsilva.mobileos.controller;

import br.com.wsilva.mobileos.entity.CorteTipoEntity;
import br.com.wsilva.mobileos.repository.CorteTipoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
}
