import java.time.LocalDate;
import java.util.Objects;
/**
 * The Person class represents a general person with common attributes and methods.
 * It serves as a base class for more specific types of people.
 */
public abstract class Person {
    private String name;
    private int age;
    private int amountOfChildren;
    private boolean isEmployed;
    private double minSalary;
    private double maxSalary;
    private LocalDate birthDate;
    protected final static int ADULT = 18;

    public Person() {
    }

    public Person(String name, int age, int amountOfChildren, LocalDate birthDate) {
        this.name = name;
        this.age = age;
        this.amountOfChildren = amountOfChildren;
        this.birthDate = birthDate;
    }

    abstract int experience();

    abstract double averageSalary();

    public void toGreet() {
        System.out.println("Hello! My name is:  " + name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", amountOfChildren=" + amountOfChildren +
                ", isEmployed=" + isEmployed +
                ", birthDate=" + birthDate +
                ", minSalary=" + minSalary +
                ", maxSalary=" + maxSalary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && amountOfChildren == person.amountOfChildren
                && isEmployed == person.isEmployed && Double.compare(minSalary, person.minSalary) == 0
                && Double.compare(maxSalary, person.maxSalary) == 0
                && Objects.equals(name, person.name)
                && Objects.equals(birthDate, person.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, amountOfChildren, isEmployed, minSalary, maxSalary, birthDate);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getAmountOfChildren() {
        return amountOfChildren;
    }

    public boolean isEmployed() {
        return isEmployed;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public double getMinSalary() {
        return minSalary;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAmountOfChildren(int amountOfChildren) {
        this.amountOfChildren = amountOfChildren;
    }

    public void setEmployed(boolean employed) {
        isEmployed = employed;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }

    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
    }
}
