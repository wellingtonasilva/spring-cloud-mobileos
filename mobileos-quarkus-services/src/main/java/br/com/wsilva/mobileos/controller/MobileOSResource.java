package br.com.wsilva.mobileos.controller;

import br.com.wsilva.mobileos.model.ServicoTipoEntity;
import br.com.wsilva.mobileos.service.ServicoTipoService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/api")
public class MobileOSResource {

    @Inject
    ServicoTipoService servicoTipoService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello";
    }

    @GET
    @Path("/servicoTipo")
    @Produces(MediaType.APPLICATION_JSON)
    public List<ServicoTipoEntity> listAllServicoTipo() {
        return servicoTipoService.listAll();
    }
}