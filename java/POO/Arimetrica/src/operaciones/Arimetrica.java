/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

/**
 *
 * @author Sistemas
 */
public class Arimetrica {
    // atributos de clase
    int a;
    int b;
    
    
    //contructor vacio
    public Arimetrica(){
        System.out.println("EJecutando contructor");
    }
    
    public Arimetrica(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando contructor con argumentos: ");
    }
    
    //metodo
    
    public void suma(){
        int resultado = a + b; 
        System.out.println("Prueba normal: "+resultado);
    }
    
    public int sumarRetorno(){
        return a + b;
    }
    public int sumarArgumentos(int arg1, int arg2){
        this.a = arg1;
        this.b = arg2;
        return a + b;
    }
}
