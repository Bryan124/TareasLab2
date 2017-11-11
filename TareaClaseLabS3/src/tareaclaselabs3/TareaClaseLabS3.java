package tareaclaselabs3;
import java.util.Scanner;
public class TareaClaseLabS3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 3 numeros en orden de mayor a menor: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        Calculos_Matematicos p = new Calculos_Matematicos(x,y,z);
        System.out.println("El MCD ES: " + p.mcd_euclides(x,y,z));
    }
}
