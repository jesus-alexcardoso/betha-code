import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lista {

    public static void main(String[] args) {
        List<Cliente> listaCliente = new ArrayList<Cliente>();

        Cliente clienteA = new Cliente(1,"Alex","05499676992","4881200-5");
        Cliente clienteB = new Cliente(2,"Aline","05499676992","4881200-5");
        Cliente clienteC = new Cliente(3,"Benjamin","05499676992","4881200-5");
        listaCliente.add(clienteA);
        listaCliente.add(clienteB);
        listaCliente.add(clienteC);

        System.out.println("Lista");
        System.out.println(listaCliente);
    }
}
