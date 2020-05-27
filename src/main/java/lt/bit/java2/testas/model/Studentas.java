package lt.bit.java2.testas.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "studentai")
public class Studentas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String vardas;
    private String pavarde;
    private String elPastas;  // -> el_pastas

    @OneToMany(mappedBy = "studentas", fetch = FetchType.EAGER,
        orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Pazymys> pazymiai;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public String getElPastas() {
        return elPastas;
    }

    public void setElPastas(String elPastas) {
        this.elPastas = elPastas;
    }

    public List<Pazymys> getPazymiai() {
        return pazymiai;
    }

    public void setPazymiai(List<Pazymys> pazymiai) {
        this.pazymiai = pazymiai;
    }
}
