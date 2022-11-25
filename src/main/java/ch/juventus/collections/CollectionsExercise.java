package ch.juventus.collections;

import ch.juventus.object.Person;
import ch.juventus.sorting.PersonComparator;

import java.util.*;

public class CollectionsExercise {

    public static void main(String[] args) {
        arrayList();
        linkedList();
        hashSet();
        linkedHashSet();
        treeSet();
        hashMap();
        linkedHashMap();
        treeMap();
        loops();
    }

    static void arrayList() {
        System.out.println("########## ArrayList ##########");
        // TODO: Erstelle eine ArrayList von Strings und füge 5 Tiere hinzu ("Hund", "Katze", "Maus", ...)
        List<String> animalArray = new ArrayList<>();
        animalArray.add("Hund");
        animalArray.add("Katze");
        animalArray.add("Maus");
        animalArray.add("Tiger");
        animalArray.add("Elephant");
        // TODO: Gib die Anzahl Einträge auf der Konsole aus.
        System.out.println(animalArray.size());
        // TODO: Füge ein weiteres Element mit Index 2 hinzu.
        animalArray.add(2, "Schlange");
        // TODO: Gib die ganze Liste auf der Konsole aus.
        System.out.println(animalArray);
        // TODO: Prüfe ob ein bestimmtes Element in der Liste vorkommt.
        System.out.println("Does Maus exist in array? " + animalArray.contains("Maus"));
        System.out.println("Does Löwe exist in array? " + animalArray.contains("Löwe"));
        // TODO: Ein Element lesen via Index.
        System.out.println("Element at index 1 = " + animalArray.get(1));
        // TODO: Ein Element löschen via Index
        animalArray.remove(0);
        // TODO: Ein Element löschen via String
        animalArray.remove("Elephant");
        // TODO: Ein Element löschen via Index, das es nicht gibt (was passiert?)
        // animalArray.remove(10); // -> IndexOutOfBoundsException
        // TODO: Ein Element löschen via String, das es nicht gibt (was passiert?)
        System.out.println(animalArray.remove("Elephant")); // -> no Exception
        // TODO: Alle Elemente aus der Liste löschen
        animalArray.clear();
    }

    static void linkedList() {
        System.out.println("########## LinkedList ##########");
        // TODO: Erstelle eine LinkedList von Strings und füge 5 Tiere hinzu ("Hund", "Katze", "Maus", ...)
        LinkedList<String> animalList = new LinkedList<>();
        animalList.add("Hund");
        animalList.add("Katze");
        animalList.add("Maus");
        animalList.add("Tiger");
        animalList.add("Elephant");
        // TODO: Gib die Anzahl Einträge auf der Konsole aus.
        System.out.println(animalList.size());
        // TODO: Den Index eines bestimmten Elements finden
        System.out.println("Index of Katze = " + animalList.indexOf("Katze"));
        // TODO: Den Index eines Elements das nicht existiert finden (was passiert?)
        System.out.println(animalList.indexOf("Löwe"));
        // TODO: Ein Element via Index lesen
        System.out.println("Element at index 4 = " + animalList.get(4));
        // TODO: Das erste und letzte Element der Liste ausgeben
        System.out.printf("First: %s | Last: %s%n", animalList.getFirst(), animalList.getLast());
        // TODO: Das erste und letzte Element der Liste löschen
        animalList.removeFirst();
        animalList.removeLast();
    }

