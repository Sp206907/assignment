package modules;

import java.util.ArrayList;

public class School {
    private ArrayList<Person> members;

    public School() {
        this.members = new ArrayList<>();
    }

    // Add a member (Student or Teacher)
    public void addMember(Person person) {
        this.members.add(person);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("School Members:\n");
        for (Person member : members) {
            result.append(member.toString()).append("\n");
        }
        return result.toString();
    }
}
