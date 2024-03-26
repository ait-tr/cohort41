package code.oop2;

import java.util.ArrayList;
import java.util.List;

public class ItSchool {

    private String name;
    private List<Group> groups;

    public ItSchool(String name) {
        this.name = name;
        this.groups = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void addGroup(Group newGroup){
        groups.add(newGroup);
        System.out.println("Группа " + newGroup.getGroupName() + " успешно сформирована");
    }


    public void printSchoolData(){
        System.out.println("Название школы: " + name);
        for (Group currentGroup : groups){
            System.out.println("Название группы: " + currentGroup.getGroupName());

            List<Student> currentGroupStudents = currentGroup.getStudents();
            System.out.println("Список студентов :");
            for (int i = 0; i < currentGroupStudents.size(); i++) {
                System.out.println("Фамилия :" + currentGroupStudents.get(i).getPerson().getSecondName());
            }
        }
    }

    @Override
    public String toString() {
        return "ItSchool{" +
                "name='" + name + '\'' +
                ", groups=" + groups +
                '}';
    }
}
