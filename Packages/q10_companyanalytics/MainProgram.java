import com.company.analytics.sales.SalesReport;
import com.company.analytics.hr.EmployeeReport;

public class MainProgram {
    public static void main(String[] args) {
        SalesReport sales = new SalesReport();
        EmployeeReport hr = new EmployeeReport();

        System.out.println("===== Combined Company Report =====\n");
        sales.printSalesData();
        System.out.println();
        hr.printEmployeeData();
    }
}
