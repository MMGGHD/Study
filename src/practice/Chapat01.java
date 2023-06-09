package practice;

class Empoloyee {
    protected String name;
    public int baseSalary = 3000000;

    public int getSalary() {
        return baseSalary;
    }

    public Empoloyee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Manager extends Empoloyee {

    public int getSalary() {
        return baseSalary + 2000000;
    }

    public Manager(String name) {
        super(name);
    }

    public String getName() {
        return name;
    }
}

class Programmer extends Empoloyee {

    public int getSalary() {
        return baseSalary + 3000000;
    }

    public Programmer(String name) {
        super(name);
    }

    public String getName() {
        return name;
    }
}

public class Chapat01 {
    public static void main(String[] args) {
        Manager manager = new Manager("홍길동");
        Programmer programmer = new Programmer("김갑수");
        System.out.println(manager.getName() + "의 월급은 " + manager.getSalary());
        System.out.println(programmer.getName() + "의 월급은 " + programmer.getSalary());
    }
}