    static void hashSet() {
        System.out.println("########## HashSet ##########");
        // TODO: Erstelle ein HashSet von Personen (object package)
        Set<Person> people = new HashSet<>();
        // TODO: Füge mehrere Personen ein, auch doppelte (verschiedene Objekte mit gleichen Werten)
        people.add(new Person("Anna", "Meier"));
        people.add(new Person("Urs", "Brauer"));
        people.add(new Person("Isabelle", "Züger"));
        people.add(new Person("Isabelle", "Züger"));
        people.add(new Person("Loris", "Aaber"));
        people.add(new Person("Otto", "Müller"));
        // TODO: Prüfe, ob das Set nicht leer is
        System.out.println("Is set empty? " + people.isEmpty());
        // TODO: Gib die Länge des Sets aus (doppelte Personen?)
        System.out.println(people.size());
        // TODO: Prüfe, ob ein gewisses Element im Set existiert
        System.out.println("Does Person Anna Meier exist in set?: " + people.contains(new Person("Anna", "Meier")));
        System.out.println("Does Person Peter Kreier exist in set?: " + people.contains(new Person("Peter", "Kreier")));
        // TODO: Lösche ein bestimmtes Element aus dem Set
        people.remove(new Person("Otto", "Müller"));
        // TODO: Gib das gesamte Set mehrmals auf der Konsole aus. Wie ist die Reihenfolge der Elemente?
        System.out.println(people);
        System.out.println(people); // -> in theory the arrangement is random
    }

    static void linkedHashSet() {
        System.out.println("########## LinkedHashSet ##########");
        // TODO: Erstelle ein LinkedHashSet von Personen (object package)
        Set<Person> people = new LinkedHashSet<>();
        // TODO: Füge mehrere Personen ein, auch doppelte (verschiedene Objekte mit gleichen Werten)
        people.add(new Person("Anna", "Meier"));
        people.add(new Person("Urs", "Brauer"));
        people.add(new Person("Isabelle", "Züger"));
        people.add(new Person("Isabelle", "Züger"));
        people.add(new Person("Loris", "Aaber"));
        people.add(new Person("Otto", "Müller"));
        // TODO: Prüfe, ob das Set nicht leer ist
        System.out.println("Is set empty? " + people.isEmpty());
        // TODO: Gib die Länge des Sets aus (doppelte Personen?)
        System.out.println(people.size());
        // TODO: Gib das gesamte Set mehrmals auf der Konsole aus. Wie ist die Reihenfolge der Elemente?
        System.out.println(people);
        System.out.println(people); // -> in the order with which they were added
    }

    static void treeSet() {
        System.out.println("########## TreeSet ##########");
        // TODO: Erstelle ein TreeSet von Personen (object package) und verwende den PersonComparator
        Set<Person> people = new TreeSet<>(new PersonComparator());
        // TODO: Füge mehrere Personen ein, auch doppelte (verschiedene Objekte mit gleichen Werten)
        people.add(new Person("Anna", "Meier"));
        people.add(new Person("Urs", "Brauer"));
        people.add(new Person("Urs", "Züger"));
        people.add(new Person("Isabelle", "Züger"));
        people.add(new Person("Loris", "Aaber"));
        people.add(new Person("Otto", "Müller"));
        people.add(new Person("Otto", "Müller"));
        // TODO: Gib die Länge des Sets aus (doppelte Personen?)
        System.out.println(people.size());
        // TODO: Gib das gesamte Set auf der Konsole aus. Wie ist die Reihenfolge der Elemente?
        for (Person person : people)
            System.out.println(person);
    }

    static void hashMap() {
        System.out.println("########## HashMap ##########");
        // TODO: Erstelle eine HashMap (Key: String; Value: List<Person>)
        Map<String, List<Person>> people = new HashMap<>();
        // TODO: Füge folgende Einträge in die Map:
        //  ­ "family" : Liste von 3 Personen
        //  ­ "office" : null
        //  ­ "friends" : Liste von 3 Personen
        List<Person> family = List.of(
                new Person("Anna", "Dobbler"),
                new Person("Otto", "Dobbler"),
                new Person("Lena", "Dobbler")
        );
        List<Person> friends = List.of(
                new Person("Urs", "Gweder"),
                new Person("Rita", "Ubun"),
                new Person("Robert", "Meier")
        );
        people.put("family", family);
        people.put("office", null);
        people.put("friends", friends);
        // TODO: Gib die gesamte Map auf der Konsole aus
        people.forEach((k, v) -> System.out.printf("key: %s | value: %s%n", k, v));
        // TODO: Füge einen weiteren Eintrag "office" : Liste von 2 Personen der Map hinzu.
        List<Person> office = List.of(
                new Person("Eva", "Trüeb"),
                new Person("Marcel", "Muster")
        );
        people.put("office", office);
        //  (Wieviele Einträge sind jetzt in der Map?)
        System.out.println(people.size());
        // TODO: Gib das entrySet auf der Konsole aus
        System.out.println(people.entrySet());
        // TODO: Gib das keySet auf der Konsole aus
        System.out.println(people.keySet());
        // TODO: Gib die values auf der Konsole aus
        System.out.println(people.values());
    }

