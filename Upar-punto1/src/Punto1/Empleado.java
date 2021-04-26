package Punto1;

/**
 *
 * @author Ozark
 */
public class Empleado implements Upar {
    
    public int coordinador = 5000, asistente = 4000, secretaria = 3000;
    public String cargo;
    

    public Empleado(String cargo) {
       this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    @Override
    public void sueldo() {
        if (cargo  == "coordinador") {
            System.out.println("sueldo es: "+coordinador+" por ser Coordinador");
            int cargo = 5000;
        } else {
            if (cargo == "asistente") {
                System.out.println("sueldo es: "+asistente+" por ser Asistente");
                int cargo = 4000;
            } else {
                if (cargo == "secretaria") {
                    System.out.println("sueldo es: "+secretaria+" por ser Secretaria");
                    int cargo = 3000;
                }         
            }
        }
    }

    @Override
    public void bonificacion() {
        
        if (cargo  == "coordinador") {
            System.out.println("Bonificacion para coordinador es: "+coordinador*1);
        } else {
            if (cargo == "asistente") {
                System.out.println("Bonificacion para asistente es: "+asistente*1);
            } else {
                if (cargo == "secretaria") {
                    System.out.println("Bonificacion para coordinador es: "+secretaria*1);
                }         
            }
        }
        
    }
    
    
  
    
}
