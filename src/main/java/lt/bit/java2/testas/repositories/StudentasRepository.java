package lt.bit.java2.testas.repositories;

import lt.bit.java2.testas.model.Studentas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentasRepository extends JpaRepository<Studentas, Integer> {

    // Cia galima ideti papildomus metodus
}
