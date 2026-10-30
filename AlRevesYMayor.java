public class AlRevesYMayor {

    public static void main(String[] args) {
        
     
        int[] numeros = {15, 35, 65, 75, 95};

        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número " + (i + 1) + ": " + numeros[i]);
        }

        System.out.print("Al revés: ");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println(); 

      
        int mayor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

   
        System.out.println("El mayor es: " + mayor);
    }
}