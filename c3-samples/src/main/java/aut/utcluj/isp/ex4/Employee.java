package aut.utcluj.isp.ex4;

public class Employee implements IdentityManager {

    private String firstName;
    private String lastName;
    private String cnp;
    private SalaryInfo employeeSalaryInfo;

    public Employee() {
    }

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

    public void payTax(final Double tax) throws Exception {

        this.employeeSalaryInfo.payTax(tax);

    }

    public SalaryInfo getSalaryInfo() {
        return employeeSalaryInfo;
    }

    @Override
    public String getIdentity() {
        return this.firstName + "_" + this.lastName + "_" + this.cnp;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public void setEmployeeSalaryInfo(SalaryInfo employeeSalaryInfo) {
        this.employeeSalaryInfo = employeeSalaryInfo;
    }

}
