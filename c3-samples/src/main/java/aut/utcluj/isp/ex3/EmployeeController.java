package aut.utcluj.isp.ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author stefan
 */
public class EmployeeController {

     private List<Employee> employees = new ArrayList<>();

    public EmployeeController() {
    }

    public void addEmployee(final Employee employee) {
        if (!employees.contains(employee)) {
            employees.add(employee);
        }
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
                e.setSalary(salary);
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

}
