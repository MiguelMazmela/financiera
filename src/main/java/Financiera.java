
import Variables.Var;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author miguel
 */
public class Financiera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Var v= new Var();
        v.conectar();
        System.out.println(v.getsSistemaOperativo());
        System.out.println(v.getCaminoCompletoBD());
        System.out.println(v.isConectado());
    }
    
}
