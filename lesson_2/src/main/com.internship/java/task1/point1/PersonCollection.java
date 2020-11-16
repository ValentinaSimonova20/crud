package task1.point1;

import task1.Person;

import java.util.Date;
import java.util.HashSet;
import java.util.stream.Stream;

/**
 * В классе реализован поиск совпадений с заданным шаблоном коллекций
 */
public class PersonCollection {
    public static void main(String[] args) {
        Person mike = new Person("михайлов","михаил","михайлович",
                15,"m",new Date(2015, 02,11));

        Person petr = new Person("petrov","petr","petrov",
                20,"m",new Date(2019, 04,11));

        Person alex = new Person("alexandrov","alex","alexandrovich",
                25,"m",new Date(1999, 02,11));

        Person valentina = new Person("valentinova","valentina","valentinovna",
                15,"f",new Date(1998, 02,11));

        Person anton = new Person("antonov","anton","antonovich",
                26,"m",new Date(1997, 02,11));

        // Создать коллекцию
        HashSet<Person> persons= new HashSet<Person>();
        persons.add(mike);
        persons.add(petr);
        persons.add(alex);
        persons.add(valentina);
        persons.add(anton);

        // Создать человека, совпадения с которым будем искать в коллеции
        Person myPerson = new Person("petrov","petr","antonov",
                23,"m", new Date(1996, 04, 4));

        // Создать стрим из коллеции шаблонов
        Stream<Person> streamFromCollection = persons.stream();

        boolean isMyPersonHasMatches;

        // есть ли в потоке хотя бы один person, у которого совпадает хотя бы одно поле с myPerson
        isMyPersonHasMatches = streamFromCollection.anyMatch((person) -> person.getAge().equals(myPerson.getAge()) ||
                person.getSurname().equals(myPerson.getSurname())||

                person.getDateOfBirth().equals(myPerson.getDateOfBirth())||

                person.getPatronymic().equals(myPerson.getPatronymic())||

                person.getSex().equals(myPerson.getSex()));

        System.out.println(isMyPersonHasMatches);




    }
}
