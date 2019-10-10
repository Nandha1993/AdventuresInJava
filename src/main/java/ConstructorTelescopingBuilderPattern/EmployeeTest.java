package ConstructorTelescopingBuilderPattern;

public class EmployeeTest {

  public static void main(String[] args) {
    Employee employee = new Employee.EmployeeBuilder("E123", "NandhaKumar", "26").build();
    Employee employeeCompleteInfo = new Employee.EmployeeBuilder("E123", "NandhaKumar", "26")
                                    .setAddress("Bangaluru")
                                    .setEmail("krnandhakumar@gmail.com")
                                    .setMobileNumber("7654792323")
                                    .build();
    System.out.println(employee.getMobileNumber());
    System.out.println(employeeCompleteInfo.getAddress());

  }

}
