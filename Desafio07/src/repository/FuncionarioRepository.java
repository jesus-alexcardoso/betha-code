package repository;

import model.Funcionario;
import util.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioRepository implements IRepository {

    @Override
    public List<Funcionario> findAll() throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement statement = conn.prepareStatement("SELECT * FROM curso.funcionario ");
        ResultSet resultSet = null;
        resultSet = statement.executeQuery();

        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.println("---- Listagem INI ----");
        while (resultSet.next()) {
            String index = resultSet.getString(2);
            System.out.println(index);
        }
        System.out.println("---- Listagem FIM ----");
        conn.close();

        return funcionarios;
    }

    @Override
    public Object findById(Integer id) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement statement3 = conn.prepareStatement("SELECT * FROM curso.funcionario WHERE id = ?");
        statement3.setInt(1, id);
        ResultSet resultSet3 = null;
        resultSet3 = statement3.executeQuery();

        System.out.println("---- BUSCA POR ID INI ----");
        while (resultSet3.next()) {
            String index = resultSet3.getString(2);
            System.out.println(index);
        }
        System.out.println("---- BUSCA POR ID FIM ----");
        conn.close();

        //return new Funcionario();
        return null;
    }
}
