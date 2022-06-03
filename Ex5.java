import javax.swing.JOptionPane;

public class Ex5 {
    public static void main(String[] args) {
        double soma=0,multiplicacao=1;
        int qtdeNumeros;
        double numeros;
        int qtdeSoma=0,QtdeMultiplicacao=0;
        int opcao = 0;
        while (opcao != 3) {
            qtdeNumeros = 0;
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione a opção desejada: \n1. Somar vários números\n2. Multiplicar vários números\n3. Sair"));
            if (opcao != 0){
                if (opcao == 1){
                    qtdeSoma++;
                    qtdeNumeros = Integer.parseInt(JOptionPane.showInputDialog("Quantos numeros deseja somar: "));
                    for (int i = 1; i <= qtdeNumeros; i++) {                          
                        numeros = Double.parseDouble(JOptionPane.showInputDialog("Digite o "+ i+" numero a ser somado"));
                        soma = soma + numeros;
                    }
                    JOptionPane.showMessageDialog(null, "A soma dos numeros digitados é " + soma);
                }else if (opcao == 2) {
                    QtdeMultiplicacao++;
                    qtdeNumeros = Integer.parseInt(JOptionPane.showInputDialog("Quantos numeros deseja multiplicar: "));
                    for (int i = 1; i <= qtdeNumeros; i++) {                          
                        numeros = Double.parseDouble(JOptionPane.showInputDialog("Digite o "+ i+" numero a ser multiplicado"));
                        multiplicacao = multiplicacao * numeros;
                    }
                    JOptionPane.showMessageDialog(null, "O produto dos numeros digitados é " + multiplicacao);
                }
            }
          }
        JOptionPane.showMessageDialog(null, "A operação de soma foi realizada "+ qtdeSoma + " vezes");
        JOptionPane.showMessageDialog(null, "A operação de multiplicação foi realizada "+ QtdeMultiplicacao + " vezes");
    }
}
