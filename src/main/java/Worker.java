import java.time.LocalDate;

public class Worker extends Person implements AbleToWork {

    public Worker() {
    }

    public Worker(String name, int age, int amountOfChildren, LocalDate birthDate) {
        super(name, age, amountOfChildren, birthDate);
    }

    @Override
    int experience() {
        return getAge() - ADULT;
    }

    @Override
    double averageSalary() {
        return CalculatorUtils.averageValue(getMinSalary(), getMaxSalary());
    }

    @Override
    public void goToWork() {
        System.out.println("I happily walk to work!");
    }
}
