package ch.lalumamesh.notenverwaltung.service;

import ch.lalumamesh.notenverwaltung.model.Pruefung;
import ch.lalumamesh.notenverwaltung.model.Semester;
import ch.lalumamesh.notenverwaltung.repository.PruefungRepository;
import ch.lalumamesh.notenverwaltung.repository.SemesterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PruefungService {
    private final PruefungRepository pruefungService;

    @Autowired
    public PruefungService(PruefungRepository pruefungService) {
        this.pruefungService = pruefungService;
    }

    public List<Pruefung> findAll() {
        return pruefungService.findAll();
    }

    public <S extends Pruefung> S save(S s) {
        return pruefungService.save(s);
    }

    public Optional<Pruefung> findById(Long aLong) {
        return pruefungService.findById(aLong);
    }

    public void deleteById(Long aLong) {
        pruefungService.deleteById(aLong);
    }
}
