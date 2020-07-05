package pe.edu.upeu.ADQY.Examen;
import java.io.*;
import java.util.Scanner;

public class ResolucionExamen {

    public static void impustoporautoysucategoria (String[] args) {
        Scanner in = new Scanner(System.in);
        int i, n;
        double categoria_1, categoria_2, categoria_3, clave, costo;
        double impuesto, impuesto_a_pagar;
        categoria_1 = 0;
        categoria_2 = 0;
        categoria_3 = 0;
        impuesto_a_pagar = 0;
        System.out.print("Ingrese la cantidad de vehiculos: ");
        n = in.nextInt();
        in.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("PROCESO " + i);
            System.out.print("Ingrese la clave del vehiculo: ");
            clave = in.nextDouble();
            in.nextLine();
            System.out.print("Ingrese el valor de costo del vehiculo: ");
            costo = in.nextDouble();
            in.nextLine();
            impuesto=0;
            if(clave==1)
            {
                impuesto=costo*0.1;
                categoria_1=categoria_1+impuesto;
            }
            if(clave==2)
            {
                impuesto=costo*0.07;
                categoria_2=categoria_2+impuesto;
            }
            if(clave==3)
            {
                impuesto=costo*0.05;
                categoria_3=categoria_3+impuesto;
            }
            impuesto_a_pagar=impuesto_a_pagar+impuesto;
            System.out.println("Valor de impuesto: " + impuesto);
            System.out.println();
        }
        System.out.println("Valor de categoria 1: " + categoria_1);
        System.out.println("Valor de categoria 2: " + categoria_2);
        System.out.println("Valor de categoria 3: " + categoria_3);
        System.out.println("Valor de impuesto a pagar: " + impuesto_a_pagar);
    }

    public static void tablademultiplicardel1al20(){
 
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduce un número entero: ");                                                         
        n = sc.nextInt();
        System.out.println("Tabla del " + n);
        for(int i = 1; i<=10; i++){
             System.out.println(n + " * " + i + " = " + n*i);                                                     
        }
    }


    public static void numerosperfectos (String[] args) {
        int numero=6;
        int sumas=1, menor=2, Mayor=numero;
        while ( menor < Mayor ) {
            Mayor = numero / menor;
            if ( numero % menor == 0 ) 
                sumas += menor;
            if ( Mayor != menor && numero % Mayor == 0 )
                sumas += Mayor;
            
	}
        if (sumas == numero) {
            System.out.println("El numero "+numero+" es un numero perfecto;");
        } else {
            System.out.println("El numero "+numero+" no es un numero perfecto;");
        }
    }



    public static void calculodepotencia(String args[]) throws IOException {
            BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
            double b;
            double e;
            double resultado;
            System.out.println("escriba la base");
            b = Double.parseDouble(bufEntrada.readLine());
            System.out.println("escribir el exponente");
            e = Double.parseDouble(bufEntrada.readLine());
            if (e==0) {
            resultado = 1;
            } else {
            resultado = b*Math.pow(b,e)-1;
             }
                System.out.println("El número "+b+" elevado a la potencia "+e+" es "+resultado);
        
            }
        

    
}