import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws Exception {
        int num1,num2;
        String operacao;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo à calculadora:");
        System.out.println("Qual operação deseja?\n + = Soma \n - = Subtração \n * = Multiplicação \n / = Divisão");
        operacao = sc.next();
        System.out.println("Insira o primeiro numero: ");
        num1 = sc.nextInt();
        System.out.println("Insira o segundo numero: ");
        num2 = sc.nextInt();
        switch(operacao){
            case "+":{
                System.out.println(Somar(num1,num2));
                break;
            }
            case "-":{
                System.out.println(Subtrair(num1, num2));
                break;
            }
            case "*":{
                System.out.println(Multiplicar(num1, num2));
                break;
            }
            case "/":{
                System.out.println(Dividir(num1, num2));
                break;
            }
            default:{
                System.out.println("Operação Inválida");
            }
        }
        System.out.println("Finalizando Programa, obrigado");

    }

    public static float Somar(int num1,int num2){
        return num1 + num2;
    }
    public static float Subtrair(int num1,int num2){
        return num1 - num2;
    }
    public static float Multiplicar(int num1,int num2){
        return num1*num2;
    }
    public static double Dividir(int num1,int num2){
        return num1/num2;
    }
}
