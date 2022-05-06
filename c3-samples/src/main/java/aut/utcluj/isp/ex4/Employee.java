package aut.utcluj.isp.ex4;

/**
 * @author stefan
 */
public class Employee implements IdentityManager {

    private String firstName;
    private String lastName;
    private String cnp;
    private SalaryInfo employeeSalaryInfo;

    public Employee(String firstName, String lastName, String cnp, Double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cnp = cnp;
        try {
            this.employeeSalaryInfo = new SalaryInfo(salary);
        } catch (Exception ex) {
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCnp() {
        return cnp;
    }

    public void addSalary() {
        this.employeeSalaryInfo.addSalary();
    }

    public void addMoney(final Double money) {
        try {
            this.employeeSalaryInfo.addMoney(money);
        } catch (Exception ex) {
        }
    }

    public void payTax(final Double tax) {
        try {
            this.employeeSalaryInfo.payTax(tax);
        } catch (Exception ex) {
        }
    }

    public SalaryInfo getSalaryInfo() {
        return employeeSalaryInfo;
    }

    @Override
    public String getIdentity() {
        return this.firstName + "_" + this.lastName + "_" + this.cnp;
    }

}
