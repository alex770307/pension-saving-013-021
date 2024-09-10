import java.time.LocalDate;
import java.util.Objects;
/**
 * The Teenager class represents a person who is a teenager.
 * It extends the Person class and includes additional attributes and methods specific to teenagers.
 */
public class Teenager extends Person {
    private String sport;
    private String study;

    public Teenager() {
    }

    public Teenager(String name, int age, int amountOfChildren,
                    LocalDate birthDate, String sport, String study) {
        super(name, age, amountOfChildren, birthDate);
        this.sport = sport;
        this.study = study;
    }

    @Override
    int experience() {
        return 0;
    }

    @Override
    double averageSalary() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Teenager teenager = (Teenager) o;
        return Objects.equals(sport, teenager.sport) && Objects.equals(study, teenager.study);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sport, study);
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getStudy() {
        return study;
    }

    public void setStudy(String study) {
        this.study = study;
    }
}
