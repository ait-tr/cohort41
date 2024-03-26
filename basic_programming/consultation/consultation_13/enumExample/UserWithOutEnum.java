package enumExample;

public class UserWithOutEnum {

    private Integer id;
    private String name;
    private MyStatus myStatus;

    public UserWithOutEnum(String name, String myStatus) {
        this.name = name;
        this.myStatus = new MyStatus(myStatus);
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public MyStatus getMyStatus() {
        return myStatus;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + myStatus +
                '}';
    }
}