    static void linkedHashMap() {
        System.out.println("########## LinkedHashMap ##########");
        // TODO: Erstelle eine LinkedHashMap (Key: Integer; Value: Person) mit Access-Order
        Map<Integer, Person> people = new LinkedHashMap<>(10, 0.75f, true);
        // TODO: Fülle 5 Einträge ein (auch doppelte Keys, um zu überprüfen, dass der Value überschrieben wird)
        people.put(0, new Person("first-0", "last-0"));
        people.put(1, new Person("first-1", "last-1"));
        people.put(2, new Person("first-2", "last-2"));
        people.put(3, new Person("first-3", "last-3"));
        people.put(1, new Person("first-9", "last-9"));
        // TODO: Gib die gesamte Map auf der Konsole aus
        people.forEach((k, v) -> System.out.printf("key: %s | value: %s%n", k, v));
        // TODO: Greife auf mehrere Elemente zu
        System.out.println(people.get(3));
        // TODO: Gib die Map erneut aus und überprüfe die Sortierung
        people.forEach((k, v) -> System.out.printf("key: %s | value: %s%n", k, v));
    }

    static void treeMap() {
        System.out.println("########## TreeMap ##########");
        // TODO: Erstelle eine TreeMap (Key: Integer; Value: Person)
        Map<Integer, Person> people = new TreeMap<>();
        // TODO: Fülle 5 Einträge ein (auch doppelte Keys, um zu überprüfen, dass der Value überschrieben wird)
        people.put(0, new Person("first-0", "last-0"));
        people.put(1, new Person("first-1", "last-1"));
        people.put(2, new Person("first-2", "last-2"));
        people.put(3, new Person("first-3", "last-3"));
        people.put(1, new Person("first-9", "last-9"));
        // TODO: Gib die gesamte Map auf der Konsole aus und überprüfe die Sortierung
        people.forEach((k, v) -> System.out.printf("key: %s | value: %s%n", k, v));
    }

    static void loops() {
        listLoop();
        setLoop();
        mapLoop();
    }

    static void listLoop() {
        System.out.println("########## ListLoop ##########");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        for (Integer number : numbers) {
            System.out.print(number);
        }
        numbers.forEach(System.out::print);
        System.out.println();
    }

    static void setLoop() {
        System.out.println("########## SetLoop ##########");
        Set<Integer> numbers = Set.of(0, 1, 2, 3, 4, 5);
        for (Integer number : numbers) {
            System.out.print(number);
        }
        numbers.forEach(System.out::print);
        System.out.println();
    }

    static void mapLoop() {
        System.out.println("########## MapLoop ##########");
        Map<Integer, String> numbers = Map.of(
                1, "one",
                2, "two",
                3, "three"
        );
        for (Map.Entry<Integer, String> entry : numbers.entrySet()) {
            System.out.printf("key: %d | value: %s%n", entry.getKey(), entry.getValue());
        }
        for (Integer key : numbers.keySet()) {
            System.out.println(key);
        }
        for (String value : numbers.values()) {
            System.out.println(value);
        }
        numbers.forEach((k, v) -> System.out.printf("key: %d | value: %s%n", k, v));
    }
}
