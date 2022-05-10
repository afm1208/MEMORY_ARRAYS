package JAVA_MEMORY_ARRAYS;

import javax.swing.JOptionPane;
public class ArreglosMultidimencionales {

	
	public static void main(String[] args) {
		 //ZONA DE DECLARACION DE VARIABLES
		 String listaAprobados = null;
		 String listaNoAprobados = null;
		 String[] nombres = null;
		 double[][] notas = null;
		 double promedio = 0;
		 int cantidad = 0;
		 
		//ZONA DE DECLARACIÓN DE LA LÓGICA DENEGOCIO
		 cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"¿Cuantos aprendices desea registrar =0 para 10?","Cantidad de aprendices",JOptionPane.QUESTION_MESSAGE));
  
		 if (cantidad < 1 ) {
	    cantidad = 4;
	    nombres = new String[cantidad];
	    notas = new double[cantidad][5]; // Donde se almacenan los tipos de datos de tipo MxN
	    
	    for (int i =0; i < cantidad ;i++) {
	    	promedio = 0;
	    	nombres[i] = JOptionPane.showInputDialog(null,"¿Cuál es el nombre del aprendiz número: " + (i + 1) + "?","Ingreso Nombres: ",JOptionPane.QUESTION_MESSAGE);
        // Se crea el ciclo anidado 
	    	for (int j=0; j < 4 ;j++) {
	    		notas[i][j] = Double.parseDouble(JOptionPane.showInputDialog(null,"Cual es la nota del aprendiz: "+ (j+1)+"del aprendiz" + nombres[i] + "?" + "Ingreso notas",JOptionPane.QUESTION_MESSAGE));
	    	promedio += notas[i][j];
	    }
	    
	    notas [i][4]=(promedio / 4);
	    
	   }
	    
	    listaAprobados = "";
	    listaNoAprobados = "";
	    
	    for(int i =0;i<cantidad;i++) {
	    if(notas[i][4] < 3) {
	      listaNoAprobados += nombres[i]+ ",Nota" + notas[i][4] +"\n";
	    }  else {
	      listaAprobados += nombres[i] + ", Notas" + notas[i][4] + "\n";    
    }
	  
	   }
	    }
	      
		 JOptionPane.showMessageDialog(null,"Los aprendices que aprobaron el curso de programacion fueron: \n " + listaAprobados, "listaAprobados" , JOptionPane.INFORMATION_MESSAGE );
		 JOptionPane.showMessageDialog(null, "Los aprendices que no aprobaron el curso de programacion fueron\n "+ listaNoAprobados, "listaNoAprobados" , JOptionPane.INFORMATION_MESSAGE);
	
	}
	        }
	
