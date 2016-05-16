
package engsoft;

import java.util.ArrayList;
import java.util.List;

public class Atributo 
{    
    private String identificador;
    private List<Integer> valores = new ArrayList<>();

    public Atributo(String identificador)
    {
        this.setIdentificador(identificador);
    }
    
    public String getIdentificador() 
    {
        return identificador;
    }

    private void setIdentificador(String identificador) 
    {
        this.identificador = identificador;
    }

    public List<Integer> getValores() 
    {
        return valores;
    }

    public void setValores(List<Integer> valores) 
    {
        this.valores = valores;
    }
    
    public void adicionarValor(int valor)
    {
        this.valores.add(valor);
    }

}
