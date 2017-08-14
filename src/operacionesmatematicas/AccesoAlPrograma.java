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
public class AccesoAlPrograma {
    private String tipo1 ="Docente";
//    private String tipo2="Alumno";
//    private boolean esMail=false;
//    private boolean esPass=false;
    
    private boolean buscarUsuario(String m){
        return !m.isEmpty()&&m.contains("@");       
    }
    
    private boolean buscarContrasenia (String m){
        return !m.isEmpty();
    }
    public boolean LoguearUsuario (String tipoUsuario, String mail, String contraseña ){
        System.out.println("Logueando "+tipoUsuario+" "+mail+" "+contraseña);
        if (tipoUsuario.equals(tipo1)) {//usuario docente
            return buscarContrasenia(mail)&&buscarUsuario(mail);
        } else {// usuario alumno
            return buscarContrasenia(mail)&&buscarUsuario(mail);
        }
    }
}
