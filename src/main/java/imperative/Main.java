package imperative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> people= Arrays.asList(
                new Person("Hasitha", Gender.MALE),
                new Person("Shalani", Gender.FEMALE),
                new Person("Chathushka",Gender.MALE),
                new Person("Amanda", Gender.FEMALE),
                new Person("Pamitha",Gender.MALE)

        );
        System.out.println("Imperative approach");
        //Imperative approach
        List<Person> males=new ArrayList<>();

        for (Person person:people) {
            if(person.getGender().equals(Gender.MALE)){
                males.add(person);
            }
        }

        for (Person male:males) {
            System.out.println(male);
        }

        System.out.println("Declarative approach");
        //Declarative approach
        people.stream().
                filter(person->person.getGender().equals(Gender.MALE)).
                forEach(person-> System.out.println(person));

    }

    static class Person {
        private String name;
        private Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Gender getGender() {
            return gender;
        }

        public void setGender(Gender gender) {
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender{
        MALE,
        FEMALE;
    }
}
