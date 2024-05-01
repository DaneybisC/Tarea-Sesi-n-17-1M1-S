import java.util.Scanner;

public class App {
    //Nombre: Daneybis Anahelly Calero Ochoa No.Carnet: 2024-1350U
    public static int num = 0;
    public static Scanner leer = new Scanner(System.in);
    public static int [] arreglo;
    public static int num2;

    public static void main(String[] args) throws Exception {

        boolean continuar = true;

        do {
            try {
                System.out.println("Ingrese el tamaño del arreglo:");
                num = leer.nextInt();
                continuar = (num >= 2 && num <= 16)? false : true;
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("No puede ingresar una letra.");
                leer.nextLine();
            }
        } while (continuar);


        int array[] = llenado();

        Mostrar(array);

        leer.close();
    }

    public static boolean continua1 = true;

    public static int [] llenado(){
        int [] arreglo = new int[num];
     do {
          try {
              System.out.println("coloque los datos del arreglo:");
              for (int i = 0; i < num;  i++) {
                 arreglo[i] = leer.nextInt();
                }
                continua1 = false;
            } catch (Exception e) {
                System.out.println("No puede ingresar una letra.");
                leer.nextLine();
            }
        } while (continua1);
        
        return arreglo;
    }

    public static void Mostrar(int []arreglo){
        System.out.println("Arreglo invertido: ");
        int num2 = arreglo.length - 1;
        for (int i = 0; i < arreglo.length; i++) {
            int [] arreglo2 = new int[arreglo.length];
            arreglo2[i] = arreglo[num2];
            num2--;
            System.out.println(arreglo2[i]);
        }
     }
}
