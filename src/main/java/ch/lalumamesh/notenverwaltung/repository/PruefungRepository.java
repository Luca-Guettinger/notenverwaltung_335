package ch.lalumamesh.notenverwaltung.repository;

import ch.lalumamesh.notenverwaltung.model.Pruefung;
import ch.lalumamesh.notenverwaltung.model.Semester;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PruefungRepository extends JpaRepository<Pruefung, Long> {
}
