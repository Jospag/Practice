package practise;

public class EmployeeDetailsTest {
    public static void main(String[] args) {
        Date birthDate = new Date(18, 9, 1991);
        Date hiredate = new Date(9, 7, 2022);
        EmployeeDetails employeeDetails = new EmployeeDetails("Emmanuel",
                "Olorunnishola", birthDate, hiredate);

        System.out.println(employeeDetails);
    }
}
