import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/** 
 * 
 * VERSION 1
 */

public class proRadio extends JFrame implements ActionListener {
	private JRadioButton r1,r2,r3;
	private JCheckBox risp;
	private JButton conferma;
	private JPanel riga1;
	
	public proRadio() {
		super("ESERCIZIO SUI RADIO E CHECK BUTTON");
		Container co=getContentPane();
		JPanel centro,sud;
		
		
		//CENTRO
		centro=new JPanel(new GridLayout(2,1));
		JPanel riga2;
		riga1=new JPanel();
		riga2=new JPanel();
		r1=new JRadioButton("Rosso");
		r2=new JRadioButton("Giallo");
		r3=new JRadioButton("Verde");
		r1.addActionListener(this);
		r2.addActionListener(this);
		r3.addActionListener(this);
		riga1.add(r1);
		riga1.add(r2);
		riga1.add(r3);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		risp=new JCheckBox("Si/No");
		riga2.add(risp);
		
		centro.add(riga1);
		centro.add(riga2);
		//CENTRO
		
		//SUD
		sud=new JPanel();
		conferma=new JButton("OK");
		conferma.addActionListener(this);
		sud.add(conferma);
		
		co.add(centro);
		co.add(sud,"South");
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//SUD
	}
	public static void main(String[] args) {
		new proRadio();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String s="";
		Object o=e.getSource();
		if(o==r1 && r1.isSelected())
			riga1.setBackground(Color.red);
		else if (o==r2 && r2.isSelected())
			riga1.setBackground(Color.yellow);
		else if (o==r3 && r3.isSelected())
			riga1.setBackground(Color.green);
		if(o==conferma && risp.isSelected()) {
			s+="\n risp=SI";
			JOptionPane.showMessageDialog(this, s);
		}else if(o==conferma && !risp.isSelected()){
			s+="\n risp=NO";
			JOptionPane.showMessageDialog(this, s);
		}
		
	}
	
}
