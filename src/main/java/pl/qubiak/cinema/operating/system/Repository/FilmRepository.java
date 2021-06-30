package pl.qubiak.cinema.operating.system.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.qubiak.cinema.operating.system.Model.FilmsModel;

@Repository
public interface FilmRepository extends JpaRepository<FilmsModel, Long> {
}
