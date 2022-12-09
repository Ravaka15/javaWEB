/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ZoR
 */
public class Operation {
    private int nbr1;
    private int nbr2;

    public int getAddition() {
        return nbr1 + nbr2;
    }
    
    public int getSoustraction() {
        return nbr1 - nbr2;
    }
    
    public int getMultiplication() {
        return nbr1*nbr2;
    }
    
    public int getDivision() {
        return nbr1/nbr2;
    }
            
            
    public void setResultat(int resultat) {
    }
    public Operation() {
    }

    public Operation(int nbr1, int nbr2, int resultat) {
        this.nbr1 = nbr1;
        this.nbr2 = nbr2;
    }

    public int getNbr1() {
        return nbr1;
    }

    public void setNbr1(int nbr1) {
        this.nbr1 = nbr1;
    }

    public int getNbr2() {
        return nbr2;
    }

    public void setNbr2(int nbr2) {
        this.nbr2 = nbr2;
    }
    public String execute(){
        return "success";
    }
}

