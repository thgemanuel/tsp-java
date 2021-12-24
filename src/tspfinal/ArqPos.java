/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tspfinal;

import java.util.ArrayList;

/**
 *
 * @author IFNMG
 */
public class ArqPos extends TspAbstract {
    private ArrayList<Ponto> plano = new ArrayList<Ponto>();
    private int n;
    public ArqPos(ArrayList<Ponto> plano, int n){
        this.plano = plano;
        this.n = n;
    }

    @Override
    public double distcid(int a, int b){
        Ponto aux1 = plano.get(a);
        Ponto aux2 = plano.get(b);
        return Math.sqrt(Math.pow(aux1.getx() - aux2.getx(), 2.0) + Math.pow(aux1.gety() - aux2.gety(), 2.0));
    }

    @Override
    public int maisprox(int a) throws IndiceInvalido{ 
        int n = plano.size(),i;   
        int cidmaisprox = 0;
        double dist=99999.0, min = 999999.0;

        for(i=0;i<n;i++)
        {
            if(i!=a)
                dist = distcid(a,i);

            if(dist<min){
                min = dist;
                cidmaisprox = i;
            }
        }

        return cidmaisprox;
    }
}
