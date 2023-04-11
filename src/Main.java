


public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee(
                "Syrovatka Mykola",
                "Junior Java",
                "syrovatka1111@gmail.com",
                "+380999999999",
                34
        );
        System.out.println(employee.getFullName());
        System.out.println(employee.getPosition());
        System.out.println(employee.getEmail());
        System.out.println(employee.getPhone());
        System.out.println(employee.getAge());

        com.syrovatka.one.SameName sameNameDefault = new com.syrovatka.one.SameName();
        sameNameDefault.print();
        com.syrovatka.two.SameName sameNamePackage = new com.syrovatka.two.SameName();
        sameNamePackage.print();

        Car car = new Car();
        car.start();
    }
}