import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Employee {

    private int employeeID;
    private String name;
    private String position; 
    private double basicSalary;
    private List<PaymentHistory> paymentHistoryList;

    public Employee(int employeeID, String name, String position, double basicSalary) {
        this.employeeID = employeeID;
        this.name = name;
        this.position = position;
        this.basicSalary = basicSalary;
        this.paymentHistoryList = new ArrayList<>();
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    
    public double calculateTotalSalary(double overtimeHours, double deductions) {
        double overtimeHoursRate = 1.6;
        double overtimePay = (basicSalary / 20) * overtimeHoursRate;
        double bonuses = 0.15 * basicSalary;
        return basicSalary + bonuses + overtimePay - deductions;
    }

   
    public void recordPaymentHistory(Date date, double amount, String paymentMethod) {
        PaymentHistory payment = new PaymentHistory(date, amount, paymentMethod);
        paymentHistoryList.add(payment);
    }

    public List<PaymentHistory> getPaymentHistoryList() {
        return paymentHistoryList;
    }
}

class PaymentHistory {
    
    private Date date;
    private double amount;
    private String method;

    public PaymentHistory(Date date, double amount, String method) {
        this.date = date;
        this.amount = amount;
        this.method = method;
    }

    

     @Override
    public String toString() {
        return "PaymentHistory" + "date=" + date +  ", amount=" + amount +  ", method=" + method ;
    }
}