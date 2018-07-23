package br.com.wsilva.mobileos.controller;

import br.com.wsilva.mobileos.entity.OrdemServicoFotoEntity;
import br.com.wsilva.mobileos.repository.OrdemServicoFotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping(value = "/ordemServicoFoto")
public class OrdemServicoFotoController {
    @Autowired
    private OrdemServicoFotoRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public List<OrdemServicoFotoEntity> findAll() {
        return (List<OrdemServicoFotoEntity>) this.repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public OrdemServicoFotoEntity findById(@PathVariable("id") Long id) {
        return this.repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public OrdemServicoFotoEntity save(@RequestBody OrdemServicoFotoEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public OrdemServicoFotoEntity update(@RequestBody OrdemServicoFotoEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        this.repository.delete(id);
        return HttpStatus.OK.toString();
    }

    @RequestMapping(value = "/download/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<byte[]> downloadImage(@PathVariable(name = "id") Long id) {
        OrdemServicoFotoEntity entity = repository.findOne(id);
        if (entity != null) {
            return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION,
                    "attachment; filename=\"" + entity.getNomeFoto() + "\"").body(entity.getFoto());
        }

        return null;
    }

    @PostMapping("/upload/{id}")
    public String updateloadImage(@PathVariable(name = "id") Long id, @RequestParam("file") MultipartFile file) {
        OrdemServicoFotoEntity entity = repository.findOne(id);
        if (entity != null) {
            try {
                entity.setFoto(file.getBytes());
                repository.save(entity);
                return Boolean.TRUE.toString();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return Boolean.FALSE.toString();
    }
}
