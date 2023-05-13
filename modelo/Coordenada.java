package modelo;

public class Coordenada { 
    //Atributos 
    private double x; 
    private double y; 

    //metodos
    public Coordenada(){

    }

    public Coordenada(double x , double y){
        this.x=x;
        this.y=y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public String toString()
{
    return "(" + x + "," + y + ")"; 
}
public boolean equals(Object o){
    Coordenada otra = (Coordenada)o;
    return (x==otra.getX()) && (y==otra.getY());
 }
public double calcularDistancia(Coordenada c){
    double d;
    double dx=x-c.getX(); 
    double dy= y-c.getY();
    return d= Math.sqrt(dx*dx +dy*dy);

}

    
}