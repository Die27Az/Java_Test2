
package sistemagestionempleadostextil;

import java.util.Scanner;


public class SistemaGestionEmpleadosTextil {


    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        ManejoArrays ma = new ManejoArrays();
        Scanner Teclado = new Scanner(System.in);
        int opciones;
        
        do{
            System.out.println("===Bienvenido Menu===");
            System.out.println("1)Crear empleado tiempo Completo");
            System.out.println("2)Crear empleado tiempo Parcial");
            System.out.println("3)Crear empleado externo");
            System.out.println("0)Salir Menu");
            opciones = Teclado.nextInt();
            switch(opciones){
                    case 1 -> {
                        if(ma.obtenerTamanioArregloTipoCompleto() >= 5){
                        System.out.println("Wow, !Cuantos empleados!");
                         }
                        if(ma.obtenerTamanioArregloTipoCompleto() > 10){
                        System.out.println("Solo puede ingresar un maximo de 10 empleados Tiempo Completo");
                        break;
                        }else{
                            
                        System.out.println("Bienvenido a Crear empleado Tiempo Completo");
                        Teclado.nextLine();
                        
                        System.out.println("¿Cuantos Empleados desea agregar? max 10");
                        int n = Teclado.nextInt();
                        
                        if (n >10){
                            System.out.println("Solo puede agregar un maximo de 10 empleados");
                        }else{
                        for(int i =0; i< n ; i++) {
                        System.out.println("ingrese los datos para el empleado " +(i+1) +":");
                        Teclado.nextLine();
                        System.out.println("Ingrese un nombre: ");
                        String nombre1 = Teclado.nextLine();
                        System.out.println("Ingrese un rut: ");
                        String rut1 = Teclado.nextLine();
                        System.out.println("Ingrese una especialidad Textil: ");
                        String especialTextil1 = Teclado.nextLine();                       
                        System.out.println("Ingrese una especialidad Maquinaria: ");
                        String Maquinaria1 = Teclado.nextLine();
                        System.out.println("Ingrese si tiene experiencia previa ((True) para SI, o (False) para no en minusculas) ");
                        boolean Experiencia = Teclado.nextBoolean();
                        System.out.println("Ingrese su edad");
                        int edad = Teclado.nextInt();
                        System.out.println("Ingrese fecha de nacimiento dd/mm/aaaa");
                        String fechaNacimiento = Teclado.next();
                        System.out.println("");
                        
                        
                        EmpleadoTiempoCompleto empleadoFull1 = new EmpleadoTiempoCompleto (
                                especialTextil1,
                                Maquinaria1,
                                Experiencia,
                                nombre1,
                                rut1,
                                edad,
                                fechaNacimiento);
                        
                        ma.agregarEmpleadoTiempoCompleto(empleadoFull1);
                        }
                        
                        System.out.println("La cantidad de trabajadores ingresados son: "+ma.obtenerTamanioArregloTipoCompleto()); 
                            
                        break;
                        }
                        }
                }
                    case 2 -> {
                        System.out.println("Bienvenido a Crear empleado Tiempo Parcial");
                        if(ma.obtenerTamanioArregloTipoParcial() > 3){
                            System.out.println("Solo puede ingresar un maximo de 3 empleados Parciales");
                            break;
                        }else{
                       System.out.println("¿Cuantos Empleados desea agregar? max 3");
                        int n = Teclado.nextInt();
                        if (n >3){
                            System.out.println("Solo puede agregar un maximo de 3 empleados");
                        }else{
                        for(int i =0; i< n ; i++) {
                        System.out.println("ingrese los datos para el empleado " +(i+1) +":");

                        Teclado.nextLine();
                        System.out.println("Ingrese un nombre: ");
                        String nombre1 = Teclado.nextLine();
                        System.out.println("Ingrese un rut: ");
                        String rut1 = Teclado.nextLine();
                        System.out.println("Ingrese Cantidad de horas: ");
                        int horas = Teclado.nextInt();                       
                        System.out.println("¿Tiene otro trabajo (TRUE) para SI o (False) para NO: ");
                        boolean otroTrabajo = Teclado.nextBoolean();                       
                        System.out.println("Ingrese su edad");
                        int edad = Teclado.nextInt();
                        System.out.println("Ingrese fecha de nacimiento dd/mm/aaaa");
                        String fechaNacimiento = Teclado.next();
                        System.out.println("");
                        
                        EmpleadoTiempoParcial empleadoPartime = new EmpleadoTiempoParcial (
                                horas,
                                otroTrabajo,
                                nombre1,
                                rut1,
                                edad,
                                fechaNacimiento);
                        
                        ma.agregarEmpleadoTipoParcial(empleadoPartime);
                        }
                        }
                        System.out.println("La cantidad de trabajadores Parciales ingresados son: "+ma.obtenerTamanioArregloTipoParcial()); 
                        
                        break;
                        }
                }
                    case 3 -> {
                        System.out.println("Bienvenido a Crear empleado Externo");
                         if(ma.obtenerTamanioArregloTipoParcial() > 6){
                            System.out.println("Solo puede ingresar un maximo de 6 empleados Parciales");
                            break;
                        }else{
                       System.out.println("¿Cuantos Empleados desea agregar? max 6");
                        int n = Teclado.nextInt();
                        if (n >6){
                            System.out.println("Solo puede agregar un maximo de 6 empleados");
                        }else{
                        for(int i =0; i< n ; i++) {
                        System.out.println("ingrese los datos para el empleado " +(i+1) +":");
                        Teclado.nextLine();
                        System.out.println("Ingrese un nombre: ");
                        String nombre1 = Teclado.nextLine();
                        System.out.println("Ingrese un rut: ");
                        String rut1 = Teclado.nextLine();
                        System.out.println("Ingrese el nombre de su empresa: ");
                        String nombreEmpresa1 = Teclado.nextLine();                       
                        System.out.println("Ingrese el sueldo: ");
                        int sueldo1 = Teclado.nextInt();
                        System.out.println("Ingrese su edad");
                        int edad = Teclado.nextInt();
                        System.out.println("Ingrese fecha de nacimiento dd/mm/aaaa");
                        String fechaNacimiento = Teclado.next();
                        System.out.println("");
                        
                        
                        EmpleadoExterno empleadoExterno1 = new EmpleadoExterno (
                                nombreEmpresa1,
                                sueldo1,
                                nombre1,
                                rut1,
                                edad,
                                fechaNacimiento);

                        ma.agregarEmpleadoExterno(empleadoExterno1);

                        }
                        System.out.println("La cantidad de trabajadores Externos son: "+ma.obtenerTamanioArregloExterno());
                        
                        break;
                    }
                   }
                  }
                    case 0 ->{
                        System.out.println("Menu terminado vuelva pronto");
                        break;
                    }
                    
                    default -> {
                        System.out.println("Opcion invalida intente nuevamente");
                        break;
                }
             }
           

        }while(opciones != 0);
        Teclado.close();
            }
        
        
}
