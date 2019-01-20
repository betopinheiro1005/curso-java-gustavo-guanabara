package exerciciorepita;
import javax.swing.JOptionPane;
public class ExercicioRepita {
    public static void main(String[] args) {
        // JOptionPane.showMessageDialog(null, "Olá, Mundo!","Boas vindas!",JOptionPane.INFORMATION_MESSAGE);
        
        /* int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número: "));
        JOptionPane.showMessageDialog(null, "Você digitou o valor " + n); */
        
        int n, s = 0, tv = 0, tp = 0, ti = 0, ac = 0, mv = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,"<html>Informe um número<br /><em>(valor 0 interrompe)</em></html>"));
            s += n;
            tv++;
            if (n%2==0){
                tp++;
            } else {
                ti++;
            }
            if (n > 100){
                ac++;
            }
        } while (n != 0);
        
        mv = s / tv; 
        
        JOptionPane.showMessageDialog(null, "<html>Total de Valores: " + tv + "<br />" + 
                                            "Total de pares: " + tp + "<br />" + 
                                            "Total de ímpares: " + ti + "<br />" +
                                            "Acima de cem: " + ac + "<br />" +
                                            "Média dos valores: " + mv + "</html>");
    }
}
