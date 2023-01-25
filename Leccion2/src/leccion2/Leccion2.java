

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leccion2;

import javax.swing.JOptionPane;

/**
 *
 * @author Personal
 */
public class Leccion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        String saludo="Hola mundo";
//        System.out.println(saludo);
          //String nombre="Sergio";
//        double salarioNeto=1500.25;
//        System.out.println(nombre + " su salario neto es de: "+salarioNeto);

       
//        boolean activo=false;
//        System.out.println(nombre + " esta: "+activo);
//        JOptionPane.showMessageDialog(null, nombre + " esta: "+activo);
//        JOptionPane.showMessageDialog(null, "Advertencia", "Warning", JOptionPane.WARNING_MESSAGE);
//            JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
//                JOptionPane.showMessageDialog(null, "Pregunta", "Pregunta", JOptionPane.QUESTION_MESSAGE);
               String nombre=JOptionPane.showInputDialog("Ingrese nombre");
                  JOptionPane.showMessageDialog(null, "Hola "+nombre);
     String salario;
                  salario=JOptionPane.showInputDialog("Ingrese salario");
                  double salarioNeto=Double.parseDouble(salario)*.91;
                  JOptionPane.showMessageDialog(null, "Salario neto es "+ salarioNeto);
                  
                  
}
    }
