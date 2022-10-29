public class Rectángulo extends Figura {

    public Rectángulo(double coorx, double coory, double alto, double perimetro, double tipoDecimal, double area) {
        super(coorx, coory, alto, perimetro, tipoDecimal, area);
        
    }

    public void MostrarDatos(){
        System.out.println("Rectángulo"+"\n cordenada x: "+
        getCoorx()+
        "\n cordenada y: "+
        getcoory()+
        "\n alto: "+
        getalto()+
        "\n perimetro: "+
        getperímetro()+
        "\n Tipo decimal: "+
        gettipoDecimal()+
        "\n Area: "+
        getArea()+"\n");
        
    }
    
}
