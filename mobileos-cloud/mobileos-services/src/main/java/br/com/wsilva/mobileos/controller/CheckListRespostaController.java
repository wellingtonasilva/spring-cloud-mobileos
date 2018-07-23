package br.com.wsilva.mobileos.controller;

import br.com.wsilva.mobileos.entity.CheckListRespostaEntity;
import br.com.wsilva.mobileos.repository.CheckListRespostaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/checkListResposta")
public class CheckListRespostaController {
    @Autowired
    private CheckListRespostaRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public List<CheckListRespostaEntity> findAll() {
        return (List<CheckListRespostaEntity>) this.repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public CheckListRespostaEntity findById(@PathVariable("id") Long id) {
        return this.repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public CheckListRespostaEntity save(@RequestBody CheckListRespostaEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public CheckListRespostaEntity update(@RequestBody CheckListRespostaEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        this.repository.delete(id);
        return HttpStatus.OK.toString();
    }
}
