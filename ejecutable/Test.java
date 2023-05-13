package ejecutable;

import javax.sound.sampled.SourceDataLine;

import modelo.Coordenada;

public class Test
{
    public static void main(String[] args) {
        Coordenada c1=new Coordenada(0, 0);
        System.out.println("Coordenada 1: "+"("+c1.getX()+","+c1.getY()+")");
        System.out.println("x = "+ c1.getX());
        System.out.println("y = " + c1.getY());
           

            Coordenada c2= new Coordenada(9 , 5);
            System.out.println("Coordenada 2: "+"("+c2.getX()+","+c2.getY()+")");
            System.out.println("x = "+ c2.getX());
            System.out.println("y = " + c2.getY());
        System.out.println("\n");
            if (c1.equals(c2)){
                System.out.println("Las coordenadas son iguales");
            }
            else{
                System.out.println("Las coordenadas son diferentes");
            }
double distacnia= c1.calcularDistancia(c2);
            System.out.println("\n");
            System.out.println("La distancia entre los puntos es: " +distacnia);
           
     }

      

}

