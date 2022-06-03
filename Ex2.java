import javax.swing.JOptionPane;

class Motorista {
    int numeroCarteira = 1;
    double numeroMultas;
}

public class Ex2 {
    public static void main(String[] args) {
        double somaDividas = 0,somaTotal=0,multa;
        int  numeroMotorista = 0;
        double qtdeMultas = 0;
        Motorista motorista = new Motorista();
        
        while(motorista.numeroCarteira!=0) {
            motorista.numeroCarteira = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da carteira: "));
            if (motorista.numeroCarteira != 0){
                motorista.numeroMultas = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero de multas do motorista: "));
                if (motorista.numeroMultas > qtdeMultas) {
                    numeroMotorista = motorista.numeroCarteira;    
                }
                for (int i = 1; i <= motorista.numeroMultas; i++) {
                    multa = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da multa " + i +": "));
                    somaDividas = somaDividas + multa;
                }
                JOptionPane.showMessageDialog(null, "O valor total das multas do motorista " + motorista.numeroCarteira + " é " + somaDividas);
                somaTotal = somaTotal + somaDividas;
            }    
        }
        JOptionPane.showMessageDialog(null, "O valor total de arrecadacao é " + somaTotal);
        JOptionPane.showMessageDialog(null, "O motorista em posse da carteira numero " + numeroMotorista + " teve a maior quantidade de multas");   
    }
}
