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
public class IndiceInvalido extends Exception{
    protected int type;
    public IndiceInvalido(int type) {
        setType(type);
    }

    public String toString() {
        return "Tipo de indice invalido:" + getType();
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    } 
}
