/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_nombres;
import java.util.*;
/**
 *
 * @author CASA
 */
public class Lista_nombres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre[]=new String[100],aux=" ",nom=" ";
        int res=0,cont=0,aux1=0;
        Scanner lec =new Scanner(System.in);
        System.out.println("Ingrese lista de nombres");
        do{
            System.out.println("Nombre "+(1+cont));
            nombre[cont]=lec.nextLine();cont++;
            do{
              System.out.println("Hay mas nombres? Si=1 No=0");
              try{
                aux=lec.nextLine();
                res=Integer.parseInt(aux);aux1=0;
                if(res!=1&&res!=0){
                    System.out.println("Dato no valido precione enter");
                    aux1=1;res=0;
                }
              }catch(NumberFormatException ex){
                  System.out.println("Ingreso mal los dato vuelva a intentar");
                  aux1=1;res=0;
              }
             
            }while(aux1==1);
            aux1=0;
        }while(res!=0);
        cont=0;
        for(int i=0;i<nombre.length;i++){
            if(nombre[i]!=null){
             System.out.println(" nombre  "+(i+1)+" "+nombre[i]);
             cont++;
            }else{
                i=nombre.length+1;
            }
        }
        int a=0; aux=" ";
        for(int i=0;i<nombre.length;i++){
            for(int j=0;j<cont-1;j++){
                   aux=nombre[j];
                   if(nombre[j+1]!=null){
                       nom=nombre[j+1];
                   }
                   if(aux.compareTo(nom)>0){
                       nombre[j]=nom;nom=" ";
                       nombre[j+1]=aux;aux=" ";
                       a++;
                   }
            }
            if(a==0){
                i=nombre.length+1;
            }
            a=0;
        }
        for(int i=0;i<nombre.length;i++){
            if(nombre[i]!=null){
            System.out.println("nombre "+(i+1)+" "+nombre[i]);
            }else{
                i=nombre.length+1;
            }
        }
        
        
    }
}
