
package engsoft;

public class Main 
{
    public static void main(String[] args) 
    {
//        Expressão a ser calculada
        String expressao = "(funcI(z) * funcI(w)) + (i + x + y)";
//        Valor máximo do somatório, que vai de número (i) até o máximo
        int maximo = 5;
//        Valor número(i) do somatório, que se alterará de um em um até o máximo
        int numero = 3;

//        Classe que armazena os valores para o cálculo da expressão
        Expressao model = new Expressao(expressao, maximo, numero);
        
//        Valores para atributos simples devem ser informados 1 vez
        Atributo at1 = new Atributo("x");
        at1.adicionarValor(3);
        
//        Valores para atributos simples devem ser informados 1 vez
        Atributo at2 = new Atributo("y");
        at2.adicionarValor(7);
        
//        Caso o valor se altere dependendo de i, é necessário informar os valores "((máximo - número) + 1)" vezes
        Atributo at3 = new Atributo("z");
        at3.adicionarValor(2);
        at3.adicionarValor(4);
        at3.adicionarValor(1);

//        Caso o valor se altere dependendo de i, é necessário informar os valores "((máximo - número) + 1)" vezes
        Atributo at4 = new Atributo("w");
        at4.adicionarValor(3);
        at4.adicionarValor(9);
        at4.adicionarValor(5);
        
        Dados dados = new Dados();
        dados.adicionarAtributo(at1);
        dados.adicionarAtributo(at2);
        dados.adicionarAtributo(at3);
        dados.adicionarAtributo(at4);
        
        model.setDados(dados);
        
//        Classe que realiza os tratamentos e cálculos da expressão
        Somatorio somatorio = new Somatorio();
        somatorio.setExpressao(model);
        
//        Visualizando o valor
        System.out.println("A expressão a ser calculada é: " + expressao + "\n");
        
        System.out.println("O valor final do somatório é " + somatorio.calculaExpressao() + "\n");
        
//        ____________________

        String expressao1 = "(x * i) * funcI(z)";
        int maximo1 = 10;
        int numero1 = 1;
        Expressao model1 = new Expressao(expressao1, maximo1, numero1);
        Atributo at11 = new Atributo("x");
        at11.adicionarValor(5);
        Atributo at31 = new Atributo("z");
        at31.adicionarValor(3);
        at31.adicionarValor(9);
        at31.adicionarValor(7);
        at31.adicionarValor(2);
        at31.adicionarValor(1);
        at31.adicionarValor(2);
        at31.adicionarValor(3);
        at31.adicionarValor(3);
        at31.adicionarValor(2);
        at31.adicionarValor(6);
        Dados dados1 = new Dados();
        dados1.adicionarAtributo(at11);
        dados1.adicionarAtributo(at31);
        model1.setDados(dados1);        
        Somatorio somatorio1 = new Somatorio();
        somatorio1.setExpressao(model1);
        System.out.println("A expressão a ser calculada é: " + expressao1 + "\n");
        System.out.println("O valor final do somatório é " + somatorio1.calculaExpressao() + "\n");

    }
}
