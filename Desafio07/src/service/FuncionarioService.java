package service;

import model.Funcionario;
import util.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FuncionarioService implements IService<Funcionario> {

    @Override
    public Funcionario save(Funcionario funcionario) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement insert = conn.prepareStatement("insert into curso.funcionario values(?,?,?,?)");
        insert.setInt(1, funcionario.getId());
        insert.setString(2, funcionario.getNome());
        insert.setString(3, funcionario.getCpf());
        insert.setDouble(4, funcionario.getSalario());
        insert.executeUpdate();
        conn.close();

        return funcionario;
    }

    @Override
    public Funcionario update(Funcionario funcionario) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement update = conn.prepareStatement("UPDATE curso.funcionario SET nome = ? WHERE id = ?");
        update.setString(1, funcionario.getNome());
        update.setInt(2, funcionario.getId());
        update.executeUpdate();
        conn.close();

        return null;
    }

    @Override
    public Funcionario delete(Funcionario funcionario) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement statement2 = conn.prepareStatement("DELETE FROM curso.funcionario WHERE ID = ?");
        statement2.setInt(1, funcionario.getId());
        statement2.executeUpdate();
        conn.close();

        return null;
    }
}
