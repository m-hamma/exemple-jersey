package com.hamma.main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exemple5 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btnClickMe = new JButton("Click me");
	private JButton btnPushMe = new JButton("Push me");
	private JButton btnActivateMe = new JButton("Activate me");

	public Exemple5() {
		super("Ipmlementation d'interface");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		JPanel contenuPane=(JPanel) this.getContentPane();
		contenuPane.setLayout(new FlowLayout());
		
		contenuPane.add(btnClickMe);
		contenuPane.add(btnPushMe);
		contenuPane.add(btnActivateMe);
		/*btnClickMe.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("OK");
				
			}
		});*/
		
		/*btnClickMe.addActionListener((ActionEvent e)->{
			System.out.println("ok 1" + e);
			});*/
		btnClickMe.addActionListener(this::btnclickMeListnenr);
		
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	private void btnclickMeListnenr(ActionEvent e) {
		System.out.println("OK");
	}

    public static void main(String[] args) throws Exception
    {
    	new Exemple5();
    	
    }

}
