package service;

public class VendedorService implements Persistivel{
    @Override
    public void save() {
        System.out.println("Salvando...");
    }

    @Override
    public void update() {
        System.out.println("Alterando...");
    }

    @Override
    public void remove() {
        System.out.println("Excluindo...");
    }
}
