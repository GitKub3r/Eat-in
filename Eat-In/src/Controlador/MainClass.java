package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.*;

import Vista.*;

public class MainClass {
	
	public static void main(String [] args) {
		Loading load = new Loading();
		load.main(args);
		
		Window window = new Window();
		Look l = new Look(window);
		window.setVisible(true);
		
		
	}
	
	public void hacerPedido(Pedido p, Direccion d) {
		System.out.println("PEDIDO: BURGER KING - MENÚ BÁSICO");
		System.out.println("---------------------------------");
		System.out.println("Hamburgesa: " + p.getBurger());
		System.out.println("Complemento: " + p.getFries());
		System.out.println("Bebida: " + p.getDrink());
		System.out.println("---------------------------------");
		System.out.println("PRECIO: " + p.getPrice());
		System.out.println("---------------------------------");
		System.out.println("DIRECCIÓN DE ENTREGA");
		System.out.println("Calle: " + d.getStreet());
		System.out.println("Portal: " + d.getBuilding());
		System.out.println("Piso: " + d.getFloor());
		System.out.println("Puerta: " + d.getDoor());
		System.out.println("---------------------------------");
	}
}
