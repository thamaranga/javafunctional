package streams;


import imperative.Main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _Stream {

    public static void main(String[] args) {

        List<Person> people= Arrays.asList(
                new Person("Hasitha", Gender.MALE),
                new Person("Shalani", Gender.FEMALE),
                new Person("Chathushka", Gender.MALE),
                new Person("Amanda", Gender.FEMALE),
                new Person("Pamitha", Gender.MALE)

        );

        people.stream().map(p->p.gender).collect(Collectors.toSet()).forEach(p-> System.out.println(p));
        System.out.println("********************");
        people.stream().map(p->p.gender).forEach(p-> System.out.println(p));


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
