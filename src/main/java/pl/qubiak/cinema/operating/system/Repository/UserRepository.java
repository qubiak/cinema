package pl.qubiak.cinema.operating.system.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.qubiak.cinema.operating.system.Model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
}
