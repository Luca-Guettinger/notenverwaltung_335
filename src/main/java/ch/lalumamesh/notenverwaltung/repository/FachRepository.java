package ch.lalumamesh.notenverwaltung.repository;

import ch.lalumamesh.notenverwaltung.model.Fach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FachRepository extends JpaRepository<Fach, Long> {
}
