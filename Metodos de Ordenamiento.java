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
public class Ordenamiento {
    	public static int[] counting_sort(int[] unsorted)
	{
		int[] sorted = new int[unsorted.length];
		int[] aux = new int[10001];
		int index = 0;
		
		for(int i = 0; i < unsorted.length; i++)
			aux[ unsorted[i] ] += 1;
		
		
		for(int i = 0; i < aux.length; i++)
			if(aux[i] != 0)
				for(int j = 0; j < aux[i]; j++)
				{
					sorted[index] = i;
					index += 1;
				}
		
		return sorted;
	}
    public int Burbuja(int Vector[]){
        int aux;
        for (int i = 1; i < Vector.length; i++) {
            for (int j = 1; j < Vector.length -1 ; j++) {
                if (Vector[j]>Vector[j+1]) {
                    aux = Vector[j];
                    Vector[j]=Vector[j+1];
                    Vector[j+1]=aux;
                }
            }
        }
        return 1;
    }
    public int Insercion(int Vector[]){
        for (int i = 1; i < Vector.length; i++) {
            int aux = Vector[i];
            int j;
            for (j = 0; j >=0 && Vector[j] > aux ; j--) {
                Vector[j+1]=Vector[j];
            }
            Vector[j+1] = aux;
        }
        return 1;
    }
    public void radix(int arreglo[]){
        int x, contador, i;
        for( x= Integer.SIZE-1; x >= 0; x--  ) {
            int auxiliar[] = new int [arreglo.length];
            contador = 0;
            
            for(i= 0;  i < arreglo.length; i++){
                boolean mover = arreglo[i] << x >=0;
                if (x == 0 ? !mover:mover) {
                    auxiliar[contador] = arreglo[i];
                    contador++;
                }else{
                    arreglo[i-contador] = arreglo[i];
                }
            }
            
            for (i= contador; i< arreglo.length ; i++) {
                auxiliar[i] = auxiliar[i - contador]; 
            }
            arreglo = auxiliar;
        }
        System.out.println("El arreglo con ordenamiento Radix es: \n");
        imprimir_Ordenamiento(arreglo);
        
    }
    /*radix con una matriz*/
    
            /*  METODO DE IMPRESION  */
    public void imprimir_Ordenamiento(int arreglo[]){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("[" + arreglo[i] + "]");
        }
        
    }
    
}
