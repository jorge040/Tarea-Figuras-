import javax.swing.ComboBoxEditor;

public class Figura {

 private double coorx ;
 private double coory;
 private double alto ;
 private double perímetro;
 private double tipoDecimal;
 private double Area;

    public Figura(double coorx, double coory, double alto, double perimetro, double tipoDecimal, double area){
        this.coorx = coorx;
        this.coory = coory;
        this.alto = alto;
        this.perímetro = perimetro;
        this.tipoDecimal = tipoDecimal;
        this.Area = area;
    }

    public double getCoorx() {
        return coorx;
    }

    public void setCoorx(double coorx) {
        coorx = coorx;
    }
    public double getcoory(){
        return coory;

    }
    public void setcoory(double coory){
        coory = coory;

    }
    public double getalto(){
        return alto;

    }
    public void setalto(double alto){
        alto = alto;

    }
    public double getperímetro(){
        return perímetro;

    }
    public void setperimetro(double perímetro){
        perímetro = perímetro;

    }
    public double gettipoDecimal(){
        return tipoDecimal;

    }
    public void settipoDecimal(double tipoDecimal){
        tipoDecimal = tipoDecimal;

    }
    public double getArea(){
        return Area;

    }
    public void setarea(double Area){
        Area = Area;

    }

    
}
