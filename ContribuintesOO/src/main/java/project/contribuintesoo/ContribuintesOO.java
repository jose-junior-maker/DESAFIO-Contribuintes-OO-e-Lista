/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package project.contribuintesoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import project.contribuintesoo.entities.TaxPayer;

/**
 *
 * @author jose
 */
public class ContribuintesOO {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        List<TaxPayer> contribuintes = new ArrayList();
        
        System.out.print("Quantos contribuintes você vai digitar? ");
        Integer c = sc.nextInt();
        
        for (int i = 0; i < c; i++){
            TaxPayer tp = new TaxPayer();
            System.out.println("Digite os dados do " + (i+1) + "o contribuinte:");
            System.out.print("Renda anual com salário: ");
            tp.setSalaryIncome(sc.nextDouble());
            System.out.print("Renda anual com prestação de serviço: ");
            tp.setServiceIncome(sc.nextDouble());
            System.out.print("Renda anual com ganho de capital: ");
            tp.setCapitalIncome(sc.nextDouble());
            System.out.print("Gastos médicos: ");
            tp.setHealthSpending(sc.nextDouble());
            System.out.print("Gastos educacionais: ");
            tp.setEducationSpending(sc.nextDouble());
            contribuintes.add(tp);
            System.out.println("");
            
        }
        
        Integer k = 0;
        for (TaxPayer result : contribuintes){
            k++;
            System.out.println("Resumo do " + k + "o contribuinte:");
            System.out.printf("Imposto bruto total: %.2f", result.grossTax());
            System.out.println("");
            System.out.printf("Abatimento: %.2f", result.taxRebate());
            System.out.println("");
            System.out.printf("Imposto devido: %.2f", result.netTax());
            System.out.println("");
            System.out.println("");
            
        }
    }
}
