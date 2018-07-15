package br.com.wsilva.mobileos.controller;

import br.com.wsilva.mobileos.entity.ServicoTipoEntity;
import br.com.wsilva.mobileos.repository.ServicoTipoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/servicotipo")
@Api(value = "servicotipo", description = "Data service para Servico Tipo", tags = ("servicotipo"))
public class ServicoTipoController {
    @Autowired
    private ServicoTipoRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Lista de Tipo de Corte", notes = "Listagem de todos os Tipos de Corte", nickname = "findAllCorteTipo")
    public List<ServicoTipoEntity> findAll() {
        return (List<ServicoTipoEntity>) this.repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ServicoTipoEntity findById(@PathVariable("id") Long id) {
        return this.repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ServicoTipoEntity save(@RequestBody ServicoTipoEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ServicoTipoEntity update(@RequestBody ServicoTipoEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        this.repository.delete(id);
        return HttpStatus.OK.toString();
    }
}
