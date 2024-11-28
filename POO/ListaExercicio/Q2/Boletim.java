package POO.ListaExercicio.Q2;
import java.util.Scanner;

public class Boletim {
    public static void main(String[] args) {
        System.out.print("Digite o nome da disciplina: ");
        Scanner sc = new Scanner (System.in);
        String nomeDisciplina = sc.nextLine();

        System.out.print("Digite Nota1: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite Nota2: ");
        double n2 = sc.nextDouble();

        Disciplina calcular = new Disciplina();
        calcular.disciplina(nomeDisciplina);
        calcular.caclularMediaParcial(n1, n2);

        if (calcular.getMediaParcial() < 60){
            System.out.printf("Media parcial = %.2f \nDigite a nota da Prova Final: ", calcular.getMediaParcial());
            double provafinal = sc.nextDouble();
            calcular.calcularMediaFinal(provafinal);
        }
        if (calcular.getMediaParcial() >= 60){
            System.out.printf("Media parcial = %.2f \n Situação = Aprovado \n ", calcular.getMediaParcial());
        }
        else if ( calcular.getMediaFinal() < 60){
            System.out.printf("Media final = %.2f \n Situação = Reprovado \n", calcular.getMediaFinal());
        }else{
            System.out.printf("Media final = %.2f \nSituação = Aprovado \n ", calcular.getMediaFinal());
        }
    }
}
