public class Lesson05 {
    public static void main(String[] args) {
        Employee[] empArray = getEmpArray();
        System.out.println("Employees over 40: ");
        sortEmpArray(empArray);
    }

    public static Employee[] getEmpArray (){
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Иван", "Иванов", "Lead Architect", 177000.38f, 38f);
        empArray[1] = new Employee("Петр", "Петров", "CEO", 777777f, 54f);
        empArray[2] = new Employee("Сидр", "Сидоров", "Junior", 17700.99f, 18.5f);
        empArray[3] = new Employee("Мария", "Петрова", "Accountant", 666666f, 48f);
        empArray[4] = new Employee("Александр", "Александров", "Manager", 167000.38f, 42f);
        return empArray;
    }

    public static void sortEmpArray(Employee[] employees){
        for (Employee employee : employees) {
            if (employee.getEmpAge() >= 40f) {
                employee.getEmployeeInfo();
            }

        }
    }

}
