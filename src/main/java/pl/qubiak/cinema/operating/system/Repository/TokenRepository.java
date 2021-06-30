package pl.qubiak.cinema.operating.system.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.qubiak.cinema.operating.system.Model.TokenModel;

@Repository
public interface TokenRepository extends JpaRepository<TokenModel, Long> {

    TokenModel findByValue(String value);

}
