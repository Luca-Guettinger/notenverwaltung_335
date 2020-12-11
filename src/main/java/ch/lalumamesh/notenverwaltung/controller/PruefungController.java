package ch.lalumamesh.notenverwaltung.controller;

import ch.lalumamesh.notenverwaltung.model.Pruefung;
import ch.lalumamesh.notenverwaltung.service.PruefungService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/pruefung/")
public class PruefungController {
    private final PruefungService pruefungService;

    @Autowired
    public PruefungController(PruefungService pruefungService) {
        this.pruefungService = pruefungService;
    }

    @GetMapping
    public List<Pruefung> findAll() {
        return pruefungService.findAll();
    }

    @PostMapping
    public Pruefung save(@RequestBody Pruefung pruefung) {
        return pruefungService.save(pruefung);
    }

    @GetMapping("{id}")
    public Optional<Pruefung> findById( @PathVariable Long id) {
        return pruefungService.findById(id);
    }

    @DeleteMapping
    public void deleteById(Long aLong) {
        pruefungService.deleteById(aLong);
    }
}
