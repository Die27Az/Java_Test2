
package sistemagestionempleadostextil;




public class EmpleadoExterno extends Empleado implements GestionEmpleados {
private String nombreEmpresaExterna;
private float sueldoEmpresaExterna;

    public EmpleadoExterno() {
    }

    public EmpleadoExterno(String nombreEmpresaExterna, float sueldoEmpresaExterna) {
        this.nombreEmpresaExterna = nombreEmpresaExterna;
        this.sueldoEmpresaExterna = sueldoEmpresaExterna;
    }

    public EmpleadoExterno(String nombreEmpresaExterna, float sueldoEmpresaExterna, String nombre, String rut, int edad, String fechaNacimiento) {
        super(nombre, rut, edad, fechaNacimiento);
        this.nombreEmpresaExterna = nombreEmpresaExterna;
        this.sueldoEmpresaExterna = sueldoEmpresaExterna;
    }

    


    public String getNombreEmpresaExterna() {
        return nombreEmpresaExterna;
    }

    public void setNombreEmpresaExterna(String nombreEmpresaExterna) {
        this.nombreEmpresaExterna = nombreEmpresaExterna;
    }

    public float getSueldoEmpresaExterna() {
        return sueldoEmpresaExterna;
    }

    public void setSueldoEmpresaExterna(float sueldoEmpresaExterna) {
        this.sueldoEmpresaExterna = sueldoEmpresaExterna;
    }

    @Override
    public String toString() {
        return "EmpleadoExterno{" + "nombre=" + getNombre() 
                + ", rut=" + getRut() 
                + ", edad=" + getEdad() 
                + ", fechaNacimiento=" 
                + getFechaNacimiento()
                + "nombreEmpresaExterna=" 
                + nombreEmpresaExterna 
                + ", sueldoEmpresaExterna=" 
                + sueldoEmpresaExterna + '}';
    }
    
    
        @Override
    public void MostrarNombreYtipo() {
        System.out.println(this.nombre + "Externo");
    }

    @Override
    public void MostrarSueldo() {
        System.out.println("Gana $4000000");
                
    }
}


