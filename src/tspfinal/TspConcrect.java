/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tspfinal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author IFNMG
 */
public class TspConcrect implements InterfaceTsp{
     protected TspAbstract tsp;
     protected int qtd;
    @Override
    public void ler(){
        File file = new File("D:\\Arquivos\\IFNMG MOC\\POO 1\\Tadeu\\Trabalho final");
        Scanner scanner;
         try{
             scanner = new Scanner(file);
             
            //lendo tipo do arquivo (MA || POS)
            String arqtipo = scanner.nextLine();
            //System.out.println(arqtipo);

            String qtdvertices = scanner.nextLine();
          
            //System.out.println(qtdv);
            int a = Integer.parseInt(qtdvertices);
            setQtd(a);
            if(arqtipo.equals("MA"))
            {
            
                double[][] matriz =new double[a][a];
                for(int i=0;i<a;i++)
                {
                    String dist = scanner.nextLine();        
                    String[] distancia = dist.split(" "); 
                    for(int j=0;j<a;j++)
                    {
                        matriz[i][j] = Double.parseDouble(distancia[j]);
                        //System.out.println(matriz[i][j]);
                    }    
                }
                tsp = new ArqMA(matriz,a);
            }
            else
            { 
                ArrayList<Ponto> plano = new ArrayList<Ponto>();
                for(int i=0;i<a;i++)
                {
                    String dist = scanner.nextLine();        
                    String[] distancia = dist.split(" ");
                    Ponto novo = new Ponto(Double.parseDouble(distancia[0]), Double.parseDouble(distancia[1]));
                    plano.add(novo);
                }
                tsp = new ArqPos(plano, plano.size());
            }        
         } 
         catch (Exception e) {
             System.out.println("arq n enctrado"+e);
         }
        
    }
    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    public int ncidades()
    {
        return getQtd();
    }
    
    public double distcid(int c, int b) throws IndiceInvalido{
        if(c<0 || c>=getQtd())
            throw new IndiceInvalido(c); //To change body of generated methods, choose Tools | Templates.
        else if(b<0 || b>=c)
            throw new IndiceInvalido(c);
        else
            return tsp.distcid(c, b);
    }

    public int maisprox(int a) throws IndiceInvalido{
        if(a<0 || a>=getQtd())
            throw new IndiceInvalido(a); //To change body of generated methods, choose Tools | Templates.
        else
            return tsp.maisprox(a);
    }
}
