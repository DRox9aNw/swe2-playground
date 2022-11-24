package ch.juventus.object;

public class Application {
    public static void main(String[] args) {
        Address address1 = new Address("Teststreet", 42, 6969, "Testcity");
        Address address2 = new Address("Teststreet", 42, 6969, "Testcity");
        Person person1 = new Person("Peter", "Müller", address1, 42, true);
        Person person2 = new Person("Peter", "Müller", address1, 42, true);
        System.out.println(person1.equals(person2));
    }
}
