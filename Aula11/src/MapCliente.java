import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapCliente {
    public static void main(String[] args) {
        Map<String, Cliente> mapCliente = new TreeMap<String, Cliente>();

        System.out.println("Mapas");

        Cliente clienteA = new Cliente(1,"Alex","05499676992","4881200-5");
        Cliente clienteB = new Cliente(2,"Aline","05499676992","4881200-5");
        Cliente clienteC = new Cliente(3,"Benjamin","05499676992","4881200-5");

        mapCliente.put("Alex", clienteA);
        mapCliente.put("Aline", clienteB);
        mapCliente.put("Benjamin", clienteC);

        System.out.println(mapCliente);
        System.out.println(mapCliente.get("Aline"));

        Collection<Cliente> clientes = mapCliente.values();
        for(Cliente c : clientes){
            System.out.println(c);
        }

        String cpf = mapCliente.get("Aline").getCpf();
        System.out.println(cpf);
    }
}
