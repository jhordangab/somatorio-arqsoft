
package engsoft;

import java.util.ArrayList;
import java.util.List;

public class Dados 
{    
    private List<Atributo> atributo = new ArrayList<Atributo>();

    public List<Atributo> getAtributo()
    {
        return atributo;
    }

    public void setAtributo(List<Atributo> atributo) 
    {
        this.atributo = atributo;
    }
    
    public void adicionarAtributo(Atributo atributo)
    {
        this.atributo.add(atributo);
    }
    
    public String getVariaveis()
    {
        String variaveis = "i";
        
        int index = 0;
        
        for (Atributo atributo : this.getAtributo())
        {
            variaveis += ",";
            variaveis += atributo.getIdentificador();
            
            index++;
        }
        
        return variaveis;
    }
}
