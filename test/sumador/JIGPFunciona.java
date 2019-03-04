package sumador;


//import java.lang.LayerInstantiationException;
//jdk.internal.jimage.decompressor.*
import java.util.*;



/**
 * 
 * @author nacho
 * @version 2.0
 * Clase para comprobar por consola que la clase TestAsumar funciona
 * Contiene objeto escaner para introducir los numeros por teclado 
 * y las salidas printl por consola que muestra un numero de un dígito
 * un número de una cifra y un número de varias cifras y las suma de sus cifras.
 *
 */
@SuppressWarnings("unused")
public class JIGPFunciona {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		/**
		 * OBJETO ESCANER PARA METER NUMERO POR TECLADO
		 */
		 Scanner sc = new Scanner(System.in);
		 
		 
		 
		 /**
		  * Aquí empieza las sentencias para la prueba de un sólo dígito
		  */
		 System.out.println("introduce un número para la prueba de un digito");
		 
	     String numero = sc.nextLine();
	     
	     TestASumar objetotest= new TestASumar();
	     
	     objetotest.ASumar(numero);
	     

		 System.out.println(objetotest.mostrar1(numero));
		 
		 
		 
		 /**
		  * Aquí empieza las sentencias para la prueba de un dígito negativo
		  */
		 System.out.println("introduce un número para la prueba de un numero negativo");
		 	     
	     	     
	     TestASumar objetotestnegativo= new TestASumar();
	     
	     int numero2 = sc.nextInt();
	     
	     //objetotestnegativo.ASumar2(numero2)
	     
		 System.out.println(objetotestnegativo.mostrar2(numero2));
		 
		 
		 /**
		  * Aquí empieza las sentencias para la prueba de un numero de varios dígitos 
		  */
		 System.out.println("introduce un número para la prueba de un numero de varios dígitos");
		 	     
	     	     
	     TestASumar objetotestvarios= new TestASumar();
	     
	     int numero3 = sc.nextInt();
	     
	     //objetotestnegativo.ASumar3(n)
	     
		 System.out.println(objetotestvarios.mostrar3(numero3));
		 
		 
		 
		 
		 
		 
	     

	}

}
