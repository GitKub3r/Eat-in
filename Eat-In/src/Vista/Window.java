package Vista;

import java.awt.EventQueue;
import Controlador.MainClass;
import Modelo.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;

public class Window extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtStreet;
	private JTextField txtBuilding;
	private JTextField txtFloor;
	private JTextField txtDoor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window frame = new Window();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Window() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblAppName = new JLabel("EAT-IN");
		lblAppName.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(lblAppName);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.NORTH);
		
		JLabel lblBk = new JLabel("Burger King");
		lblBk.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		panel_2.add(lblBk);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Menu", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(null);
		
		JLabel lblBurger = new JLabel("Whopper");
		lblBurger.setBounds(134, 11, 129, 14);
		panel_3.add(lblBurger);
		
		JLabel lblFries = new JLabel("Patatas Fritas (5kg)");
		lblFries.setBounds(109, 36, 154, 14);
		panel_3.add(lblFries);
		
		JLabel lblDrink = new JLabel("Coca Cola (500ml)");
		lblDrink.setBounds(119, 61, 144, 14);
		panel_3.add(lblDrink);
		
		JLabel lblCost = new JLabel("10.99 €");
		lblCost.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCost.setBounds(129, 86, 88, 14);
		panel_3.add(lblCost);
		
		JLabel lblStreet = new JLabel("Calle");
		lblStreet.setBounds(10, 103, 46, 14);
		panel_3.add(lblStreet);
		
		txtStreet = new JTextField();
		txtStreet.setBounds(10, 128, 144, 14);
		panel_3.add(txtStreet);
		txtStreet.setColumns(10);
		
		JLabel lblBuilding = new JLabel("Portal");
		lblBuilding.setBounds(10, 153, 46, 14);
		panel_3.add(lblBuilding);
		
		txtBuilding = new JTextField();
		txtBuilding.setColumns(10);
		txtBuilding.setBounds(10, 178, 144, 14);
		panel_3.add(txtBuilding);
		
		JLabel lblPiso = new JLabel("Piso");
		lblPiso.setBounds(171, 103, 46, 14);
		panel_3.add(lblPiso);
		
		txtFloor = new JTextField();
		txtFloor.setColumns(10);
		txtFloor.setBounds(170, 128, 144, 14);
		panel_3.add(txtFloor);
		
		JLabel lblDoor = new JLabel("Puerta");
		lblDoor.setBounds(171, 153, 46, 14);
		panel_3.add(lblDoor);
		
		txtDoor = new JTextField();
		txtDoor.setColumns(10);
		txtDoor.setBounds(170, 178, 144, 14);
		panel_3.add(txtDoor);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4, BorderLayout.SOUTH);
		
		JButton btnOrder = new JButton("Pedir");
		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainClass controlador = new MainClass();
				Pedido p = new Pedido("Whopper", "Patatas Fritas", "CocaCola (500ml)", 10.99);
				Direccion d = new Direccion(txtStreet.getText(), txtBuilding.getText(), txtDoor.getText(), txtFloor.getText());
				controlador.hacerPedido(p, d);
			}
		});
		
		panel_4.add(btnOrder);
		
		setLocationRelativeTo(null);
		setTitle("Eat-In");
	}
}
