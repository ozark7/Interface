package Punto1;


import Punto1.Empleado;
import Punto1.Docente;

/**
 *
 * @author Ozark
 */
public class Main {
    
    public static void main(String[] args) {
        //================sueldo empleado ====================
        System.out.println("==============Empleado=================");
        Empleado empleado1 = new Empleado("coordinador");
        Empleado empleado2 = new Empleado("asistente");
        Empleado empleado3 = new Empleado("secretaria");
        System.out.println("=======================================");
        empleado1.sueldo();
        empleado2.sueldo();
        empleado3.sueldo();
        System.out.println("=======================================");
        empleado1.bonificacion();
        empleado2.bonificacion();
        empleado3.bonificacion();
        
        System.out.println("==============Docente==================");
        //================sueldo docente ====================
        Docente docente1 = new Docente(8);
        Docente docente2 = new Docente(4);
        Docente docente3 = new Docente(15);
        System.out.println("=======================================");
        docente1.sueldo();
        docente2.sueldo();
        docente3.sueldo();
        System.out.println("=======================================");
        docente1.bonificacion();
        docente2.bonificacion();
        docente3.bonificacion();
        
        
    }
    
}
