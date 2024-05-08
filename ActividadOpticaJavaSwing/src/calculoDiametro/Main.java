package calculoDiametro;

import javax.swing.*;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;

public class Main {
	protected static JTextField txtDescripcion, txtValor, txtEjemplo,
		txtPuente, txtValorPuente, txtEjemploPuente,
		txtAro, txtValorAro, txtEjemploAro,
		txtDiagonalMayor, txtValorDiagonalMayor, txtEjemploDiagonalMayor,
		txtDnpDerecho, txtValorDnpDerecho, txtEjemploDnpDerecho,
		txtDnpIzquierdo, txtValorDnpIzquierdo, txtEjemploDnpIzquierdo,
		txtDip, txtValorDip, txtEjemploDip,
		txtDiametroDerecho, txtValorDiametroDerecho, txtEjemploDiametroDerecho,
		txtDiametroIzquierdo, txtValorDiametroIzquierdo, txtEjemploDiametroIzquierdo;
	protected static JButton btnCalcularDiametro;

	public static void main(String[] args) {
		//Ventana principal
		JFrame frMain = new JFrame("Calculos");
		frMain.setForeground(new Color(255, 247, 252));
		frMain.setBackground(new Color(25, 25, 25));
		frMain.setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("/resources/icon.png")));
		frMain.setResizable(false);
		frMain.getContentPane().setBackground(new Color(255, 255, 255));
		frMain.setTitle("Calculo de diametro");
		frMain.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frMain.setSize(454, 584);
		frMain.getContentPane().setLayout(null);

		JLabel picLabel = new JLabel(new ImageIcon("/home/victor/eclipse-workspace/GUIs/src/resources/imagen.png"));
		picLabel.setBounds(0, 0, 456, 157);
		frMain.getContentPane().add(picLabel);

		txtDescripcion = new JTextField("DESCRIPCION");
		txtDescripcion.setHorizontalAlignment(SwingConstants.CENTER);
		txtDescripcion.setForeground(new Color(255, 247, 252));
		txtDescripcion.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 14));
		txtDescripcion.setBackground(new Color(28, 113, 216));
		txtDescripcion.setEditable(false);
		txtDescripcion.setBounds(10, 169, 144, 35);
		frMain.getContentPane().add(txtDescripcion);

		txtEjemplo = new JTextField("EJEMPLO");
		txtEjemplo.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 14));
		txtEjemplo.setForeground(new Color(255, 247, 252));
		txtEjemplo.setBackground(new Color(28, 113, 216));
		txtEjemplo.setHorizontalAlignment(SwingConstants.CENTER);
		txtEjemplo.setEditable(false);
		txtEjemplo.setColumns(10);
		txtEjemplo.setBounds(300, 169, 144, 35);
		frMain.getContentPane().add(txtEjemplo);

		txtValor = new JTextField("VALOR");
		txtValor.setForeground(new Color(255, 247, 252));
		txtValor.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 14));
		txtValor.setBackground(new Color(28, 113, 216));
		txtValor.setHorizontalAlignment(SwingConstants.CENTER);
		txtValor.setEditable(false);
		txtValor.setColumns(10);
		txtValor.setBounds(155, 169, 144, 35);
		frMain.getContentPane().add(txtValor);

		txtPuente = new JTextField("Puente");
		txtPuente.setForeground(new Color(36, 31, 49));
		txtPuente.setFont(new Font("DejaVu Sans Light", Font.BOLD, 13));
		txtPuente.setEditable(false);
		txtPuente.setColumns(10);
		txtPuente.setBackground(new Color(139, 147, 255));
		txtPuente.setBounds(10, 205, 144, 35);
		frMain.getContentPane().add(txtPuente);

		txtEjemploPuente = new JTextField("22");
		txtEjemploPuente.setHorizontalAlignment(SwingConstants.CENTER);
		txtEjemploPuente.setForeground(new Color(36, 31, 49));
		txtEjemploPuente.setFont(new Font("DejaVu Sans Light", Font.BOLD, 13));
		txtEjemploPuente.setEditable(false);
		txtEjemploPuente.setColumns(10);
		txtEjemploPuente.setBackground(new Color(139, 147, 255));
		txtEjemploPuente.setBounds(300, 205, 144, 35);
		frMain.getContentPane().add(txtEjemploPuente);

		txtValorPuente = new JTextField();
		txtValorPuente.setFont(new Font("DejaVu Sans Light", Font.BOLD, 13));
		txtValorPuente.setForeground(new Color(36, 31, 49));
		txtValorPuente.setBackground(new Color(139, 147, 255));
		txtValorPuente.setHorizontalAlignment(SwingConstants.CENTER);
		txtValorPuente.setBounds(155, 205, 144, 35);
		txtValorPuente.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				updateButton();
				esDigito(txtValorPuente);
			}
		});
		frMain.getContentPane().add(txtValorPuente);
		txtValorPuente.setColumns(10);

		txtValorAro = new JTextField();
		txtValorAro.setHorizontalAlignment(SwingConstants.CENTER);
		txtValorAro.setForeground(new Color(36, 31, 49));
		txtValorAro.setFont(new Font("DejaVu Sans Light", Font.BOLD, 13));
		txtValorAro.setColumns(10);
		txtValorAro.setBackground(new Color(139, 147, 255));
		txtValorAro.setBounds(155, 243, 144, 35);
		txtValorAro.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				updateButton();
				esDigito(txtValorAro);
			}
		});
		frMain.getContentPane().add(txtValorAro);

		txtAro = new JTextField("Aro");
		txtAro.setForeground(new Color(36, 31, 49));
		txtAro.setFont(new Font("DejaVu Sans Light", Font.BOLD, 13));
		txtAro.setEditable(false);
		txtAro.setColumns(10);
		txtAro.setBackground(new Color(139, 147, 255));
		txtAro.setBounds(10, 243, 144, 35);
		frMain.getContentPane().add(txtAro);

		txtEjemploAro = new JTextField("50");
		txtEjemploAro.setHorizontalAlignment(SwingConstants.CENTER);
		txtEjemploAro.setForeground(new Color(36, 31, 49));
		txtEjemploAro.setFont(new Font("DejaVu Sans Light", Font.BOLD, 13));
		txtEjemploAro.setEditable(false);
		txtEjemploAro.setColumns(10);
		txtEjemploAro.setBackground(new Color(139, 147, 255));
		txtEjemploAro.setBounds(300, 243, 144, 35);
		frMain.getContentPane().add(txtEjemploAro);

		txtValorDiagonalMayor = new JTextField();
		txtValorDiagonalMayor.setHorizontalAlignment(SwingConstants.CENTER);
		txtValorDiagonalMayor.setForeground(new Color(36, 31, 49));
		txtValorDiagonalMayor.setFont(new Font("DejaVu Sans Light", Font.BOLD, 13));
		txtValorDiagonalMayor.setColumns(10);
		txtValorDiagonalMayor.setBackground(new Color(139, 147, 255));
		txtValorDiagonalMayor.setBounds(155, 281, 144, 35);
		txtValorDiagonalMayor.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				updateButton();
				esDigito(txtValorDiagonalMayor);
			}
		});
		frMain.getContentPane().add(txtValorDiagonalMayor);

		txtDiagonalMayor = new JTextField("Diagonal mayor");
		txtDiagonalMayor.setForeground(new Color(36, 31, 49));
		txtDiagonalMayor.setFont(new Font("DejaVu Sans Light", Font.BOLD, 13));
		txtDiagonalMayor.setEditable(false);
		txtDiagonalMayor.setColumns(10);
		txtDiagonalMayor.setBackground(new Color(139, 147, 255));
		txtDiagonalMayor.setBounds(10, 281, 144, 35);
		frMain.getContentPane().add(txtDiagonalMayor);

		txtEjemploDiagonalMayor = new JTextField("53");
		txtEjemploDiagonalMayor.setHorizontalAlignment(SwingConstants.CENTER);
		txtEjemploDiagonalMayor.setForeground(new Color(36, 31, 49));
		txtEjemploDiagonalMayor.setFont(new Font("DejaVu Sans Light", Font.BOLD, 13));
		txtEjemploDiagonalMayor.setEditable(false);
		txtEjemploDiagonalMayor.setColumns(10);
		txtEjemploDiagonalMayor.setBackground(new Color(139, 147, 255));
		txtEjemploDiagonalMayor.setBounds(300, 281, 144, 35);
		frMain.getContentPane().add(txtEjemploDiagonalMayor);

		txtDnpIzquierdo = new JTextField("DNP izquierdo");
		txtDnpIzquierdo.setForeground(new Color(36, 31, 49));
		txtDnpIzquierdo.setFont(new Font("DejaVu Sans Light", Font.BOLD, 13));
		txtDnpIzquierdo.setEditable(false);
		txtDnpIzquierdo.setColumns(10);
		txtDnpIzquierdo.setBackground(new Color(139, 147, 255));
		txtDnpIzquierdo.setBounds(10, 357, 144, 35);
		frMain.getContentPane().add(txtDnpIzquierdo);

		txtDnpDerecho = new JTextField("DNP derecho");
		txtDnpDerecho.setForeground(new Color(36, 31, 49));
		txtDnpDerecho.setFont(new Font("DejaVu Sans Light", Font.BOLD, 13));
		txtDnpDerecho.setEditable(false);
		txtDnpDerecho.setColumns(10);
		txtDnpDerecho.setBackground(new Color(139, 147, 255));
		txtDnpDerecho.setBounds(10, 319, 144, 35);
		frMain.getContentPane().add(txtDnpDerecho);

		txtValorDnpDerecho = new JTextField();
		txtValorDnpDerecho.setHorizontalAlignment(SwingConstants.CENTER);
		txtValorDnpDerecho.setForeground(new Color(36, 31, 49));
		txtValorDnpDerecho.setFont(new Font("DejaVu Sans Light", Font.BOLD, 13));
		txtValorDnpDerecho.setColumns(10);
		txtValorDnpDerecho.setBackground(new Color(139, 147, 255));
		txtValorDnpDerecho.setBounds(155, 319, 144, 35);
		txtValorDnpDerecho.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				updateButton();
				esDigito(txtValorDnpDerecho);
			}
		});
		frMain.getContentPane().add(txtValorDnpDerecho);

		txtValorDnpIzquierdo = new JTextField();
		txtValorDnpIzquierdo.setHorizontalAlignment(SwingConstants.CENTER);
		txtValorDnpIzquierdo.setForeground(new Color(36, 31, 49));
		txtValorDnpIzquierdo.setFont(new Font("DejaVu Sans Light", Font.BOLD, 13));
		txtValorDnpIzquierdo.setColumns(10);
		txtValorDnpIzquierdo.setBackground(new Color(139, 147, 255));
		txtValorDnpIzquierdo.setBounds(155, 357, 144, 35);
		txtValorDnpIzquierdo.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				updateButton();
				esDigito(txtValorDnpIzquierdo);
			}
		});
		frMain.getContentPane().add(txtValorDnpIzquierdo);

		txtEjemploDnpIzquierdo = new JTextField("31.5");
		txtEjemploDnpIzquierdo.setHorizontalAlignment(SwingConstants.CENTER);
		txtEjemploDnpIzquierdo.setForeground(new Color(36, 31, 49));
		txtEjemploDnpIzquierdo.setFont(new Font("DejaVu Sans Light", Font.BOLD, 13));
		txtEjemploDnpIzquierdo.setEditable(false);
		txtEjemploDnpIzquierdo.setColumns(10);
		txtEjemploDnpIzquierdo.setBackground(new Color(139, 147, 255));
		txtEjemploDnpIzquierdo.setBounds(300, 357, 144, 35);
		frMain.getContentPane().add(txtEjemploDnpIzquierdo);

		txtEjemploDnpDerecho = new JTextField("28.5");
		txtEjemploDnpDerecho.setHorizontalAlignment(SwingConstants.CENTER);
		txtEjemploDnpDerecho.setForeground(new Color(36, 31, 49));
		txtEjemploDnpDerecho.setFont(new Font("DejaVu Sans Light", Font.BOLD, 13));
		txtEjemploDnpDerecho.setEditable(false);
		txtEjemploDnpDerecho.setColumns(10);
		txtEjemploDnpDerecho.setBackground(new Color(139, 147, 255));
		txtEjemploDnpDerecho.setBounds(300, 319, 144, 35);
		frMain.getContentPane().add(txtEjemploDnpDerecho);

		txtDiametroIzquierdo = new JTextField("Diametro izquierdo");
		txtDiametroIzquierdo.setForeground(new Color(36, 31, 49));
		txtDiametroIzquierdo.setFont(new Font("DejaVu Sans Light", Font.BOLD, 13));
		txtDiametroIzquierdo.setEditable(false);
		txtDiametroIzquierdo.setColumns(10);
		txtDiametroIzquierdo.setBackground(new Color(255, 247, 252));
		txtDiametroIzquierdo.setBounds(10, 509, 144, 35);
		frMain.getContentPane().add(txtDiametroIzquierdo);

		txtDip = new JTextField("DIP");
		txtDip.setForeground(new Color(36, 31, 49));
		txtDip.setFont(new Font("DejaVu Sans Light", Font.BOLD, 13));
		txtDip.setEditable(false);
		txtDip.setColumns(10);
		txtDip.setBackground(new Color(255, 247, 252));
		txtDip.setBounds(10, 433, 144, 35);
		frMain.getContentPane().add(txtDip);

		txtDiametroDerecho = new JTextField("Diametro derecho");
		txtDiametroDerecho.setForeground(new Color(36, 31, 49));
		txtDiametroDerecho.setFont(new Font("DejaVu Sans Light", Font.BOLD, 13));
		txtDiametroDerecho.setEditable(false);
		txtDiametroDerecho.setColumns(10);
		txtDiametroDerecho.setBackground(new Color(255, 247, 252));
		txtDiametroDerecho.setBounds(10, 471, 144, 35);
		frMain.getContentPane().add(txtDiametroDerecho);

		txtValorDiametroDerecho = new JTextField();
		txtValorDiametroDerecho.setEditable(false);
		txtValorDiametroDerecho.setHorizontalAlignment(SwingConstants.CENTER);
		txtValorDiametroDerecho.setForeground(new Color(36, 31, 49));
		txtValorDiametroDerecho.setFont(new Font("DejaVu Sans Light", Font.BOLD, 13));
		txtValorDiametroDerecho.setColumns(10);
		txtValorDiametroDerecho.setBackground(new Color(255, 247, 252));
		txtValorDiametroDerecho.setBounds(155, 471, 144, 35);
		frMain.getContentPane().add(txtValorDiametroDerecho);

		txtValorDip = new JTextField();
		txtValorDip.setEditable(false);
		txtValorDip.setHorizontalAlignment(SwingConstants.CENTER);
		txtValorDip.setForeground(new Color(36, 31, 49));
		txtValorDip.setFont(new Font("DejaVu Sans Light", Font.BOLD, 13));
		txtValorDip.setColumns(10);
		txtValorDip.setBackground(new Color(255, 247, 252));
		txtValorDip.setBounds(155, 433, 144, 35);
		frMain.getContentPane().add(txtValorDip);

		txtEjemploDip = new JTextField("60");
		txtEjemploDip.setHorizontalAlignment(SwingConstants.CENTER);
		txtEjemploDip.setForeground(new Color(36, 31, 49));
		txtEjemploDip.setFont(new Font("DejaVu Sans Light", Font.BOLD, 13));
		txtEjemploDip.setEditable(false);
		txtEjemploDip.setColumns(10);
		txtEjemploDip.setBackground(new Color(255, 247, 252));
		txtEjemploDip.setBounds(300, 433, 144, 35);
		frMain.getContentPane().add(txtEjemploDip);

		txtEjemploDiametroDerecho = new JTextField("70");
		txtEjemploDiametroDerecho.setHorizontalAlignment(SwingConstants.CENTER);
		txtEjemploDiametroDerecho.setForeground(new Color(36, 31, 49));
		txtEjemploDiametroDerecho.setFont(new Font("DejaVu Sans Light", Font.BOLD, 13));
		txtEjemploDiametroDerecho.setEditable(false);
		txtEjemploDiametroDerecho.setColumns(10);
		txtEjemploDiametroDerecho.setBackground(new Color(255, 247, 252));
		txtEjemploDiametroDerecho.setBounds(300, 471, 144, 35);
		frMain.getContentPane().add(txtEjemploDiametroDerecho);

		txtEjemploDiametroIzquierdo = new JTextField("64");
		txtEjemploDiametroIzquierdo.setHorizontalAlignment(SwingConstants.CENTER);
		txtEjemploDiametroIzquierdo.setForeground(new Color(36, 31, 49));
		txtEjemploDiametroIzquierdo.setFont(new Font("DejaVu Sans Light", Font.BOLD, 13));
		txtEjemploDiametroIzquierdo.setEditable(false);
		txtEjemploDiametroIzquierdo.setColumns(10);
		txtEjemploDiametroIzquierdo.setBackground(new Color(255, 247, 252));
		txtEjemploDiametroIzquierdo.setBounds(300, 509, 144, 35);
		frMain.getContentPane().add(txtEjemploDiametroIzquierdo);

		txtValorDiametroIzquierdo = new JTextField();
		txtValorDiametroIzquierdo.setEditable(false);
		txtValorDiametroIzquierdo.setHorizontalAlignment(SwingConstants.CENTER);
		txtValorDiametroIzquierdo.setForeground(new Color(36, 31, 49));
		txtValorDiametroIzquierdo.setFont(new Font("DejaVu Sans Light", Font.BOLD, 13));
		txtValorDiametroIzquierdo.setColumns(10);
		txtValorDiametroIzquierdo.setBackground(new Color(255, 247, 252));
		txtValorDiametroIzquierdo.setBounds(155, 509, 144, 35);
		
		frMain.getContentPane().add(txtValorDiametroIzquierdo);
		
		btnCalcularDiametro = new JButton("Calcular diametro");
		btnCalcularDiametro.setEnabled(false);
		btnCalcularDiametro.setForeground(new Color(255, 247, 252));
		btnCalcularDiametro.setBackground(new Color(255, 113, 205));
		btnCalcularDiametro.setBounds(10, 397, 434, 30);
		btnCalcularDiametro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double pt = Double.parseDouble(txtValorPuente.getText());
				double a = Double.parseDouble(txtValorAro.getText());
				double dm = Double.parseDouble(txtValorDiagonalMayor.getText());
				double dnpOd = Double.parseDouble(txtValorDnpDerecho.getText());
				double dnpOi = Double.parseDouble(txtValorDnpIzquierdo.getText());
				double tm = 2; //No has indicado cual es la tolerancia la dejare como el ejemplo

				txtValorDip.setText(dnpOd+dnpOi+"");
				txtValorDiametroDerecho.setText((((pt+a+dm)-(dnpOd*2))+tm)+"");
				txtValorDiametroIzquierdo.setText((((pt+a+dm)-(dnpOi*2))+tm)+"");
				
				
			}
		});
		frMain.getContentPane().add(btnCalcularDiametro);
		

		frMain.setVisible(true);
	}
	
	private static void updateButton() {
		if (txtValorPuente.getText().length()== 0 || txtValorAro.getText().length()== 0 || txtValorDnpDerecho.getText().length()== 0 || txtValorDnpIzquierdo.getText().length()== 0 || txtValorDiagonalMayor.getText().length()== 0) {
			btnCalcularDiametro.setEnabled(false);
		} else {
			btnCalcularDiametro.setEnabled(true);
		}	
	}
	private static void esDigito(JTextField valor) {
		String txt = valor.getText();
		for (int i = 0; i < txt.length(); i++){
			if (Character.isLetter(txt.charAt(i))){
				valor.setText(null);
				break;
			}
		}
		
		
		
	}
	
}

