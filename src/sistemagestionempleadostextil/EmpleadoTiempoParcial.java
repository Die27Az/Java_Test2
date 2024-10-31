
package sistemagestionempleadostextil;




public class EmpleadoTiempoParcial extends Empleado implements GestionEmpleados {
    private int cantidadHoras;
    private boolean tieneOtroTrabajo;

    public EmpleadoTiempoParcial() {
    }

    public EmpleadoTiempoParcial(int cantidadHoras, boolean tieneOtroTrabajo) {
        this.cantidadHoras = cantidadHoras;
        this.tieneOtroTrabajo = tieneOtroTrabajo;
    }

    public EmpleadoTiempoParcial(int cantidadHoras, boolean tieneOtroTrabajo, String nombre, String rut, int edad, String fechaNacimiento) {
        super(nombre, rut, edad, fechaNacimiento);
        this.cantidadHoras = cantidadHoras;
        this.tieneOtroTrabajo = tieneOtroTrabajo;
    }

    public int getCantidadHoras() {
        return cantidadHoras;
    }

    public void setCantidadHoras(int cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }

    public boolean isTieneOtroTrabajo() {
        return tieneOtroTrabajo;
    }

    public void setTieneOtroTrabajo(boolean tieneOtroTrabajo) {
        this.tieneOtroTrabajo = tieneOtroTrabajo;
    }
    
    
        @Override
    public String toString() {
        return "EmpleadoTiempoParcial{" + "nombre=" + getNombre() 
                + ", rut=" + getRut() 
                + ", edad=" + getEdad() 
                + ", fechaNacimiento=" 
                + getFechaNacimiento()
                + "cantidadHoras=" 
                + cantidadHoras 
                + ", tieneOtroTrabajo=" 
                + tieneOtroTrabajo + '}';
    }

    @Override
    public void MostrarNombreYtipo() {
        System.out.println(this.nombre + "tiempo parcial");
    }

    @Override
    public void MostrarSueldo() {
        System.out.println("Gana $500000");
    }
}
