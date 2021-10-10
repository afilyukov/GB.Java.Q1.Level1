public class Employee {
    private String empFirstName;
    private String empLastName;
    private String empAppoitment;
    private float empSalary;
    private float empAge;

    public float getEmpAge() {
        return empAge;
    }



    public Employee(String firstName, String lastName, String appoitment, float salary, float age){
        this.empFirstName = firstName;
        this.empLastName = lastName;
        this.empAppoitment = appoitment;
        this.empSalary = salary;
        this.empAge = age;
    }

    public void getEmployeeInfo (){
        System.out.printf("First name is %s. ", this.empFirstName);
        System.out.printf("Last name is %s. ", this.empLastName);
        System.out.printf("His appoitment is %s. ", this.empAppoitment);
        System.out.printf("Salary is %.2f. ", this.empSalary);
        System.out.printf("Age is %s.\n", this.empAge);

    }
}
