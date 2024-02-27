package interfaces;
/*
@date 27.02.2024
@author Sergey Bugaienko
*/

import model.User;

public interface UserServiceInterface {
    public User registerUser(String email, String password); // Masha
    public User getActiveUser(); // Pasha
    public User authorise(String email, String password);

}
