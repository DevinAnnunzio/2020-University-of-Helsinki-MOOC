
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author devin
 */
public class Room {

    private ArrayList<Person> room = new ArrayList<>();

    public Room() {
        this.room = new ArrayList<>();
    }

    public void add(Person person) {
        room.add(person);
    }

    public boolean isEmpty() {
        if (room.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Person> getPersons() {
        return room;
    }

    public Person shortest() {
        if (room.isEmpty()) {
            return null;
        }
        Person shortestPerson = room.get(0);
        for (Person person : room) {
            if (shortestPerson.getHeight() > person.getHeight()) {
                shortestPerson = person;
            }
        }

        return shortestPerson;
    }

    public Person take() {
        Person shortest = shortest();
        room.remove(shortest);
        return shortest;

    }

}
