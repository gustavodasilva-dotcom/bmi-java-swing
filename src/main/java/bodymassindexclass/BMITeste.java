/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodymassindexclass;

import java.text.DecimalFormat;

/**
 *
 * @author gusta
 */
public class BMITeste {
    public static void main(String[] args) {
        BodyMassIndex bmi = new BodyMassIndex();
        DecimalFormat df = new DecimalFormat("#,###.00");
        
        bmi.setWeight(72.0);
        bmi.setHeight(1.76);
        Double result = bmi.calculateBmi();
        
        System.out.print(df.format(result) + "\n");
        
        System.out.print(bmi.getBmiResult());
    }
}
