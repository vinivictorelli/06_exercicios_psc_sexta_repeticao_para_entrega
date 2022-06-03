import javax.swing.JOptionPane;

class Turma {
    double QtdeAlunos;
    double mediaTurma;
}
class Aluno {
    double mediaAluno;
}

public class Ex4 {
    public static void main(String[] args) {
        int qtdeTurmas=1;
        double somaMedia,qtdeAlunosAprovados=0,qtdeAlunos=0;
        while (qtdeTurmas!=0) {
            somaMedia = 0;
            qtdeTurmas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de turmas: "));
            if (qtdeTurmas!=0) {
                for (int i = 0; i < qtdeTurmas; i++) {
                    Turma turma = new Turma();
                    turma.QtdeAlunos = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero de alunos para a turma "+i + ": "));
                    System.out.println(turma.QtdeAlunos);
                    for (int j = 0; j < turma.QtdeAlunos; j++) {
                        Aluno aluno = new Aluno();
                        aluno.mediaAluno = Double.parseDouble(JOptionPane.showInputDialog("Digite a media do aluno "+j + ": "));
                        somaMedia = somaMedia + aluno.mediaAluno;
                        qtdeAlunos++;
                        if (aluno.mediaAluno >= 7) {
                            qtdeAlunosAprovados++;
                        }
                    }
                    turma.mediaTurma = somaMedia/turma.QtdeAlunos;
                    JOptionPane.showMessageDialog(null, "A media da turma "+ i +" é " + turma.mediaTurma);      
                }
            }
        JOptionPane.showMessageDialog(null,"A quantidade de alunos aprovados é "+ qtdeAlunosAprovados);
        JOptionPane.showMessageDialog(null,"A percentual de alunos aprovados é " + (qtdeAlunosAprovados/qtdeAlunos)*100);
        }     
    }
}
