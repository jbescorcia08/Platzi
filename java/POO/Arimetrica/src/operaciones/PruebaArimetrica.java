/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

/**
 *
 * @author Sistemas
 */
public class PruebaArimetrica {
    public static void main(String[] args) {
        
        var a = 20;
        var b = 23;
        miMetodo();
        Arimetrica arimetrica1 = new Arimetrica();
        System.out.println("arimetrica1 a: "+ arimetrica1.a);
        System.out.println("arimetrica1 b: "+ arimetrica1.b);
        
        Arimetrica arimetrica2 = new Arimetrica(45, 87);
        System.out.println("arimetrica2 a: "+ arimetrica2.a);
        System.out.println("arimetrica2 b: "+ arimetrica2.b);
    }
    private static void miMetodo() {
        
    }
    
}
