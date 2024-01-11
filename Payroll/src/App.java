import java.util.Date;
public class App {
    public static void main(String[] args) throws Exception {
        
       Employee employee = new Employee(1, "Fawaz", "IT", 1900);

        
        double totalSalary = employee.calculateTotalSalary(5, 500);

        
        Date paymentDate = new Date();
        String paymentMethod = "Bank Transfer";
        employee.recordPaymentHistory(paymentDate, totalSalary, paymentMethod);

        
        System.out.println("Employee ID: " + employee.getEmployeeID());
        System.out.println("Name: " + employee.getName());
        System.out.println("Position: " + employee.getPosition());
        System.out.println("Basic Salary: " + employee.getBasicSalary());

        
        System.out.println("Total Salary: " + totalSalary);
        System.out.println("Payment History:");
        for (PaymentHistory payment : employee.getPaymentHistoryList()) {
            System.out.println(payment);
        }
    }
}

