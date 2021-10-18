/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moveshape;

import mvc.controller.Controller;

/**
 *
 * @author Netbeans
 */
public class MoveShape {
    static int simpleDeliteli(int x){
        int s=1;
        int i;
        int flag = 1;
        int del;del = 1;
        while(flag ==1)
        {
            flag = 0;
            
        for(i=2;i*i<=x;i++){
            if(x%i==0 ){
               if(del!=i) {
                   s+=i;
                   del = i;
               }
            
            x=x/i;
            flag=1;
            break;
            }
               
        }
        
    }
        return s;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int y= simpleDeliteli(98);
//        System.out.println("y="+y);
        new Controller();
    }
    
}
