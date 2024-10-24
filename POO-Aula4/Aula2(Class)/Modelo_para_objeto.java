// Modelo para objetos
public class Modelo_para_objeto {
  private int face = 1; // Atributo
  // unica forma de alterar a face é chamando o método de rolar()
  public void rolar() {
    face = (int)(Math.random() * 6 + 1); // (int)(math.random()) --> Converte double para inteiro
    // this.face = (int)(Math.random() * 6 + 1); --> this = forma de se referir ao próprio objeto
  }
  // public void setFace(int face) { ---> Permite a alteração da face, por exemplo colocar a face especificamente no 7
    //if (face >=1 && face <=6) this.face = face; 
  public int getFace() {
    Return face;
  }
}

Dado dado1 = new Dado();
dado1.rolar();
System.out.println(dado1.getFace());

// sem static pois cada objeto terá uma face diferente;
// difereça dele para o static é poder chamar o metodo dentro do objeto;
// no static deeve ser criar o objeto dentro da class;
