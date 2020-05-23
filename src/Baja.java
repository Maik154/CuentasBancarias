import java.util.HashSet;
import java.util.Scanner;

public class Baja {
    Scanner sc=new Scanner(System.in);
    public static Hashset<Cliente> eliminarCliente(HashSet<Cliente> clientes, Scanner sc){
        Consulta.consultarClientes(clientes);
        System.out.println("Dame dni del cliente que quieres eliminar: ");
        String dni=sc.nextLine();
    }
}
