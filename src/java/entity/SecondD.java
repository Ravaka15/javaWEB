/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ZoR
 */
public class SecondD {
    private int nombre1;
    private int nombre2;
    private int nombre3;
    private int delta;
    private int x1;
    private int x2;
    
    public SecondD() {
    }

    public SecondD(int nombre1, int nombre2, int nombre3, int delta, int x1, int x2) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.nombre3 = nombre3;
        this.delta = delta;
        this.x1 = x1;
        this.x2 = x2;
    }

    public boolean getAffResultat(){
        return true;
    }
    public int getNombre1() {
        return nombre1;
    }

    public void setNombre1(int nombre1) {
        this.nombre1 = nombre1;
    }

    public int getNombre2() {
        return nombre2;
    }

    public void setNombre2(int nombre2) {
        this.nombre2 = nombre2;
    }

    public int getNombre3() {
        return nombre3;
    }

    public void setNombre3(int nombre3) {
        this.nombre3 = nombre3;
    }

    public int getDelta() {
        return (nombre2*nombre2)-nombre3*4*nombre1;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public String execute() {
        return "success";
    }
   
}
