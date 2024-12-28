package firstProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactForm extends JFrame{
	
	JTextField name_field, email_field;
	JRadioButton male, female;
	JCheckBox check;
	
	public ContactForm() {
		super("Контактная форма");
		super.setBounds(200, 100, 1000, 500);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container container = super.getContentPane();
		container.setLayout(new GridLayout(5, 5, 2, 70));
		
		JLabel name = new JLabel("Ведите имя: ");
		name_field = new JTextField("",1);
		
		JLabel email = new JLabel("Ведите email: ");
		email_field = new JTextField("@",1);
		
		container.add(name);
		container.add(name_field);
		container.add(email);
		container.add(email_field);
		
		male = new JRadioButton("Man");
		female = new JRadioButton("Woman");
		check = new JCheckBox("Согласие?" , false	);
		JButton send_button = new JButton("Отправить");
		
		male.setSelected(true);
		
		container.add(male);
		container.add(female);
		
		ButtonGroup group = new ButtonGroup();
		group.add(male);
		group.add(female);
		
			
		container.add(check);
		container.add(send_button);
		
		send_button.addActionListener(new ButtonEventManager());
	}
	
	class ButtonEventManager implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub	
			String name = name_field.getText();
			String email = email_field.getText();
			
			String sex = "Мужской";
			if (!male.isSelected())
				sex = "Женский";
			
			boolean checkBox = check.isSelected();
			
			String outMessage = "Ваша почта: " + email + "\n" 
			+ "Ваш пол: " + sex + "\n"
			+ "Вы согласны: " + checkBox;
			
			JOptionPane.showMessageDialog(null, outMessage, "Привет, " + name, JOptionPane.PLAIN_MESSAGE);
			
			
		}
		
	}

}
