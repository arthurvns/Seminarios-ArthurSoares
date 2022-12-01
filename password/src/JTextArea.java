import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class text extends JFrame implements ActionListener {
    // JTextField
    static JTextField t;

    // JPasswordField
    static JPasswordField pass;

    // JFrame
    static JFrame f;

    // JButton
    static JButton b;

    // area pra mostrar o texto
    static JLabel l;

    text(){}

    public static void main(String[] args)
    {
        // cria um frame para guardar a área de texto e o botão
        f = new JFrame("textfield");

        // cria uma area para mostrar o texto
        l = new JLabel("nada aqui por enquanto....");

        // cria um botão
        b = new JButton("enviar");

        // cria um objeto da classe text
        text te = new text();

        // coloca um ActionListener no botão
        b.addActionListener(te);

        // cria um objeto do tipo JTextField com o texto inicial e o número colunas como parâmetro
        t = new JTextField("", 10);

        // Cria um objeto do tipo JPasswordField com o número de colunas como parâmetro
        pass = new JPasswordField(10);

        // Cria um objeto do tipo fonte
        Font fonte = new Font("Arial", Font.ITALIC, 20);

        // Define a fonte
        t.setFont(fonte);

        // Cria uma área pra adicionar os botões e o campo de texto
        JPanel p = new JPanel();

        // Adiciona o botão e a área de texto a área criada
        p.add(t);
        p.add(pass);
        p.add(b);
        p.add(l);

        // adiciona a área ao frame
        f.add(p);

        // define o tamanho do frame
        f.setSize(300, 300);

        //exibe o pop up
        f.show();
    }
    // se o botão foi apertado
    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        if (s.equals("enviar")) {
            // define o texto da área como o texto enviado
            l.setText("Nome = " + t.getText() + "\t Senha = " + pass.getText());

            // esvazia o texto da área do nome
            t.setText("  ");

            // esvazia o texto da área de senha
            pass.setText("");
        }
    }
}