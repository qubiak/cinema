package pl.qubiak.cinema.operating.system;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import pl.qubiak.cinema.operating.system.Model.FilmsModel;
import pl.qubiak.cinema.operating.system.Model.UserModel;
import pl.qubiak.cinema.operating.system.Repository.FilmRepository;
import pl.qubiak.cinema.operating.system.Repository.UserRepository;

@Configuration
public class initialData {

    public initialData(UserRepository userRepository, FilmRepository filmRepository, PasswordEncoder passwordEncoder){

        //-----USERS-----

        UserModel appUserJanusz = new UserModel();
        appUserJanusz.setUsername("Janusz");
        appUserJanusz.setPassword(passwordEncoder.encode("Janusz123"));
        appUserJanusz.setRole("ROLE_ADMIN");
        appUserJanusz.setMail("test@janusz.pl");
        appUserJanusz.setEnabled(true);

        UserModel appUserMirek = new UserModel();
        appUserMirek.setUsername("Mirek");
        appUserMirek.setPassword(passwordEncoder.encode("Mirek123"));
        appUserMirek.setMail("test@mirek.pl");
        appUserMirek.setRole("ROLE_MOD");
        appUserMirek.setEnabled(true);

        UserModel appUserBogdan = new UserModel();
        appUserBogdan.setUsername("Bogdan");
        appUserBogdan.setPassword(passwordEncoder.encode("Bogdan123"));
        appUserBogdan.setMail("test@bogdan.pl");
        appUserBogdan.setRole("ROLE_USER");
        appUserBogdan.setEnabled(true);

        UserModel appUserKrzysiek = new UserModel();
        appUserKrzysiek.setUsername("Krzysiek");
        appUserKrzysiek.setPassword(passwordEncoder.encode("Krzysiek123"));
        appUserKrzysiek.setMail("test@krzysiek.pl");
        appUserKrzysiek.setRole("ROLE_USER");
        appUserKrzysiek.setEnabled(false);

        userRepository.save(appUserJanusz);
        userRepository.save(appUserMirek);
        userRepository.save(appUserBogdan);
        userRepository.save(appUserKrzysiek);

        //-----FILMS-----

        FilmsModel film1 = new FilmsModel();
        film1.setName("Pirania 3D");
        film1.setCategory("Horror / Komedia");
        film1.setYearOfProduction(2010);

        FilmsModel film2 = new FilmsModel();
        film2.setName("Minionki");
        film2.setCategory("Animacja / Familijny / Komedia");
        film2.setYearOfProduction(2015);

        FilmsModel film3 = new FilmsModel();
        film3.setName("Podziemny krąg");
        film3.setCategory("Thriller / Psychologiczny");
        film3.setYearOfProduction(1999);

        filmRepository.save(film1);
        filmRepository.save(film2);
        filmRepository.save(film3);

    }

}
