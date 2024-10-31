
package sistemagestionempleadostextil;


public class Empleado {
    protected String nombre;
    protected String rut;
    protected int edad;
    protected String fechaNacimiento;

    public Empleado() {
    }

    public Empleado(String nombre, String rut, int edad, String fechaNacimiento) {
        if (edad < 1 || edad > 50){
        throw new IllegalArgumentException("La edad debe estar entre 1 y 50 años");
    }
        this.nombre = nombre;
        this.rut = rut;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad < 1 || edad > 50){
        throw new IllegalArgumentException("La edad debe estar entre 1 y 50 años");
    }
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", rut=" + rut + ", edad=" + edad + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    
}
