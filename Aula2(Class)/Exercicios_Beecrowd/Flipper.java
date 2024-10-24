package Exercicios_Beecrowd;
public class Flipper {
    public static String flipper(int p,int r){
        String resposta;
        switch (p-r) {
            case 0 : resposta = "A";break;
            case 1 : resposta = "B";break;
            case -1 : resposta = "C";break;
            default:
                break;
        };
        return resposta;
    }
    public static void main(String[] args) {
        int p = 1;
        int r = 0;
        String resposta = flipper(p,r);
    }
}
// caso 1 = p-r --> 1-1= A
// caso 2 = p-r --> 1-0= B
// caso 3 = p-r --> 0-0 ou 0-1= C
//  p*2+r ---> 2**0 2**1