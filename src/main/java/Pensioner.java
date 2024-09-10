import java.time.LocalDate;
import java.util.Random;
/**
 * The Pensioner class represents a person who is retired but can still perform work.
 * It extends the Person class and implements the AbleToWork interface.
 */
public class Pensioner extends Person implements AbleToWork {
    private static final double CONSTANT_VALUE_FOR_ALL_PENSIONERS = 2000;
    private static final int MAX_WORK_EXPERIENCE = 49;
    private static final int RETIREMENT_AGE = 67;

    public Pensioner() {
    }

    public Pensioner(String name, int age, int amountOfChildren, LocalDate birthDate) {
        super(name, age, amountOfChildren, birthDate);
    }

    @Override
    int experience() {
        int experience;
        if (getAge() >= RETIREMENT_AGE) {
            experience = MAX_WORK_EXPERIENCE;

        } else {
            experience = getAge() - ADULT;

        }
        return experience;
    }

    @Override
    double averageSalary() {
        return CalculatorUtils.averageValue(getMinSalary(),
                getMaxSalary(), CONSTANT_VALUE_FOR_ALL_PENSIONERS);
    }

    @Override
    public void goToWork() {
        Random random = new Random();
        boolean pensionersChoice = random.nextBoolean();
        if (pensionersChoice) {
            System.out.println("I am actually retired!");
        } else {
            System.out.println("Okay, I'll work a little.");
        }
    }
}
