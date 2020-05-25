package PetShop;

import javax.swing.*;

public class ClientePetShop {

    public static void main(String[] args) {

        PetShop animal = new PetShop();
        String name = JOptionPane.showInputDialog(null ,"Enter your pet's name: ", ".:Register:.", 1);
        animal.setName(name);
        String size = JOptionPane.showInputDialog(null ,"Size of Pet [ SMALL | MEDIUM | LARGE]", ".:Register:.", 1);
        animal.setSize(size);
        String type = JOptionPane.showInputDialog(null ,"Type of Pet [DOG | CAT | OUTHERS]", ".:Register:.", 1);
        animal.setType(type);
        animal.getQuestionExecute();

        animal.infoPet(); 

        PetShop animal1 = new PetShop();
        String name1 = JOptionPane.showInputDialog(null ,"Enter your pet's name: ", ".:Register:.", 1);
        animal1.setName(name1);
        String size1 = JOptionPane.showInputDialog(null ,"Size of Pet [ SMALL | MEDIUM | LARGE]", ".:Register:.", 1);
        animal1.setSize(size1);
        String type1 = JOptionPane.showInputDialog(null ,"Type of Pet [DOG | CAT | OTHERS]", ".:Register:.", 1);
        animal1.setType(type1);
        animal1.getQuestionExecute();

        animal.infoPet(); 

        PetShop animal2 = new PetShop();
        String name2 = JOptionPane.showInputDialog(null ,"Enter your pet's name: ", ".:Register:.", 1);
        animal2.setName(name2);
        String size2 = JOptionPane.showInputDialog(null ,"Size of Pet [ SMALL | MEDIUM | LARGE]", ".:Register:.", 1);
        animal2.setSize(size);
        String type2 = JOptionPane.showInputDialog(null ,"Type of Pet [DOG | CAT | OTHERS]", ".:Register:.", 1);
        animal2.setType(type2);
        animal2.getQuestionExecute();

        animal2.infoPet(); 

        PetShop animal3 = new PetShop();
        String name3 = JOptionPane.showInputDialog(null ,"Enter your pet's name: ", ".:Register:.", 1);
        animal3.setName(name3);
        String size3 = JOptionPane.showInputDialog(null ,"Size of Pet [ SMALL | MEDIUM | LARGE]", ".:Register:.", 1);
        animal3.setSize(size3);
        String type3 = JOptionPane.showInputDialog(null ,"Type of Pet [CACHORRO | GATO | OUTROS]", ".:Register:.", 1);
        animal3.setType(type3);
        animal3.getQuestionExecute();

        animal3.infoPet(); 

        PetShop animal4 = new PetShop();
        String name4 = JOptionPane.showInputDialog(null ,"Enter your pet's name: ", ".:Register:.", 1);
        animal4.setName(name4);
        String size4 = JOptionPane.showInputDialog(null ,"Size of Pet [ SMALL | MEDIUM | LARGE]", ".:Register:.", 1);
        animal4.setSize(size4);
        String type4 = JOptionPane.showInputDialog(null ,"Type of Pet [CACHORRO | GATO | OUTROS]", ".:Register:.", 1);
        animal4.setType(type4);
        animal4.getQuestionExecute();

        animal4.infoPet(); 

    }
}