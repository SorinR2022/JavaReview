package day2;


class Employee {

    private String name;
    private double salary;
    private String id;

    public String getName() {
        if(name == null){
            throw new RuntimeException("Employee name has not been set");
        }
        return name;
    }

    public void setName(String name) { //Write only
        if(name.isEmpty() || name.isBlank()){
            throw  new RuntimeException("Employee name can not be empty");
        }
        for(char each : name.toCharArray()){
            if(Character.isDigit(each)){
                throw  new RuntimeException("Employee name can not contain digit");
            }
            if(!Character.isLetterOrDigit(each)){
                if(each != ' '){
                    throw new RuntimeException("Employee can not contain special characters");
                }
            }
        }

        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id='" + id + '\'' +
                '}';
    }
}

public class Encapsulation {

    public static void main(String[] args) {

        Employee employee = new Employee();


        employee.setName("Daniel123");
        System.out.println(employee.getName());


    }

}
