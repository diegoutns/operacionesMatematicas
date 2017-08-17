/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesmatematicas;

/**
 *
 * @author Valeria
 */
public class NivelDeAlumno {

    private int puntaje = 0;
    private String usuario = "";

    public int ActualizarPuntajeDeAlumno(String us, int pu) {
        puntaje=BuscarUsuario(us);
        return puntaje+pu;
    }
    
    public String ActualizarNivelDeAlumno(String us, int pu){
        puntaje=ActualizarPuntajeDeAlumno(us, pu);
        if (puntaje>ParametrosDelSistema.TopeNivel4) {
            return "Nivel 5 ";
        }else{
            if (puntaje>ParametrosDelSistema.TopeNivel3) {
                return "Nivel 4 ";                
            } else {
                if (puntaje > ParametrosDelSistema.TopeNivel2) {
                    return "Nivel 3 ";
                } else {
                    if (puntaje>ParametrosDelSistema.TopeNivel1) {
                        return "Nivel 2 ";
                    }else{
                        return "Nivel 1 ";
                    }                    
                }
            }
        }
    }

    private int BuscarUsuario(String us) {
        return 22;//en un futuro irá a base de datos a buscar el usuario
    }
    
    
}
