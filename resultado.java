public class resultado {
    public static void main(String[] args) {
       Circulo c = new Circulo(1.8, 5.0, 5, 3, 1.7, 10);
        c.MostrarDatos();

        Rectángulo R = new Rectángulo(5.1, 4.7, 3.1, 5.1, 4, 7);
        R.MostrarDatos();

        Triangulo T = new Triangulo(3.0, 5.2, 5.0, 4.1, 4.0, 8);
        T.MostrarDatos();
    }
        
}