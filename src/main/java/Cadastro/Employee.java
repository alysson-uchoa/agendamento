package Cadastro;

public class Employee {
    static int cod = 1;

    private String name;
    private int position, id;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, int position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        id = cod;
        cod++;
    }
}
