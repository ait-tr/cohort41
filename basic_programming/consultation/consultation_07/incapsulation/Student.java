package incapsulation;

public class Student {

    private int studentId;
    private String name;
    private String group;
    private String password;

    public Student(int studentId, String name, String group, String password) {
        this.studentId = studentId;
        this.name = name;
        this.group = group;
        this.password = password;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public boolean changePassword(String newPassword) {
        // проверить подлинность и права доступа пользователя
        // проверить правильность нового пароля (длина, какие символы и тд)
        // только после всех проверок

        boolean isCorrect = true; // если все ОК....

        if (isCorrect) {
        this.password = newPassword;
        return true;
    } else {
        return false;}
    }

    public void printStudent(){
        System.out.println("Студент: " );
        System.out.println("Id: " + studentId);
        System.out.println("Имя: " + name);
        System.out.println("Группа: " + group);

    }
}
