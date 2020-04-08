/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author atila
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0, p = 0, i = 0, ac = 0, totv = 0, m = 0;
        do {
           n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                   "<html>Informe um número: <br><em>(Valor 0 interronpe)</em></html>"));
           s += n;
           if (n%2 == 0) {
               p += 1;
           } else {
               i += 1;
           }
           if (n > 100){
               ac += 1;
           }
           if (n != 0) {
               totv += 1;
           }
           m = s / totv;  
        } while (n != 0);
        JOptionPane.showMessageDialog(null, "<html>Resultado final <hr> " +
                "<br>Total de valores: " + totv + "<br>Soma desses valores: " + s + "<br>Total de pares: " 
                + p + "<br>Total de impares: " + i + "<br>Valores acima de 100: " 
                + ac + "<br>Média entre os valores: " + m + "</html>");
    }
    
}
