package ConstructorTelescopingBuilderPattern;

// Builder Pattern is most suitable pattern when to work with multiple attributes in constructor
// Object state goes inconsistent when handling many attributes that are optional/mandatory
//Here the builder pattern overcomes and make the java object immutable and thread safe
/**
 * 
 * @author Nandha Kumar KR
 *
 */
public class Employee {
  
  private final String employeeId;
  
  private final String employeeName;
  
  private final String age;
  
  private final String address;
  
  private final String emailId;
  
  private final String mobileNumber;
  
  
  public static class EmployeeBuilder {
    private final String employeeId;
    
    private final String employeeName;
    
    private final String age;
    
    private String address;
    
    private String emailId;
    
    private String mobileNumber;
    
    
    EmployeeBuilder(String empId, String empName, String empAge ) {
      this.employeeId = empId;
      this.employeeName = empName;
      this.age = empAge;
      }
    public EmployeeBuilder setAddress(String empAddress) {
      this.address = empAddress;
      return this;
    }
    
    public EmployeeBuilder setEmail(String empEmail) {
      this.emailId = empEmail;
      return this;
    }
    public EmployeeBuilder setMobileNumber(String mobileNumber) {
      this.mobileNumber = mobileNumber;
      return this;
    }
    
    Employee build() {
      return new Employee(this);
    }
    
  }
  
  private Employee(EmployeeBuilder builder) {
    this.employeeId = builder.employeeId;
    this.employeeName = builder.employeeName;
    this.age = builder.age;
    this.address = builder.address;
    this.emailId = builder.emailId;
    this.mobileNumber = builder.mobileNumber;
  }

  public String getEmployeeId() {
    return employeeId;
  }

  public String getEmployeeName() {
    return employeeName;
  }

  public String getAge() {
    return age;
  }

  public String getAddress() {
    return address;
  }

  public String getEmailId() {
    return emailId;
  }

  public String getMobileNumber() {
    return mobileNumber;
  }

}
