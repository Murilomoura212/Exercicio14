import javax.swing.JOptionPane;

public class Exercicio14{

    public static void main(String[] args) {
        double n1, n2;
             n1 = Double.parseDouble(JOptionPane.showInputDialog("Coloque um numero: ")); 
             n2 = Double.parseDouble(JOptionPane.showInputDialog("Coloque outro numero: ")); 
             
               String[] opcoes = {"Adição", "Subtração", "Multiplicação", "Divisão"};
        int escolha = JOptionPane.showOptionDialog(
            null,
            "Escolha a operação:",
            "Operação",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            null,
            opcoes,
            opcoes[0]
        );
           
        double resultado = 0;
        String operacao = "";
        
        switch (escolha) {
            case 0:
                resultado = n1 + n2;
                operacao = "adição";
                break;
            case 1:
                resultado = n1 - n2;
                operacao = "subtração";
                break;
            case 2:
                resultado = n1 * n2;
                operacao = "multiplicação";
                break;
            case 3:
                resultado = n1 / n2;
                operacao = "Divisão";        
            default:
                JOptionPane.showMessageDialog(null, "Nenhuma operação selecionada.");
                System.exit(0);
        }
             JOptionPane.showMessageDialog(null,"Seu resultado é: " +resultado);
        
    }
}
