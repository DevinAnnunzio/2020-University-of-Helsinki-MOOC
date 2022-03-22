
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    public boolean equals(Object compared) {
        //if obj are in same ref in mem
        if (this == compared) {
            return true;
        }
        //Is compared type person
        if (!(compared instanceof Person)) {
            return false;
        }

        //turn to person obj to access var's
        Person comparedPerson = (Person) compared;

        //if the vals are = return true
        if (name.equals(comparedPerson.name)
                && birthday.equals(comparedPerson.birthday)
                && height == comparedPerson.height
                && weight == comparedPerson.weight) {
            return true;
        }

        return false;
    }

    // implement an equals method here for checking the equality of objects
}
