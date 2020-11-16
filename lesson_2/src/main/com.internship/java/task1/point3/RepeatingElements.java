package task1.point3;

import task1.Person;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * В классе реализован вывод повторяющихся объектов человека объектов человека в порядке убыванию их возраста (если повторений меньше 4)
 * Если повторений больше 3, то данные люди записываются в отдельную коллекцию
 */
public class RepeatingElements {
    public static void main(String[] args) {
        Person mike = new Person("михайлов","михаил","михайлович",
                15,"m",new Date(2015, 02,11));


        Person alex = new Person("alexandrov","alex","alexandrovich",
                25,"m",new Date(1999, 02,11));


        Person anton = new Person("antonov","anton","antonovich",
                26,"m",new Date(1997, 02,11));

        // Создать коллекцию
        ArrayList<Person> persons= new ArrayList<>();
        persons.add(mike);
        persons.add(mike);
        persons.add(alex);
        persons.add(alex);
        persons.add(anton);
        persons.add(anton);
        persons.add(anton);
        persons.add(anton);


        // Создать стрим из коллеции шаблонов

        Supplier<Stream<Person>> streamFromCollection = () -> persons.stream();


        // Кол-во повторений до 1 до 3 в порядке убывания возраста
        List<Person> repeats =  streamFromCollection.get()
                .filter((person) ->  streamFromCollection.get().filter(person::equals).count()>1)
                .filter((person) ->  streamFromCollection.get().filter(person::equals).count()<=3)
                .distinct()
                .sorted((p1,p2)-> -p1.getAge().compareTo(p2.getAge()))
                .collect(Collectors.toList());

        // Кол-во повторений больше 3
        List<Person> repeats2 =  streamFromCollection.get()
                .filter((person) ->  streamFromCollection.get().filter(person::equals).count()>3)
                .distinct().collect(Collectors.toList());

        // Вывод людей, которые повторялись не более 3 раз
        System.out.println('{');
        for(int i=0; i<repeats.size();i++) System.out.println(i+1+":"+repeats.get(i));
        System.out.println('}');

        // Вывод людей которые повторялись более 3 раз
        System.out.println();
        System.out.println("Объекты, повторяющиеся больше трех раз: ");
        // Вывести коллекцию элементов, которые повторяются больше 3 раз
        for(int i=0; i<repeats2.size();i++) System.out.println(repeats.get(i));

    }
}
