
package engsoft;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class Somatorio 
{
    private Expressao expressao;
    
    static final String REGEX_FUNC = "funcI\\((\\w)\\)";
    
    public double calculaExpressao() 
    {
        double resultado = 0.0;
        
        int idx = 0;
        
        for(int i = this.getExpressao().getNumero(); i <= this.getExpressao().getMaximo(); i ++)
        {
            String variaveis = this.expressao.getDados().getVariaveis();
            String[] vars = variaveis.split(",");
            
            String expressao = trataExpressao(this.expressao, idx);
            
//            double result = new ExpressionBuilder("cos(x)")
//                .variables("x")
//                .build()
//                .setVariable("x", Math.PI)
//                .evaluate();

            Expression e = new ExpressionBuilder(expressao)
            .variables(vars)
            .build();
            
            int index = 0;
            
            for (Atributo atributo : this.expressao.getDados().getAtributo())
            {
                for (int valor : atributo.getValores())
                {
                    e.setVariable(atributo.getIdentificador(), valor);
                }
                index++;
            }
            
            e.setVariable("i", i);
            System.out.println("Quando o número(i) = " + i + " o valor da expressão é = " +  e.evaluate() +"\n");
            
            resultado += e.evaluate();
            
            idx ++;
            
        }
        
        return resultado;
    }

    private String trataExpressao(Expressao expressao, int i) 
    {
        String expressaoTratada = expressao.getExpressao();
        
        Pattern MY_PATTERN = Pattern.compile(REGEX_FUNC);

        Matcher matcher = MY_PATTERN.matcher(expressao.getExpressao());
        
        while (matcher.find()) 
        {
            String identificador = matcher.group(1);
            for (Atributo atributo : this.expressao.getDados().getAtributo())
            {
                if(atributo.getIdentificador().equals(identificador))
                {
                    expressaoTratada = expressaoTratada.replace("funcI(" + identificador + ")", atributo.getValores().get(i).toString());
                }
            }
            
        }
        
        return expressaoTratada;
    }
    
    public Expressao getExpressao() 
    {
        return expressao;
    }

    public void setExpressao(Expressao expressao) 
    {
        this.expressao = expressao;
    }
}
