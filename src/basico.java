import java.util.Scanner;
public class basico {

    public static void soma(int a, int b) {
        int z = a + b;
        System.out.println(z);
    }
    public static void subtracao(int a, int b){
        int y = a - b;
        System.out.println(y);
    }
    public static void divisao(int a,int b){
        int z = a/b;
        System.out.println(z);
    }
    public static void multiplicacao(int a,int b){
        int z = a*b;
        System.out.println(z);
    }

    public static void main(String[] args) {
        System.out.println("Insira os números a serem processados");
        Scanner ler = new Scanner(System.in);
        int a = ler.nextInt();
        int b = ler.nextInt();
        System.out.println("soma igual a:");
        basico.soma(a,b);
        System.out.println("subtração igual a:");
        basico.subtracao(a,b);
        System.out.println("multiplicação igual a:");
        basico.multiplicacao(a,b);
        System.out.println("divisão igual a:");
        basico.divisao(a,b);
    }
}
