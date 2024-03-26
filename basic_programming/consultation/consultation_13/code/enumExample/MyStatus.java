package code.enumExample;

public class MyStatus {
    private final String status;

    public MyStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "MyStatus{" +
                "status='" + status + '\'' +
                '}';
    }
}
