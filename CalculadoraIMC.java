
package fundamentos;

import javax.swing.JOptionPane;

public class CalculadoraIMC {
    public static void main(String[] args) {

        String[] alunos = new String[2];

        double[] peso = new double[2];

        double[] altura = new double[2];

        double[] media = new double[2];


        int i;

        JOptionPane.showMessageDialog(null, "Calculadora IMC peso padrão do Ministério da Saúde");

        // entrada de dados !
        for (i = 0; i < 2; i++) {

            alunos[i] = JOptionPane.showInputDialog(
                    "Qual é o seu nome Aluno(a) " + (i + 1) + "?").toUpperCase();

            altura[i] = Double.parseDouble(JOptionPane.showInputDialog(
                    "Qual é sua altura " + alunos[i].toUpperCase() +" ?")
                    .replace(",", "."));

            peso[i] = Double.parseDouble(JOptionPane.showInputDialog(
                    "Qual é seu peso " + alunos[i].toUpperCase() + " ?\n" +
                            "[em KG]")
                    .replace(",", "."));

            JOptionPane.showMessageDialog(null,"Proximo aluno(a)!");

            media[i] = peso[i] / (altura[i] * altura[i]);
        }

            JOptionPane.showMessageDialog(null, "Resultados:");
        // Saída de dados
        for (i = 0; i < 2; i++) {

            JOptionPane.showMessageDialog(null, "Aluno(a), " + alunos[i] + " seu  IMC é : " + String.format("%.2f", media[i]));

            if (media[i] < 17) {

                JOptionPane.showMessageDialog(null, alunos[i] + ": Muito abaixo do peso.");

            }
            if (media[i] > 17 && media[i] <= 18.5) {

                JOptionPane.showMessageDialog(null, alunos[i] + ": Abaixo do peso.");

            }
            if (media[i] > 18.5 && media[i] < 24.9) {

                JOptionPane.showMessageDialog(null, alunos[i] + ": Peso normal.");

            }
            if (media[i] > 25 && media[i] < 29.9) {

                JOptionPane.showMessageDialog(null, alunos[i] + ": Acima do peso.");

            }
            if (media[i] > 30 && media[i] < 34.9) {

                JOptionPane.showMessageDialog(null, alunos[i] + ": Obesidade I");

            }
            if (media[i] > 35 && media[i] < 39.9) {

                JOptionPane.showMessageDialog(null, alunos[i] + ": Obesidade II (severa).");

            }
            if (media[i] > 40) {

                JOptionPane.showMessageDialog(null, alunos[i] + ": Obesidade III (mórbida).");

            }

        }
   
    }
}
