package POO.ListaClassAbstratas.Q1;

public class Main {
    public static void main(String[] args) {
        Esfera esfera = new Esfera(3.0);
        Cubo cubo = new Cubo(2.0);     

        System.out.println("Volume da esfera: " + esfera.getVolume());
        System.out.println("Volume do cubo: " + cubo.getVolume());
    }
}
