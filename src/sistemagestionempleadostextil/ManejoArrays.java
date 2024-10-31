/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionempleadostextil;

import java.util.ArrayList;


public class ManejoArrays {
    ArrayList<EmpleadoTiempoCompleto>listaEmpleadoTiempoCompleto = new ArrayList<>();
    ArrayList<EmpleadoTiempoParcial>listaEmpleadoTiempoParcial = new ArrayList<>();
    ArrayList<EmpleadoExterno>listaEmpleadoExterno = new ArrayList<>();
    
    
    public boolean validarSiExiste(String rut){
        if(!listaEmpleadoTiempoCompleto.isEmpty()){
            for(EmpleadoTiempoCompleto listaTiempoCompleto : listaEmpleadoTiempoCompleto){
                if(listaTiempoCompleto.getRut().equalsIgnoreCase(rut)){               
                    return true;
                }
            }
        }
       
        if(!listaEmpleadoExterno.isEmpty()){
            for(EmpleadoExterno listaTipoExterno : listaEmpleadoExterno){
            
                if(listaTipoExterno.getRut().equalsIgnoreCase(rut)){              
                    return true;
                }
            }
        }
        
        if(!listaEmpleadoTiempoParcial.isEmpty()){
            for(EmpleadoTiempoParcial listaTipoParcial : listaEmpleadoTiempoParcial){
                if(listaTipoParcial.getRut().equalsIgnoreCase(rut)){               
                    return true;
                }
            }
        }
        
        return false;
    }
    
    
    public void agregarEmpleadoTiempoCompleto(EmpleadoTiempoCompleto empleado){
        if(validarSiExiste(empleado.getRut())){
            System.out.println("Trabajador ya existe, intente nuevamente");
            
        }else{
            listaEmpleadoTiempoCompleto.add(empleado);    
            System.out.println("Trabajador agregado de RUT " + empleado.getRut());
        }
        
    }
    public void agregarEmpleadoExterno(EmpleadoExterno empleado){
        if(validarSiExiste(empleado.getRut())){
             System.out.println("Trabajador ya existe, intente nuevamente");
        }else{
            listaEmpleadoExterno.add(empleado);    
        }       
    }
    public void agregarEmpleadoTipoParcial(EmpleadoTiempoParcial empleado){    
        if(validarSiExiste(empleado.getRut())){
            System.out.println("Trabajador ya existe, intente nuevamente");
        }else{
            listaEmpleadoTiempoParcial.add(empleado);    
        }   
    }
    
    
        public int obtenerTamanioArregloTipoCompleto(){
        return listaEmpleadoTiempoCompleto.size();
    }
        
        public int obtenerTamanioArregloTipoParcial(){
        return listaEmpleadoTiempoParcial.size();
    }
    
         public int obtenerTamanioArregloExterno(){
        return listaEmpleadoExterno.size();
    }   
    
    
    
}
