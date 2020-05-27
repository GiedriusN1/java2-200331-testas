package lt.bit.java2.testas.runners;

import lt.bit.java2.testas.model.Studentas;
import lt.bit.java2.testas.services.StudentasService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
@Order(2)
public class Uzdavinys2 implements CommandLineRunner {

    @Resource
    private StudentasService studentasService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Uzdavinys2");

        List<Studentas> studentai = studentasService.gautiStudentusPagalMetus(2018);
        System.out.println("Rasta studentu " + studentai.size());
        studentai.forEach(std -> System.out.println(std.getVardas()));
    }
}
