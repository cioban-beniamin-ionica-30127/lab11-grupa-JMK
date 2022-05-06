package aut.utcluj.isp.ex4;

public class SalaryInfo {

    private Double totalRevenue;
    private Double monthlyRevenue;

    public SalaryInfo(Double monthlyRevenue) throws Exception {
        if (monthlyRevenue > 0) {
            this.monthlyRevenue = monthlyRevenue;
            this.totalRevenue = 0d;
        } else {
            throw new NegativeAmountException("The amount of money can't be negative");
        }
    }

    public void addSalary() {
        totalRevenue = totalRevenue + monthlyRevenue;
    }

    public void addMoney(final Double value) throws Exception {
        if (value > 0) {
            this.totalRevenue = totalRevenue + value;
        } else {
            throw new NegativeAmountException("The amount of money can't be negative");
        }
    }

    public void payTax(final Double value) throws Exception {
        if (value.compareTo(totalRevenue) < 0) {
            if (value > 0) {
                this.totalRevenue = totalRevenue - value;
            } else {
                throw new NegativeAmountException("The amount of money can't be negative");
            }
        } else {
            throw new NegativeBalanceException("You don't have enough money for this transaction.");
        }
    }

    public Double getTotalRevenue() {
        return totalRevenue;
    }

    public Double getMonthlyRevenue() {
        return monthlyRevenue;
    }

    public void setTotalRevenue(Double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public void setMonthlyRevenue(Double monthlyRevenue) {
        this.monthlyRevenue = monthlyRevenue;
    }

}
