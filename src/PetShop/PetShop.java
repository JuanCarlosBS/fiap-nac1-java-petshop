package PetShop;

import javax.swing.*;
import java.io.Serializable;

public class PetShop extends Animal implements Serializable {

    private double scan ;
    private double bath;
    private double vaccinate;
    private double total;
    private Animal animal;

    public void infoPet(){
        JOptionPane.showMessageDialog(null,"Name: "+getName()+
                "\nSize: "+getSize()+
                "\nType: "+getType()+
                "\nTotal payable: R$"+getTotal(), ".:Info Pet:.", 1);
    }

    public void executeBath(){
        int bathConfirm = JOptionPane.showConfirmDialog(null, "Do you want to bath your pet?", ".:Query:.", JOptionPane.YES_NO_OPTION);
            if (bathConfirm == JOptionPane.YES_OPTION) {
                if (getSize().toUpperCase().equals("SMALL")){
                    setBath(40);
               } else if (getSize().toUpperCase().equals("MEDIUM")){
                   setBath(50);
               } else if (getSize().toUpperCase().equals("LARGE")){
                   setBath(60);
               }
            } else {
                setBath(0);
            }
    }

    public void executeVaccinate(){
        int vaccinateConfirm = JOptionPane.showConfirmDialog(null, "Do you want to vaccinate your pet?", ".:Query:.", JOptionPane.YES_NO_OPTION);
            if (vaccinateConfirm == JOptionPane.YES_OPTION) {
                if (getType().toUpperCase().equals("DOG") || getType().toUpperCase().equals("CAT")){
                    setVaccinate(100);
                } else {
                    setVaccinate(150);
                }
            } else {
                setVaccinate(0);
            }
    }

    public void executeScan(){
        int scanConfirm = JOptionPane.showConfirmDialog(null, "Do you want to examine your pet?", ".:Query:.", JOptionPane.YES_NO_OPTION);
            if (scanConfirm == JOptionPane.YES_OPTION) {
                setScan(70);
            } else {
                setScan(0);
            }
    }

    public double getQuestionExecute() {
        executeBath();
        executeVaccinate();
        executeScan();
        totalCliente();
        return total;
    }
    
    public double totalCliente(){
        setTotal(scan + vaccinate + bath);
        return this.total;
    }

    public Animal getAnimal() {
        return animal;
    }

    public double getBath() {
        return bath;
    }

    public double getVaccinate() {
        return vaccinate;
    }

    public double getTotal() {
        return total;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void setScan(double scan) {
        this.scan = scan;
    }

    public void setBath(double bath) {
        this.bath = bath;
    }

    public void setVaccinate(double vaccinate) {
        this.vaccinate = vaccinate;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}