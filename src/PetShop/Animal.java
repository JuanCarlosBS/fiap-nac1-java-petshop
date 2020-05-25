package PetShop;

import javax.swing.*;
import java.io.Serializable;

public class Animal implements Serializable {

    private String name;
    private String type;
    private String size;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(String size) {
        this.size = size;
    }
}