package code;

import java.time.LocalDateTime;

public class User {
    private int userId;
    private String name;
    private String email;
    private String password;
    private LocalDateTime dateTime;

    public User(int userId, String name, String email, String password, LocalDateTime dateTime) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.dateTime = dateTime;
    }
}
