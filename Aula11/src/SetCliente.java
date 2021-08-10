import java.util.HashSet;
import java.util.Set;

public class SetCliente {
    public static void main(String[] args) {

        System.out.println("Set");

        Set<Cliente> setCliente = new HashSet<Cliente>();

        Cliente clienteA = new Cliente(1,"Alex","05499676992","4881200-5");
        Cliente clienteB = new Cliente(2,"Aline","05499676992","4881200-5");
        Cliente clienteC = new Cliente(3,"Benjamin","05499676992","4881200-5");

        setCliente.add(clienteA);
        setCliente.add(clienteB);
        setCliente.add(clienteC);

        System.out.println(setCliente);
    }
}
