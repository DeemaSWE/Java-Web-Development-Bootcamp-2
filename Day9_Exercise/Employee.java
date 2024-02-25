package Day9_Exercise;

public class Employee {

    private String id;
    private String name;
    private int salary;

    public Employee(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    //Calculates the employee's annual salary
    public int getAnnualSalary(){
        return salary * 12;
    }

    //Increases the salary by the specified percentage and returns the new salary
    public int raisedSalary(int percent){
        return salary += salary * percent / 100;
    }

    @Override
    public String toString() {
        return "Employee:" +
                "\nid = " + id +
                "\nname = " + name +
                "\nsalary = " + salary;
    }
}
