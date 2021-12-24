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
public class ArqMA extends TspAbstract {
    protected double matriz[][];
    public ArqMA(double[][] matriz, int n){
        this.matriz = matriz;      
        this.n = n; 
    }

    @Override
    public double distcid(int a, int b){
        return matriz[a][b];        
    }

    @Override
    public int maisprox(int a) throws IndiceInvalido{
        if(a<0 || a>matriz.length)
        {
            throw new IndiceInvalido(a);
        }
        
        double min = 999999.0;        
        int cidmaisprox = 0,i;
        for(i= 0; i <matriz[a].length; i++){
            if(a!=i){
                if(matriz[a][i]<min){
                    min = matriz[a][i];
                    cidmaisprox = i;
                }
            } 
        }
        return cidmaisprox;
    }
}
