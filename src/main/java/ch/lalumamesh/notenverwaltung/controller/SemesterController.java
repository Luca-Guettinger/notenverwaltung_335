package ch.lalumamesh.notenverwaltung.controller;

import ch.lalumamesh.notenverwaltung.model.Semester;
import ch.lalumamesh.notenverwaltung.service.SemesterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/semester/")
public class SemesterController {
    private final SemesterService semesterService;

    @Autowired
    public SemesterController(SemesterService semesterService) {
        this.semesterService = semesterService;
    }

    @GetMapping
    public List<Semester> findAll() {
        return semesterService.findAll();
    }

    @PostMapping
    public <S extends Semester> S save(S s) {
        return semesterService.save(s);
    }

    @GetMapping("{id}")
    public Optional<Semester> findById(Long id) {
        return semesterService.findById(id);
    }

    @DeleteMapping
    public void deleteById(Long aLong) {
        semesterService.deleteById(aLong);
    }
}
