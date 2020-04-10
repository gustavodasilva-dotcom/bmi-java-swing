/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodymassindexclass;

/**
 *
 * @author gusta
 */
public class BodyMassIndex {
    // Attributes
    private Double height;
    private Double weight;
    private Double bmi;
    private String bmiResult;
    
    // Methods
    public Double calculateBmi() {
        Double result = this.getWeight() / (Math.pow(this.getHeight(), 2));
        
        if (result < 18.5) {
            this.setBmiResult("Underweight");
        } else if (result < 24.9) {
            this.setBmiResult("Normal weight");
        } else if (result < 29.9) {
            this.setBmiResult("Overweight");
        } else {
            this.setBmiResult("Obesity");
        }
        
        return result;
    }
    
    // Getters, Setters and Constructor
    public BodyMassIndex() {
        
    }
    public Double getHeight() {
        return this.height;
    }
    public void setHeight(Double height) {
        this.height = height;
    }
    public Double getWeight() {
        return this.weight;
    }
    public void setWeight(Double weight) {
        this.weight = weight;
    }
    public Double getBmi() {
        return this.bmi;
    }
    public void setBmi(Double bmi) {
        this.bmi = bmi;
    }
    public String getBmiResult() {
        return this.bmiResult;
    }
    public void setBmiResult(String bmiResult) {
        this.bmiResult = bmiResult;
    }
}
