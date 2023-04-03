import javax.swing.JOptionPane;

public class Main {

    /*
    @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int A, B, C;
        String mensagem;
        
        mensagem = JOptionPane.showInputDialog("Informe o 1° lado do triângulo:");
        A = Integer.parseInt(mensagem); 
        
        mensagem = JOptionPane.showInputDialog("Informe o 2° lado do triângulo:");
        B = Integer.parseInt(mensagem);
        
        mensagem = JOptionPane.showInputDialog("Informe o 3° lado do triângulo:");
        C = Integer.parseInt(mensagem);
        
        if (A == B && A == C) {
            JOptionPane.showMessageDialog(null, "Os valores representam um Triangulo Equilatero."); //todos os lados iguais
        } else if (A == B || A == C) {
            JOptionPane.showMessageDialog(null, "Os valores representam um Triangulo Isosceles."); // dois lados iguais
        } else 
            JOptionPane.showMessageDialog(null, "Os valores representam um Triangulo Escaleno."); // nenhum lado igual
    }
}