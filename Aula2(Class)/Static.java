// Agrupador de funções
public class Util {
  public static int soma(int a, int b) {
    return a + b;
  }
  public static int maior(int a, int b) {
    if (a >=b)
      return a;
    return b;
  }
}

Util.soma(3, 4);
// se fosse static não seria possível chamar a classe dessa forma
