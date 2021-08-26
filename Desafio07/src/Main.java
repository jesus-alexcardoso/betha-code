import model.Diretor;
import model.Funcionario;
import repository.DiretorRepository;
import repository.FuncionarioRepository;
import service.DiretorService;
import service.FuncionarioService;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Scanner s = new Scanner(System.in);

//        //Funcionario
//        Funcionario funcionario = new Funcionario(4,"Anderson","15299676992",1000.00);
//        FuncionarioService serviceFunc = new FuncionarioService();
//        serviceFunc.save(funcionario);
//        funcionario.setNome(funcionario.getNome() + " Cardoso");
//        serviceFunc.update(funcionario);
//        System.out.println(funcionario.toString());
//        funcionario.getId();
//        //serviceFunc.delete(funcionario);
//
//        FuncionarioRepository funcRepository = new FuncionarioRepository();
//        funcRepository.findAll();
//        System.out.print("Código do funcionário: ");
//        Integer numeroFunc = s.nextInt();
//        funcRepository.findById(numeroFunc);

        //Diretor
        Diretor diretor = new Diretor(2,"Dona Maria","05499676992",1000.00, 25.0);

        DiretorService serviceDiretor = new DiretorService();
        serviceDiretor.save(diretor);
        diretor.setNome(diretor.getNome() + " Cardoso");
        serviceDiretor.update(diretor);
        System.out.println(diretor.toString());
        diretor.getId();
        //serviceDiretor.delete(diretor);

        DiretorRepository diretorRepository = new DiretorRepository();
        diretorRepository.findAll();
        System.out.print("Código do Diretor: ");
        Integer numeroDir = s.nextInt();
        diretorRepository.findById(numeroDir);

    }
}
