package task1.point2;

import task1.Person;

import java.util.Date;
import java.util.HashSet;
import java.util.stream.Stream;

/**
 * В классе реализован вывод людей из заданной коллекции, у которых возраст не превышает 20 лет
 * и фамилия начинается на одну из букв (а, б, в, г, д) как в верхнем, так и в нижнем регистре
 */
public class FilterPerson {
    public static void main(String[] args) {
        Person mike = new Person("михайлов", "михаил", "михайлович",
                15, "m", new Date(2015, 02, 11));

        Person petr = new Person("антонов", "Петр", "Петров",
                20, "m", new Date(2019, 04, 11));

        Person alex = new Person("борисов", "борис", "борисович",
                19, "m", new Date(1999, 02, 11));

        Person valentina = new Person("Гаврилова", "Валентина", "Валентиновна",
                15, "f", new Date(1998, 02, 11));

        Person anton = new Person("Яблоков", "Антон", "Антонович",
                26, "m", new Date(1997, 02, 11));

        // Создать коллекцию людей
        HashSet<Person> persons = new HashSet<Person>();
        persons.add(mike);
        persons.add(petr);
        persons.add(alex);
        persons.add(valentina);
        persons.add(anton);

        // Создать стрим из коллеции шаблонов
        Stream<Person> streamFromCollection = persons.stream();

        // Выбрать людей, у которых возвраст не превышает 20 и фамиля начинанется на одну из букв(абвгд)
        // Регулярное выражение: [абвгд] - первая буква из списка; (.*) - любой символ, повторяющийся 0 или больше раз
        Stream<Person> filteredPersons = streamFromCollection.filter((person) -> person.getAge() <= 20 &&
                person.getSurname().toLowerCase().matches("[абвгд](.*)"));

        filteredPersons.forEach(person -> System.out.println(person.getSurname() + " " + person.getAge()));


    }
}

