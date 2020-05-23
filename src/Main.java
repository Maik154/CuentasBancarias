import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int op = Menu.menuPrincipal();
        List<Cliente> clientes = new ArrayList<>();
        List<Cuenta> cuentas = new ArrayList<>();
        switch (op) {
            case 1:
                switch(Menu.menuAñadir()){
                    case 1:
                        Alta.añadirCliente(clientes);
                        break;
                    case 2:

                        break;
                    case 3:
                        Alta.añadirCuentaPlazo(cuentas, clientes);
                        break;
                    case 4:

                        break;
                    case 5:

                        break;
                    default:

                }
                break;
            case 2:
                Menu.menuEliminar();
                break;
            case 3:

                break;
            case 4:
                Menu.menuConsulta();
                break;
            case 5:
                break;
            default:
                System.out.println("Opción no existente.");
        }
    }
}
