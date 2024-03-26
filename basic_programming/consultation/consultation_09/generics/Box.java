package generics;

public class Box<MyType> {
    // для данный класса в момент использования и создания экземпляра должен быть ЯВНО указан тип данных

    private MyType item;


    public MyType getItem() {
        return item;
    }

    public void setItem(MyType item) {
        this.item = item;
    }

}
