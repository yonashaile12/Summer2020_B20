package day45_Constructor;
/*
 Task02:
        Create class called SalaryCalculator
                instance variables:
                    hourlyRate, weeklyHours, stateTaxRate, fedralTaxRate
                add a constructor can initialize those fields
                instance methods:
                    salary(): returns the total salary as double  (hourlyRate * weeklyHours * 48)
                    salaryAfterTax(): returns the salary after tax as double ( salary - stateTax - federalTax)
                    stateTax(): returns the total state tax as double ( salary * stateTaxRate)
                    federalTax(): returns the total federal tax as double ( salary * fedralTaxRate)

                    toString(): returns the hourlyRate, weeklyHours and salary info as calculated by salary()
 */
public class SalaryCalculator {

    double hourlyRate;
    int weeklyHour;
    double stateTaxRate;
    double federalTaxRate;

    public SalaryCalculator(double hourlyRate, int weeklyHour, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHour = weeklyHour;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }

    public double salary(){
        return (hourlyRate * weeklyHour) * 48;
    }

    public double stateTax(){
        return salary() * stateTaxRate;
    }
    public double federalTax(){
        return salary() * federalTaxRate;
    }

    public double salaryAfterTax(){
        return salary()-stateTax()-federalTax();
    }

    public String toString(){
        return "Salary: "+salary()+"\nState Tax: "+stateTax()+"\nFederal Tax: "+federalTax()+"\nSalary After Tax: "+salaryAfterTax();
    }
}
