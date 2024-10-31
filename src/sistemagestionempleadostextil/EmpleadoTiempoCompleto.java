
package sistemagestionempleadostextil;



public class EmpleadoTiempoCompleto extends Empleado implements GestionEmpleados {
private String especialidadTextil;
private String especialidadMaquinaria;
private boolean tieneExperienciaPrevia;

    public EmpleadoTiempoCompleto() {
    }

    public EmpleadoTiempoCompleto(String especialidadTextil, String especialidadMaquinaria, boolean tieneExperienciaPrevia) {
        this.especialidadTextil = especialidadTextil;
        this.especialidadMaquinaria = especialidadMaquinaria;
        this.tieneExperienciaPrevia = tieneExperienciaPrevia;
    }

    public EmpleadoTiempoCompleto(String especialidadTextil, String especialidadMaquinaria, boolean tieneExperienciaPrevia, String nombre, String rut, int edad, String fechaNacimiento) {
        super(nombre, rut, edad, fechaNacimiento);
        this.especialidadTextil = especialidadTextil;
        this.especialidadMaquinaria = especialidadMaquinaria;
        this.tieneExperienciaPrevia = tieneExperienciaPrevia;
    }
    

    public String getEspecialidadTextil() {
        return especialidadTextil;
    }

    public void setEspecialidadTextil(String especialidadTextil) {
        this.especialidadTextil = especialidadTextil;
    }

    public String getEspecialidadMaquinaria() {
        return especialidadMaquinaria;
    }

    public void setEspecialidadMaquinaria(String especialidadMaquinaria) {
        this.especialidadMaquinaria = especialidadMaquinaria;
    }

    public boolean isTieneExperienciaPrevia() {
        return tieneExperienciaPrevia;
    }

    public void setTieneExperienciaPrevia(boolean tieneExperienciaPrevia) {
        this.tieneExperienciaPrevia = tieneExperienciaPrevia;
    }

    @Override
    public String toString() {
        return "EmpleadoTiempoCompleto{" 
                + "nombre=" + getNombre() 
                + ", rut=" + getRut() 
                + ", edad=" + getEdad() 
                + ", fechaNacimiento=" 
                + getFechaNacimiento() 
                + "especialidadTextil=" 
                + especialidadTextil + ", especialidadMaquinaria=" 
                + especialidadMaquinaria + ", tieneExperienciaPrevia=" 
                + tieneExperienciaPrevia + '}';
    }

        @Override
    public void MostrarNombreYtipo() {
            System.out.println(this.nombre + "tiempo completo");
    }

    @Override
    public void MostrarSueldo() {
        System.out.println("Gana $1500000");
    }
    
}
