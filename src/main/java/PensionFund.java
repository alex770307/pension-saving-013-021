import java.time.LocalDate;
import java.util.Objects;

public class PensionFund {

    private String name;
    private int depositors;
    private LocalDate foundationDate;
    private static final double CONSTANT_PERCENT_FOR_PENSION = 0.7;


    public PensionFund() {
    }

    public PensionFund(String name, int depositors, LocalDate foundationDate) {
        this.name = name;
        this.depositors = depositors;
        this.foundationDate = foundationDate;
    }

    public double calculatePension(Person person) {
        return person.averageSalary() * CONSTANT_PERCENT_FOR_PENSION;
    }

    @Override
    public String toString() {
        return "PensionFund{" +
                "name='" + name + '\'' +
                ", depositors=" + depositors +
                ", foundationDate=" + foundationDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PensionFund that = (PensionFund) o;
        return depositors == that.depositors && Objects.equals(name, that.name)
                && Objects.equals(foundationDate, that.foundationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, depositors, foundationDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepositors() {
        return depositors;
    }

    public void setDepositors(int depositors) {
        this.depositors = depositors;
    }

    public LocalDate getFoundationDate() {
        return foundationDate;
    }

    public void setFoundationDate(LocalDate foundationDate) {
        this.foundationDate = foundationDate;
    }
}
