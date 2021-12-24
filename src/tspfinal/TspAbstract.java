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
public abstract class TspAbstract {
    protected int n;

    abstract public double distcid(int a, int b);
    abstract public int maisprox(int a) throws IndiceInvalido;
    
    /**
     * @return the n
     */
    protected int getn() {
        return n;
    }
}
