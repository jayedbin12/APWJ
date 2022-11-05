package domain;

public class calculator {
    private double salary;
    private double basicsalary;
    private double rent;
    private double conveyance;
    private double bonus;
    private double other;
    private double investment;
    private double tax;
    double result;
    private double netsalary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getNetsalary() {
        return netsalary;
    }

    public void setNetsalary(double netsalary) {
        this.netsalary = netsalary;
    }

    public double getBasicsalary() {
        return basicsalary;
    }

    public void setBasicsalary(double basicsalary) {
        this.basicsalary = basicsalary;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public double getConveyance() {
        return conveyance;
    }

    public void setConveyance(double conveyance) {
        this.conveyance = conveyance;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getOther() {
        return other;
    }

    public void setOther(double other) {
        this.other = other;
    }

    public double getInvestment() {
        return investment;
    }

    public void setInvestment(double investment) {
        this.investment = investment;
    }

    public double getBasicSalary(){
        basicsalary = basicsalary*12;
        return basicsalary;
    }
    public double getYearlySalary(){
        salary = salary*12;
        return salary;
    }
    public double getHouseRent(){
        rent = rent*12;
        if(rent > basicsalary){
            rent = rent - basicsalary;
        }
        else {
            rent = basicsalary-rent;
        }
        return rent;
    }
    public double getConveyanceAllowance(){
        conveyance = conveyance*12;
        if(conveyance>30000){
            conveyance = conveyance-30000;
        }
        return conveyance;
    }
    public double getFestivalBonus(){
        bonus = bonus*2;
        return bonus;
    }
    public double getOtherAllowance(){
        other = other*12;
        return other;
    }
    public double getTaxs(){
        tax = basicsalary+rent+conveyance+bonus+other;
        if (tax > 0)
        {
            result = 0;
            tax = tax-300000;
        }
        if (tax > 0)
        {
            if (tax >= 100000) {
                result = result + 5000;
            }else {
                result+=(tax*(0.05));
            }
            tax = tax - 100000;
        }
        if (tax > 0)
        {
            if (tax >= 300000) {
                result = result + 30000;
            }else {
                result+=(tax*(0.10));
            }
            tax = tax - 300000;
        }
        if (tax > 0)
        {
            if (tax >= 400000) {
                result = result + 60000;
            }else {
                result+=(tax*(0.15));
            }
            tax = tax - 400000;
        }
        if (tax > 0)
        {
            if (tax >= 500000) {
                result = result + 100000;
            }else {
                result+=(tax*(0.20));
            }
            tax = tax - 500000;
        }
        if (tax > 0)
        {
            result+=(tax*0.25);
            tax = 0;
        }
        return result;
    }

    public double getNetSalary(){
        netsalary = result/12;
        return netsalary;
    }

    public double getInvestmentTax(){
        investment = investment*0.15;
        return investment;
    }
}
