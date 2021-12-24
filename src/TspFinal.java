    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import tspfinal.TspConcrect;

/**
 *
 * @author IFNMG
 */
public class TspFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        System.out.println("TTTT"); 
       TspConcrect obj = new TspConcrect();
       System.out.println("TTTT"); 
        obj.ler();
        System.out.println("TTTT"); 
        System.out.println("Numero de cidades:" + obj.ncidades());
        System.out.println("Distancia entre cidade 0 e 1:" + obj.distcid(0,1));
        System.out.println("Cidade mais prox de 2:" + obj.maisprox(2));
    }
    
}
