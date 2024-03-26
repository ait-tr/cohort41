package enumExample;

public class UserDemo {
    public static void main(String[] args) {
        UserWithEnum userWithEnum1 = new UserWithEnum("James",Status.ACTIVE);
        UserWithEnum userWithEnum2 = new UserWithEnum("Bill",Status.INACTIVE);
        UserWithEnum userWithEnum3 = new UserWithEnum("Robert",Status.BANNED);

        System.out.println(userWithEnum1);
        System.out.println(userWithEnum2);
        System.out.println(userWithEnum3);



        UserWithOutEnum user21 = new UserWithOutEnum("Alice", "Active");
        UserWithOutEnum user22 = new UserWithOutEnum("Ruslan", "Inactive");
        UserWithOutEnum user23 = new UserWithOutEnum("Oleg", "Banfasbgzfbzfbned");

        System.out.println(user21);
        System.out.println(user22);
        System.out.println(user23);

        if (userWithEnum1.getStatus().equals(Status.ACTIVE)) {
            System.out.println("активный пользователь");
        }

        if (user21.getMyStatus().getStatus().equals("Active")){
            System.out.println("активный пользователь # 21");
        }

        userWithEnum1.setStatus(Status.HOLD);
        System.out.println(userWithEnum1);

    }
}
