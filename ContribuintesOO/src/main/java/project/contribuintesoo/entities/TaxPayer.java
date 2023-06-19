/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.contribuintesoo.entities;

/**
 *
 * @author jose
 */
public class TaxPayer {
    
    private Double salaryIncome;
    private Double serviceIncome;
    private Double capitalIncome;
    private Double healthSpending;
    private Double educationSpending;

    public Double getSalaryIncome() {
        return salaryIncome;
    }

    public void setSalaryIncome(Double salaryIncome) {
        this.salaryIncome = salaryIncome;
    }

    public Double getServiceIncome() {
        return serviceIncome;
    }

    public void setServiceIncome(Double serviceIncome) {
        this.serviceIncome = serviceIncome;
    }

    public Double getCapitalIncome() {
        return capitalIncome;
    }

    public void setCapitalIncome(Double capitalIncome) {
        this.capitalIncome = capitalIncome;
    }

    public Double getHealthSpending() {
        return healthSpending;
    }

    public void setHealthSpending(Double healthSpending) {
        this.healthSpending = healthSpending;
    }

    public Double getEducationSpending() {
        return educationSpending;
    }

    public void setEducationSpending(Double educationSpending) {
        this.educationSpending = educationSpending;
    }
    
    public Double salaryTax(){
        Double s = 0.00;
        if ((this.salaryIncome/12) >= 3000 && (this.salaryIncome/12) < 5000){
            s = this.salaryIncome*0.10;
        }else if((this.salaryIncome/12) >= 5000){
            s = this.salaryIncome*0.20;
        }
        
        return s;
    }
    
    public Double servicesTax(){
        return (this.serviceIncome * 0.15);
    }
    
    public Double capitalTax(){
        return (this.capitalIncome * 0.20);
    }
    
    public Double grossTax(){
        return salaryTax() + servicesTax() + capitalTax();
    }
    
    public Double taxRebate(){
        Double rebate;
        if((this.educationSpending + this.healthSpending) > grossTax()){
            rebate = grossTax()*0.30;
        }else{
            rebate = this.educationSpending + this.healthSpending;
        }
         return rebate;
    }
    
    public Double netTax(){
        return grossTax() - taxRebate();
    }
}
