package project;

public class Repository {
    InterfaceForService1 service1 = new Service1();

    public void service(){
        service1.add();
    }

}
