package cls;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee e1 = new Employee("애플","개발","신입");
        Employee e2 = new Employee("홍길동",1,"애플","개발","신입");
        Employee e3 = new Employee();

        e1.introduce();
        e2.introduce();
        e3.introduce();

    }
}
