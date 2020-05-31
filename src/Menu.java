import java.util.Scanner;

public class Menu {
    public static int menuPrincipal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione una opción: " +
                "\n1 - Añadir" +
                "\n2 - Eliminar" +
                "\n3 - Modificar la dirección de un cliente" +
                "\n4 - Consultas" +
                "\n5 - Consutlar movimientos entre fechas" +
                "\n6 - Salir");
        int op = Integer.parseInt(sc.nextLine());
        return op;
    }

    public static int menuAñadir() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menú añadir: " +
                "\n1 - Añadir cliente" +
                "\n2 - Añadir cuenta corriente" +
                "\n3 - Añadir cuenta a plazo" +
                "\n4 - Añadir movimiento" +
                "\n5 - Salir");
        int op = Integer.parseInt(sc.nextLine());
        return op;
    }

    public static int menuEliminar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu eliminar: " +
                "\n1 - Eliminar cuenta" +
                "\n2 - Eliminar cliente de una cuenta" +
                "\n3 - Salir");
        int op = Integer.parseInt(sc.nextLine());
        return op;
    }

    public static int menuConsulta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menú consulta: " +
                "\n1 - Ver clientes de una cuenta" +
                "\n2 - Ver las cuentas que tiene un cliente" +
                "\n3 - Ver los movimientos de una cuenta" +
                "\n4 - Salir");
        int op = Integer.parseInt(sc.nextLine());
        return op;
    }

    public static int menuMovimiento() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quieres ingresar o retirar dinero?" +
                "\n1 - Ingresar" +
                "\n2 - Retirar" +
                "\n3 - Salir");
        int op = Integer.parseInt(sc.nextLine());
        return op;
    }
}
