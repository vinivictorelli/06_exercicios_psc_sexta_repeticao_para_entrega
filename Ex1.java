import javax.swing.JOptionPane;

class Pessoa {
    double idade,altura,peso;
}


public class Ex1 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        double quantidadePessoas = 0;
        double quantidadePessoas50anos = 0;
        double quantidadePessoasEntre10e20Anos = 0;
        double quantidadePessoas40KG = 0;
        double somaAltura = 0;
        do {
            pessoa.idade = Double.parseDouble(JOptionPane.showInputDialog("Digite a idade da pessoa:"));
            if (pessoa.idade != 0){
                pessoa.altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da pessoa:"));
                pessoa.peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da pessoa:"));
                quantidadePessoas = quantidadePessoas + 1;
                if (pessoa.idade > 50) {
                    quantidadePessoas50anos = quantidadePessoas50anos + 1;    
                }
                if (pessoa.idade >= 10 && pessoa.idade <= 20) {
                    somaAltura = somaAltura + pessoa.altura;
                    quantidadePessoasEntre10e20Anos = quantidadePessoasEntre10e20Anos + 1;
                }
                if (pessoa.peso < 40){
                    quantidadePessoas40KG = quantidadePessoas40KG + 1;
                }
            }
        } while (pessoa.idade != 0);
    JOptionPane.showMessageDialog(null, "A quantidade de pessoas com idade superior a 50 anos é "+quantidadePessoas50anos);
    JOptionPane.showMessageDialog(null, "a média das alturas das pessoas com idade entre 10 e 20 anos é "+ somaAltura/quantidadePessoasEntre10e20Anos );
    JOptionPane.showMessageDialog(null, "o percentual de pessoas com peso inferior a 40 quilos entre todas as pessoas analisadas é "+ (quantidadePessoas40KG/quantidadePessoas)*100);
 }    
}