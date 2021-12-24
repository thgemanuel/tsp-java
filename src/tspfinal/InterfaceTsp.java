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
public interface InterfaceTsp {
    abstract public void ler();
    abstract public int ncidades();
    abstract public double distcid(int a, int b) throws IndiceInvalido;
    abstract public int maisprox(int a) throws IndiceInvalido;
}
