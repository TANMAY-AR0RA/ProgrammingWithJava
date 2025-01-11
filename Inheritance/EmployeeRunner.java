public class EmployeeRunner {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setName("John Doe");
        employee.setPhone("123-456-7890");
        employee.setEmail("abc@gmail.com");
        employee.setEmployer("ABC Company");
        employee.setEmployeeGrade('A');
        employee.setSalary(100000);
        employee.setTitle("Software Engineer");


        System.out.println(employee);

    }
}
