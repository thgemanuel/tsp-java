/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tspfinal;

/**
 *
 * @author IFNMG
 */
public class Ponto {
    private double x;
    private double y;
    
    public Ponto(double x,double y)
    {
        this.x = x;
        this.y = y;
    }   

    public void setx(double x) {
        this.x = x;
    }

    public void sety(double y) {
        this.y = y;
    }

    public double getx() {
        return x;
    }
    
    public double gety() {
        return y;
    }
}
