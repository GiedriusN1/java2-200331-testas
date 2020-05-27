package lt.bit.java2.testas.services;

import lt.bit.java2.testas.model.Studentas;
import lt.bit.java2.testas.repositories.StudentasRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentasService {

    @Resource
    private StudentasRepository studentasRepository;

    public List<Studentas> gautiStudentusPagalMetus(int metai) {
        List<Studentas> studentas = studentasRepository.findAll();
        return studentas.stream()
                .filter(std -> std.getPazymiai().stream().anyMatch(pazymys -> pazymys.getData().getYear() == metai))
                .collect(Collectors.toList());
    }
}
