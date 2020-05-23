import java.util.Scanner;

public class Alta {
    Scanner sc=new Scanner(System.in);
    public static void añadirCliente(HashSet<Cliente> clientes)
        System.out.println("Dame DNI del cliente que quieres añadir: ");
        String dni=sc.nextLine();
        System.out.println("Dame nombre del cliente: ");
        String nombre=sc.nextLine();
        System.out.println("Dame dirección del cliente: ");
        String direccion=sc.nextLine();

    //añades estos valores a un objeto cliente y lo añades al hashset


    public static void añadirCuenta(HashSet<Cuenta> cuentas, HashSet<Cliente> clientes){
        Consulta.consultarClientes(clientes);

    }
}
