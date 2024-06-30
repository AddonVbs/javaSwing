package loyp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ContactForm extends JFrame{
    
    JTextField name_field,mail_field;
    JRadioButton male, female;
    JCheckBox check;
    public ContactForm(){
        super("Контактная форма");
        super.setBounds(200,100,300,230);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(5,2,2,10));

        JLabel name = new JLabel("Ввидите имя: ");
        name_field = new JTextField("",1);

        JLabel mail = new JLabel("Ввидите email: ");
        mail_field = new JTextField("@",1);

        container.add(name);
        container.add(name_field);
        container.add(mail);
        container.add(mail_field);
        
        male = new JRadioButton("Мужской");
        female = new JRadioButton("Женский");
        check = new JCheckBox("Согласен ?",false);
        JButton send_Button = new JButton("Отпривить");

        male.setSelected(true);
        container.add(male);
        container.add(female);
        

        ButtonGroup grop = new ButtonGroup();
        grop.add(male);
        grop.add(female);
        container.add(check);
        container.add(send_Button);

        send_Button.addActionListener(new ButtonEventManager());
    
    
    }
    class ButtonEventManager implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String name1 = name_field.getText();
            String email1 = mail_field.getText();
            
            String isMale = "Мужской";
            if(!male.isSelected()){
                isMale = "Женский";

            }
            boolean checkBox = check.isSelected();

            JOptionPane.showMessageDialog(null,"Ваша почта: " +email1+ "\nВаш пол: " + isMale+ "\nВы согласны: "+ checkBox + "\nПривет, " + name1, isMale, JOptionPane.PLAIN_MESSAGE);

        }
    
    }




}
