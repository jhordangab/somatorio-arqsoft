
package engsoft;

public class Expressao 
{
    private String expressao;
    private int numero;
    private int maximo;
    private Dados dados;
    
    public Expressao(String expressao, int maximo, int numero)
    {
        this.setExpressao(expressao);
        this.setMaximo(maximo);
        this.setNumero(numero);
    }
    
    public String getExpressao() 
    {
        return expressao;
    }

    private void setExpressao(String expressao) 
    {
        this.expressao = expressao;
    }

    public int getNumero() 
    {
        return numero;
    }

    private void setNumero(int numero) 
    {
        this.numero = numero;
    }

    public int getMaximo() 
    {
        return maximo;
    }

    private void setMaximo(int maximo) 
    {
        this.maximo = maximo;
    }

    public Dados getDados() 
    {
        return dados;
    }

    public void setDados(Dados dados) 
    {
        this.dados = dados;
    }
}
