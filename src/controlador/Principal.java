package controlador;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Scanner;

public class Principal {

	@SuppressWarnings("unused")
public static void main(String[] args) throws SQLException, FileNotFoundException {
		System.out.println("Inicio Ejecucion - Maquina Refrescos");
		Scanner miScanner = new Scanner(System.in); // Para leer las opciones de teclado
		
		Controlador miControlador = new Controlador(miScanner);		
		
	}



}