import model.Diretor;
import model.Funcionario;
import service.FuncionarioService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        //Funcionario
        Funcionario funcionario = new Funcionario(1,"Alex","05499676992",1000.00);
        FuncionarioService serviceFunc = new FuncionarioService();
        serviceFunc.save(funcionario);
        funcionario.setNome(funcionario.getNome() + " Cardoso");
        serviceFunc.update(funcionario);
        System.out.println(funcionario.toString());
        funcionario.getId();
        serviceFunc.delete(funcionario);

        //Diretor
        Diretor diretor = new Diretor(1,"Alex","05499676992",1000.00, 25.0);
        DiretorService serviceDiretor = new FuncionarioService();
        serviceFunc.save(funcionario);
        funcionario.setNome(funcionario.getNome() + " Cardoso");
        serviceFunc.update(funcionario);
        System.out.println(funcionario.toString());
        funcionario.getId();
        serviceFunc.delete(funcionario);

    }
}
