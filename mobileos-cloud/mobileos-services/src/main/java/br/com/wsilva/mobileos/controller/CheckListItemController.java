package br.com.wsilva.mobileos.controller;

import br.com.wsilva.mobileos.entity.CheckListItemEntity;
import br.com.wsilva.mobileos.repository.CheckListItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/checkListItem")
public class CheckListItemController {
    @Autowired
    private CheckListItemRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public List<CheckListItemEntity> findAll() {
        return (List<CheckListItemEntity>) this.repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public CheckListItemEntity findById(@PathVariable("id") Long id) {
        return this.repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public CheckListItemEntity save(@RequestBody CheckListItemEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public CheckListItemEntity update(@RequestBody CheckListItemEntity entity) {
        return this.repository.save(entity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
        this.repository.delete(id);
        return HttpStatus.OK.toString();
    }
}
