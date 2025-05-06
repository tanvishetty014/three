public class Employee {
    String name;
    int id;
    double salary;
    public Employee(String name,int id,double salary,String city)
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.city = city;
    }
    public void displayInfo()
    {
        System.out.println("Employee id: "+id);
        System.out.println("Employee name: "+name);
        System.out.println("Salary : "+salary);
    }
    public static void main(String[] args) {
        Employee e1 = new Employee("tanvi", 808, 100000,"Udupi");
        e1.displayInfo();
    }
}
