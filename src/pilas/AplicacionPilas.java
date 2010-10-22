/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pilas;

/**
 *
 * @author josue
 */
public class AplicacionPilas {

    public boolean validadParentesis(String cadena){
        boolean valido=true;
        StackList pila = new StackList();
        for(int i=0;i<cadena.length() && valido;i++){
            if(cadena.charAt(i)== '(')
                pila.push(cadena.charAt(i));
            else
            {
                try{
                    if(cadena.charAt(i)==')')
                pila.pop();
                    else
                        valido=false;
                }
                catch(Exception e){
                    valido=false;
                }
            }
        }
        valido &=pila.isEmpty();
        return valido;
    }
    
    public boolean validaPalindromo(String s){
        boolean valido = true;
        StackList pila = new StackList();

            for(int i=0;i<((s.length()/2)) && valido;i++){
                pila.push(s.charAt(i));
            }
            for(int j=((s.length()+1)/2);j<s.length();j++)
                if(s.charAt(j)==pila.top()){
                    pila.pop();
                }
                else{
                valido=false;
                }

        valido &=pila.isEmpty();
        return valido;
    }
    
    public static void main(String args[]){
        AplicacionPilas appPilas = new AplicacionPilas();
//        if(appPilas.validadParentesis("()"))
//        System.out.println("La cadena de parentesis es valida");
//        else
//            System.out.println("LA cadena de parentesis es No valida");
        if(appPilas.validaPalindromo("abba"))
            System.out.println("La cadena es palindromo");
        else
            System.out.println("La cadena es No palindromo");

    }

}
