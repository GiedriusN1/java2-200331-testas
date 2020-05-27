package lt.bit.java2.testas.runners;

import lt.bit.java2.testas.model.Pazymys;
import lt.bit.java2.testas.model.Studentas;
import lt.bit.java2.testas.repositories.StudentasRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Optional;

@Component
@Order(1)
public class Uzdavinys1 implements CommandLineRunner {

    @Resource
    private StudentasRepository studentasRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Uzdavinys1 - Nuskaityti viena studenta su pazymiais");
        Optional<Studentas> studentas = studentasRepository.findById(1);
        if (!studentas.isPresent()) {
            System.out.println("Studento nera DB");
        } else {
            System.out.println(studentas.get().getVardas());
            for (Pazymys pazymys : studentas.get().getPazymiai()) {
                System.out.println(pazymys.getData() + " " + pazymys.getPazymys());
            }
        }
    }
}
