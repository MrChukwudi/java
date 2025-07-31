public class Employee extends Worker{
    private long employeeId;
    private String hireDate;

    private static long employeeNo = 1;

    public Employee(String name, String date, String hireDate){
        super(name, date);
        this.hireDate = hireDate;
        this.employeeId = employeeNo++;

    }

    public String toString(){
        return "name{Name = " + name + " Birth Date: = " + birthDate + "EndDate: = " + endDate + "employee-ID: = " + employeeId + " }";
    }
}
