package array;

import java.util.Scanner;

public class Array {
Scanner intro= new Scanner(System.in);

/**
 * 
 * @param vector 
 * 
 */
    public void Inicializar (int vector[]){
        int i;
        for (i=0;i<vector.length;i++){
            System.out.println ("Dime el elemento número: "+(i+1));
            vector[i]=intro.nextInt();
        }
    }
/**
 * 
 * @param vector 
 * Método que nos indica cual es el mayor de los numeros de un vector
 */   
    public void Mayor (int vector[]){
      int aux=vector[0],i;
      for (i=0;i<vector.length;i++){
          if (vector[i]>aux){
              aux=vector[i];
          }
      }
      System.out.println ("El mayor de los números introducidos es: "+aux);
      
    }
    /**
     * 
     * @param vector 
     * @return aux Una variable con el valor del menor de los números
     */
    public int Menor (int vector[]){
        int aux=vector[0],i;
        for (i=0;i<vector.length;i++){
            if (vector[i]<aux){
                aux=vector[i];
            }
        }
      return(aux);
    }
    
    public void Promedio(int vector[]){
        int aux,i;
        double result=0;
        for (i=0;i<vector.length;i++){
            result=result+vector[i];
        }
        result=result/vector.length;
        System.out.println("El promedio es: "+result);
    }
    
    public void Visualizar(int vector[]){
        int i;
        for (i=0;i<vector.length;i++){
            System.out.print(vector[i]+" ");
        }
        System.out.println("");
        }
    
    public void Igual (int vector[], int vector1[]){
        int i=0,contador=1;
        if (vector1.length==vector.length){
            while ((vector[i]==vector1[i]) && contador<vector.length){
                contador++;
                i++;
            }
        }
        
        System.out.println(contador);
        System.out.println(vector.length);
        if (contador==vector.length){
            System.out.println("Los vectores son iguales");
        }else{
            System.out.println("Los vectores no son iguales");
        }
        }
    
    public void Palindromo (int vector[]){
        int inc=0, fin=vector.length-1;
        int aux=(int)vector.length/2;
        boolean comprobar=true;
        System.out.println("Valor variable aux: "+aux);
        if (vector.length%2==0){
            
            while ((inc<=fin)&&(comprobar==true)){
                //System.out.println("Entra en el bucle par y la comprobacion");
                //System.out.println("Valor fin: "+fin);
                if (vector[inc]==vector[fin]){
                    inc++;
                    fin--;
                    //System.out.println("Variables inc y fin :"+inc+" "+fin);
                }else{
                    comprobar=false;
                }
            }
        }else{
            System.out.println("Entra en el bucle impar");
            System.out.println("Valor de la variable inc: "+inc);
            while ((inc<=aux)&&(comprobar==true)){
                System.out.println("Comprobacion");
                if (vector[inc]==vector[fin]){
                    System.out.println("Contador:");
                    inc++;
                    fin--;
                    System.out.println(inc+" "+fin);
                }else{
                    comprobar=false;
                }
            }
        }
        if (comprobar==true){
            System.out.println("El número es palíndromo");
        }else{
            System.out.println("El número no es palíndromo");
        }
        
    }
    
    public void Burbuja(int vector[]){
         int i, x, aux;
         for(i=0;i<vector.length-1;i++){
              for(x=0;x<vector.length-i-1;x++){
                   if(vector[x+1]<vector[x]){
                      aux=vector[x+1];
                      vector[x+1]=vector[x];
                      vector[x]=aux;
                   }
              }
         }
         System.out.println("Vector ordenado");
         Array ver=new Array();
         ver.Visualizar(vector);
    }
    

    public static void main (String args[]) {
        int op,num,num1,menor;
        Scanner intro= new Scanner(System.in);
        Array fun=new Array();
        
        //.........numero elementos.....................
        System.out.println("Dime el número de elementos del vector: ");
        num=intro.nextInt();
        int vector []=new int [num];
        //---------------------------------------------
    do{    
        do{
        //.............menú............................
        System.out.println("Introduce algunas de las opciones:");
        System.out.println("1: Inicializar");
        System.out.println("2: Visualizar");
        System.out.println("3: Mayor");
        System.out.println("4: Menor");
        System.out.println("5: Media");
        System.out.println("6: Iguales");
        System.out.println("7: Palindromo");
        System.out.println("8: Ordenar");
        System.out.println("0: Salir");
        
        op=intro.nextInt();
        
        }while (op<0 || op>8);
        //-----------------------------------------------
        
        switch (op){
            case 1: fun.Inicializar(vector);
                break;
            case 2: fun.Visualizar(vector);
                break;
            case 3: fun.Mayor(vector);
                break;
            case 4: menor=fun.Menor(vector);
                    System.out.println("El menor de todos los elementos es= "+menor);
                break;
            case 5: fun.Promedio(vector);
                break;
            case 6: System.out.println("¿Cuantos elementos quieres que tenga el vector?: ");
                    num1=intro.nextInt();
                    int vector1[]=new int [num1];
                    fun.Inicializar(vector1);
                    fun.Igual(vector,vector1);
                break;
            case 7: fun.Palindromo(vector);
                break;
            case 8: fun.Burbuja(vector);
                break;
            }
        
     
    }while (op>0);
        System.out.println("HASTA LUEGO");
   }
}
