package pe.edu.upeu.ADQY;
import  java.io.BufferedReader ;
import  java.io.InputStreamReader ;
import  java.io.IOException ;

public class LeerTeclado {
    BufferedReader readT = new BufferedReader (new InputStreamReader (System. in));

    public int leer (int data, String message) {
        try {
            System.out.println (message);
            Object integer;
			data = ((Object) integer). parseInt (readT. readLine ());
        } catch (IOException e) {
            System.err.println (+ex.getMessage ());
        }
        return data;
    }

     public void leer (String data, String message) {
        try {
            System.out.println (message);
            data = readT. readLine ();
        } catch (IOException e) {
            System.err.println (+ex.getMessage ());
        }
        return;
    }

     public char read (char data, String message) {
        try {
            System.out.println (message);
            data = readT. readLine (). charAt (0);
        } catch (IOException e) {
            System.err.println (+ex.getMessage ());
        }
        return data;
    }

     public double reading (double data, string message) {
        try {
            System.out.println (message);
            data = double. parseDouble (readT. readLine ());
        } catch (IOException e) {
            System.err.println (+ex.getMessage ());
        }
        return data;
    }

}