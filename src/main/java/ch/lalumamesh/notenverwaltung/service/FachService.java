package ch.lalumamesh.notenverwaltung.service;

import ch.lalumamesh.notenverwaltung.model.Fach;
import ch.lalumamesh.notenverwaltung.model.Semester;
import ch.lalumamesh.notenverwaltung.repository.FachRepository;
import ch.lalumamesh.notenverwaltung.repository.SemesterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FachService {
    private final FachRepository fachRepository;

    @Autowired
    public FachService(FachRepository fachRepository) {
        this.fachRepository = fachRepository;
    }

    public List<Fach> findAll() {
        return fachRepository.findAll();
    }

    public <S extends Fach> S save(S s) {
        return fachRepository.save(s);
    }

    public Optional<Fach> findById(Long aLong) {
        return fachRepository.findById(aLong);
    }

    public void deleteById(Long aLong) {
        fachRepository.deleteById(aLong);
    }
}
