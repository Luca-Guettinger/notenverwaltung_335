package ch.lalumamesh.notenverwaltung.controller;

import ch.lalumamesh.notenverwaltung.model.Fach;
import ch.lalumamesh.notenverwaltung.model.Semester;
import ch.lalumamesh.notenverwaltung.service.FachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/fach/")
public class FachController {
    private final FachService fachService;

    @Autowired
    public FachController(FachService fachService) {
        this.fachService = fachService;
    }

    @GetMapping
    public List<Fach> findAll() {
        return fachService.findAll();
    }

    @PostMapping
    public <S extends Fach> S save(S s) {
        return fachService.save(s);
    }

    @GetMapping("{id}")
    public Optional<Fach> findById( @PathVariable Long id) {
        return fachService.findById(id);
    }

    @DeleteMapping
    public void deleteById(Long aLong) {
        fachService.deleteById(aLong);
    }
}
