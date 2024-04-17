public class Circulo{
    int radio;
    String color;
    public Circulo(int radio,String color){
        this.radio=radio;
        this.color=color;
    }
    public double calcularArea(){
        return Math.PI * radio * radio;
    }
    public double calcularPerimetro(){
        return 2 * Math.PI * radio;
    }
    public void imprimirDetalles(){
        System.out.println("Detalles del circulo: ");
        System.out.println("Radio: " + radio);
        System.out.println("Color: " + color);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro:" + calcularPerimetro());
    }


}
