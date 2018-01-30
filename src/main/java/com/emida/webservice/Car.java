/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emida.webservice;

/**
 *
 * @author krodriguez
 */
public class Car {

    private String color;
    private String type;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Car(String color, String type) {
        this.color = color;
        this.type = type;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" + "color=" + color + ", type=" + type + '}';
    }
    
    public void test(){
        
    }

}
