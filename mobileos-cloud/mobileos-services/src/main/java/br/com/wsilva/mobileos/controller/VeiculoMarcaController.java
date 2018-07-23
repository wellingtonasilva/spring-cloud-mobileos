package br.com.wsilva.mobileos.controller;

import br.com.wsilva.mobileos.entity.VeiculoMarcaEntity;
import br.com.wsilva.mobileos.repository.VeiculoMarcaRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/veiculoMarca")
public class VeiculoMarcaController {
    @Autowired
    private VeiculoMarcaRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Lista de Tipo de Corte", notes = "Listagem de todos os Tipos de Corte", nickname = "findAllCorteTipo")
    public List<VeiculoMarcaEntity> findAll() {
        return (List<VeiculoMarcaEntity>) this.repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public VeiculoMarcaEntity findById(@PathVariable("id") Long id) {
        return this.repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public VeiculoMarcaEntity save(@RequestBody VeiculoMarcaEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public VeiculoMarcaEntity update(@RequestBody VeiculoMarcaEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        this.repository.delete(id);
        return HttpStatus.OK.toString();
    }
}
