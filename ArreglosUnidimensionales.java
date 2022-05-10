package JAVA_MEMORY_ARRAYS;

import javax.swing.JOptionPane;

public class ArreglosUnidimensionales {
 /**
 * El método main es utilizado para iniciar el programa en general.
 */
 public static void main(String[] args) {
	 
	 //ZONA DE DECLARACION DE VARIABLES
	 String[] nombres = null; //Arreglo que permite almacenar las cadenas de nombres
	 Double[] notas = null; //Arreglo que permite almacenar las notas de los estudiantes
	 String listaAprobados = null; //Cadena con el listado de lo estudiantes que aprobaron
	 String listaNoAprobados = null; //Cadena con el listado delos estudiantes que no aprobaron
	 int cantidad = 0; //Cantidad de estudiantes que se van a registrar.
	 
	//ZONA DE DECLARACION DE LA LÓGICA DE NEGOCIO
	 
	 // DECLARAMOS PARSEINT PARA CAMBIAR EL DATO DE LLEGADA A UN INT
	 cantidad = Integer.parseInt(JOptionPane.showInputDialog( null, "¿Cuantos estudiantes desea registrar?", "Cantidad de estudiantes", JOptionPane.QUESTION_MESSAGE));
	 if (1 <= cantidad ) {
		 nombres = new String[cantidad];
		 notas = new Double [cantidad];
		 
		 for(int i=0;i<cantidad;i++) {
			 nombres [i] =JOptionPane.showInputDialog(null,"Ingrese el nombre del estudiante numero" + (i+1),"Ingreso de estudiantes",JOptionPane.INFORMATION_MESSAGE);
			 notas [i] = Double.parseDouble(JOptionPane.showInputDialog(null,"¿Nota del estudiante" + nombres[i] +"?","ingreso de nota para estudiante", JOptionPane.QUESTION_MESSAGE));
		 }
		 
	 }
	 
	 listaAprobados ="";
	 listaNoAprobados ="";
	
	 for (int i =0; i < notas.length;i++) {
		 if (notas[i] < 3.0) {
	      listaNoAprobados += nombres[i] + "/n";
		 } else {
			 listaAprobados += nombres[i] + "/n";
		 }
	 }
	 
	 JOptionPane.showMessageDialog(null, "Los estudiantes que aprobaron el curso deprogramación fueron:\n" + listaAprobados,"Lista de aprobados",JOptionPane.INFORMATION_MESSAGE);
	 JOptionPane.showMessageDialog(null, "Los estudiantes que NO aprobaron el curso deprogramación fueron:\n" + listaNoAprobados,"Lista de no aprobados",JOptionPane.ERROR_MESSAGE);
			 /**
			 * Se ha terminado el programa.
			 */
			  
 }
 
 }