package ch.lalumamesh.notenverwaltung.service;

import ch.lalumamesh.notenverwaltung.model.Semester;
import ch.lalumamesh.notenverwaltung.repository.SemesterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SemesterService {
    private final SemesterRepository semesterRepository;

    @Autowired
    public SemesterService(SemesterRepository semesterRepository) {
        this.semesterRepository = semesterRepository;
    }

    public List<Semester> findAll() {
        return semesterRepository.findAll();
    }

    public <S extends Semester> S save(S s) {
        return semesterRepository.save(s);
    }

    public Optional<Semester> findById(Long aLong) {
        return semesterRepository.findById(aLong);
    }

    public void deleteById(Long aLong) {
        semesterRepository.deleteById(aLong);
    }
}
