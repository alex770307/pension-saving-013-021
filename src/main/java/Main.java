import java.time.LocalDate;

/**
 * The Main class serves as the entry point for the application.
 * It demonstrates the creation and usage of Worker, Pensioner, and Teenager objects,
 * as well as the calculation of their experience, average salary, and pension.
 */
public class Main {

    public static void main(String[] args) {

        PensionFund pensionFund = new PensionFund("Deutsche-Rentenversicherung",
                23000000, LocalDate.of(2005, 1, 1));

        Worker worker = new Worker("Jan", 25, 1,
                LocalDate.of(1999, 1, 1));

        int experienced = worker.experience();

        worker.setEmployed(true);

        worker.setMinSalary(2705.65);
        worker.setMaxSalary(3112.23);
        double averageSalary = worker.averageSalary();

        double pensionWorker = pensionFund.calculatePension(worker);

        worker.toGreet();

        worker.goToWork();

        System.out.println("Worker  " + worker);
        System.out.println("Experience  " + experienced);
        System.out.println("Average salary  " + averageSalary);
        System.out.println("Pension  " + pensionWorker);
        System.out.println("Pension fund  " + pensionFund);
        System.out.println("______________________________");

        Pensioner pensioner = new Pensioner("Nick", 75, 2,
                LocalDate.of(1949, 2, 2));

        int experiencedPensioner = pensioner.experience();

        pensioner.setMinSalary(800);
        pensioner.setMaxSalary(2010);
        double averageSalaryPensioner = pensioner.averageSalary();

        double pensionPensioner = pensionFund.calculatePension(pensioner);

        pensioner.toGreet();

        pensioner.goToWork();

        System.out.println("Pensioner  " + pensioner);
        System.out.println("Experience pensioner  " + experiencedPensioner);
        System.out.println("Average salary  " + averageSalaryPensioner);
        System.out.println("Pension  " + pensionPensioner);
        System.out.println("Pension fund  " + pensionFund);
        System.out.println("______________________________");

        Teenager teenager = new Teenager("Sasha", 16, 0,
                LocalDate.of(2007, 10, 30),
                "Basketball, swimming", "Clara Schumann Gymnasium");

        teenager.toGreet();

        System.out.println("Teenager  " + teenager);
        System.out.println("Sport  " + teenager.getSport());
        System.out.println("Study  " + teenager.getStudy());

    }
}
