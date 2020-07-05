package pe.edu.upeu.ADQY;

import javax.xml.validation.Schema;

import com.google.gwt.junit.client.impl.JUnitHost.TestBlock;

import pe.edu.upeu.ADQY.Examen.ResolucionExamen;

public class App {
    public  static  <LeerTeclado> void  main ( String [] args ) {
        System.out.println ( " Sistema de menú de opciones ****** " );    
        try{
            LeerTeclado teclado = new  LeerTeclado ();            
            String opcion = "s" ; // S = SI, N = NO
            int numAlgoritm = 1 ;
            do {            
                numAlgoritm = ((Object) teclado) . leer ( 0 ,
                " Ingrese el número de Algoritmo que desea probar:\n" +
                    " 1 = Impusto por auto y su categoria\n " +
                    " 2 = Tabla de multiplicar del 1 al 20\n " +
                    " 3 = Números perfectos \n " +
                    " 4 = Cálculo de potencia \n " );  
                ResolucionExamen obj = new  ResolucionExamen ();
                
                switch (numAlgoritm) {
                    case  1 : 
                        new  impustoporautoysucategoria ();         
                    break ;  
                    case  2 : {
                        tablademultiplicardel1al20 ();
                    } break ;
                    case  3 : {
                         obj.numerosperfectos();
                    } break ;        
                    case  4 : {
                        practicaVectoresBasicos ();
                    } break ;            
                    predeterminado :  System.out.println ( "¡ La opción no existe! " ); break ;
                }            
                opcion = ((Object) teclado).leer("", "¿ Desea Probar mas Algoritmos? S = SI, N = NO ");
            } while (opcion == "S" || opcion == "s" );   
        } catch ( Excepción er) {
            System.out.println (er . getMessage ());
        }

    }

        

}
