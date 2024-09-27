package atvd10;
public class calculo{
    private double resultado;//resultado = double,so usa em calculo
    private int y = 3;//declarei y, acessivel dentro de calculo
    public void soma(){ //ñ retorna valor, cria variaveis locais, calcula e imprime, local pq ta em soma
        int x = 2;
        int y = 3;
        resultado = x + y;
        System.out.println("Soma = " +resultado);
    }
    public void subtracao(){ //ñ retorna valor,cria variaveis locais, calcula e imprime, local pq ta em subtracao
        int x = 5;
        resultado = x - y;// da erro pq o y ta dentro de soma, p/ da certo tem q declarar em calculo, como esta na linha 4
        System.out.println("Subtracao = " +resultado);
    }
}