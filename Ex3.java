import javax.swing.JOptionPane;

class Pessoa {
    int idade=1;
    String estadoCivil;
}

public class Ex3 {
    public static void main(String[] args) {
        double somaPessoasCasadas=0,somaPessoasSolteiras=0,somaIdadeV=0,qtdePessoasD=0,qtdePessoasV=0,quantidadePessoas=0;
        Pessoa pessoa = new Pessoa();

        while(pessoa.idade!=0){
            pessoa.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa: "));
            if (pessoa.idade!=0) {
                pessoa.estadoCivil = JOptionPane.showInputDialog("Digite o estado civil (C – Casado, S – Solteiro, V – Viúvo e D – Desquitado)");
                quantidadePessoas = quantidadePessoas + 1;
                if (pessoa.estadoCivil.equals("C")) {
                    somaPessoasCasadas++;
                }
                else if (pessoa.estadoCivil.equals("S")) {
                    somaPessoasSolteiras++;
                }
                else if (pessoa.estadoCivil.equals("V")) {
                    somaIdadeV = somaIdadeV + pessoa.idade;
                    qtdePessoasV++;
                }
                else if (pessoa.estadoCivil.equals("D")) {
                    qtdePessoasD++;
                }    
            }    
        }
        JOptionPane.showMessageDialog(null, "A quantidade de pessoas casadas é "+somaPessoasCasadas);
        JOptionPane.showMessageDialog(null, "A quantidade de pessoas solteiras é " + somaPessoasSolteiras);
        JOptionPane.showMessageDialog(null, "A média de idade de pessoas viúvas é "+ somaIdadeV/qtdePessoasV);
        JOptionPane.showMessageDialog(null, "o percentual de pessoas desquitadas é " + (qtdePessoasD/quantidadePessoas)*100);
        JOptionPane.showMessageDialog(null, "o percentual de pessoas viúvas é " + (qtdePessoasV/quantidadePessoas)*100); 
    }
    
}

