
package co.edu.unicesar.utilidades;

import java.util.Scanner;

/**
 *
 * @author JAIRO
 */
public class Consola {
    
    private static Scanner entrada = new Scanner(System.in);
    
    public static String getString(String label, String format){
        return getString(String.format(format, label));
    }
    
    public static String getString(String label){
        System.out.print(label);
        entrada = new Scanner(System.in);
        return entrada.nextLine();
    }
    
    public static double getDouble(String label){
        System.out.print(label);
        return entrada.nextDouble();
    }
    
    public static double getDouble(String label, String format){
        return getDouble(String.format(format, label));
    }
    
    
    public static int getInteger(String label){
        System.out.print(label);
        return entrada.nextInt();
    }
    
    public static int getInteger(String label, String format){
        return getInteger(String.format(format, label));
    }
    
    
}
