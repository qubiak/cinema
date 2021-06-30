package pl.qubiak.cinema.operating.system.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.qubiak.cinema.operating.system.Model.ReservationsModel;

@Repository
public interface ReservationsRepository extends JpaRepository<ReservationsModel, Long> {
}
