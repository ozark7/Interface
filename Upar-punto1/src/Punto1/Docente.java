package Punto1;

/**
 *
 * @author Ozark
 */
public class Docente implements Upar {

    public int horas,pagaHora = 120;

    public Docente(int horas) {
        
        this.horas = horas;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    
    @Override
    public void sueldo() {
        System.out.println("Sueldo del docente: "+this.horas * this.pagaHora);
    }

    @Override
    public void bonificacion() {
        System.out.println("bonificacion docente: "+""+(this.horas*this.pagaHora)*0.7);
    }
    
}
