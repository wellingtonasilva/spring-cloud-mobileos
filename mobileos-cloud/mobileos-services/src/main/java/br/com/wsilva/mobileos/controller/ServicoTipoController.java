package br.com.wsilva.mobileos.controller;

import br.com.wsilva.mobileos.entity.ServicoTipoEntity;
import br.com.wsilva.mobileos.repository.ServicoTipoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(value = "/servicotipo")
@Api(value = "servicotipo", description = "Data service para Servico Tipo", tags = ("servicotipo"))
public class ServicoTipoController {
    @Autowired
    private ServicoTipoRepository servicoTipoRepository;

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Lista de Serviço", notes = "Listagem de todos os Serviços da tabela de Serviço Tipo", nickname = "findAllServicoTipo")
    public List<ServicoTipoEntity> findAll() {
        return (List<ServicoTipoEntity>) this.servicoTipoRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ServicoTipoEntity findById(@PathVariable("id") Long id) {
        return this.servicoTipoRepository.findOne(id);
    }
}
