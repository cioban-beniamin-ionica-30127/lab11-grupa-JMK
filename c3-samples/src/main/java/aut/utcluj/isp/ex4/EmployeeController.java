package aut.utcluj.isp.ex4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class EmployeeController extends AbstractTableModel {

    private List<Employee> employees = new ArrayList<>();
    private String[] columns = { "Name", "CNP", "Monthly salary", "Total salary"};

    public EmployeeController() {
    }

    public boolean addEmployee(final Employee employee) {
       boolean add = true;
        for (Employee e : employees) 
            if (e.getCnp().equals(employee.getCnp())){
                add = false;
            }
        if(add==true){
            employees.add(employee);}
         return add;       
            
        
    }

    public Employee getEmployeeByCnp(final String cnp) {
        for (Employee e : employees) {
            if (e.getCnp().equals(cnp)) {
                return e;
            }
        }

        System.out.println("There is no employee with this cnp");
        return null;
    }

    public Employee updateEmployeeSalaryByCnp(final String cnp, final Double salary) {
        for (Employee e : employees) {
            if (e.getCnp().equals(cnp)) {
                e.getSalaryInfo().setMonthlyRevenue(salary);
                return e;
            }
        }
        return null;
    }

    public Employee deleteEmployeeByCnp(final String cnp) {
        for (Employee e : employees) {
            if (e.getCnp().equals(cnp)) {
                employees.remove(e);
                return e;
            }
        }
        return null;
    }

    public List<Employee> getEmployees() {

        return employees;
    }

    public int getNumberOfEmployees() {
        return employees.size();
    }

    @Override
    public int getRowCount() {
        return employees.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Employee i = employees.get(rowIndex);
        switch(columnIndex){
            case 0: return i.getFirstName() +" " + i.getLastName();
            case 1: return i.getCnp();
            case 2:return i.getSalaryInfo().getMonthlyRevenue();
            case 3: return i.getSalaryInfo().getTotalRevenue();
            default:return "N/A";
        }
    }
    
     @Override
    public String getColumnName(int index) {
        return columns[index];
    }
    public void requestData() throws IOException {

        this.fireTableDataChanged();
    }
}
