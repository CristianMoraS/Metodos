/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author Cristian Mora
 */
public class Busqueda {
                    /*** Busqueda Binaria ***/
    
    //El Metodo de BusquedaBinaria usa dos parametros, un vector(el cual debe 
    //estar ordenado), y un numero, que es el numero que se busca encontrar.
    public int BusquedaBinaria(int arreglo[],int elemento){
//Las variables Central, Alto y Bajo son utilizadas como indices, debido a que 
//la busqueda binaria analiza el vector primero en la parte Central luego en la 
//parte Alta y luego en la parte Baja. El valor Alto se inicializa en 0 debido 
//a que ese es el primer indice el valor bajo se inicializa en la longitud del 
//vector -1 para tomar la ultima medida.
        int ValorCentral, Central, Inicio, Fin;
        Inicio = 0;
        Fin= arreglo.length -1;
//El condicional While es utilizado para Saber el indice Central.
        while(Fin<=Inicio){
            Central = (Fin+Inicio)/2;
            ValorCentral = arreglo[Central];
            System.out.println("comparando a" + elemento + " con " + arreglo[Central]);
//El condicional if anidado se utiliza para saber si el numero ha sido 
//encontrado en el indice Central, si es asi mostrara el valo.
            if (elemento == ValorCentral) {
                return Central;
//De no ser el valor central se analiza si el numero es menor a los numeros del 
//indice Central, entonces si es asi se iguala a -1, con el fin de desplazarnos 
//hacia la izquierda.
            }else if (elemento < Central) {
                Fin=-1;                
//De no ser el valor central se analiza si el numero es mayor a los numeros del 
//indice Central, entonces si es asi se iguala a +1, con el fin de desplazarnos
//hacia la derecha.
            }else{
                Inicio=+1;
            }           
        }                
        return -1;
    }
}
