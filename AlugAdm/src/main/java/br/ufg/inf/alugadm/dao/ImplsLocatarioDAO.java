package br.ufg.inf.alugadm.dao;

import br.ufg.inf.alugadm.model.Locatario;
import br.ufg.inf.alugadm.persistence.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gustavosotnas
 */
public class ImplsLocatarioDAO implements LocatarioDAO {
    private final Connection connection;

    public ImplsLocatarioDAO() throws SQLException {
        this.connection = ConnectionFactory.getConnection();
    }
    @Override
    public void salvarLocatario(Locatario locatario) {
        String query = "INSERT INTO locatario "
                     + "(Nome, Cpf, Rg, Orgao, Sexo, DataNascimento, Telefone1, Telefone2, CodigoLocatario)"
                     + "VALUES (?,?,?,?,?,?,?,?,?)";
        setDadosBanco(query, locatario);
    }

    @Override
    public void editarLocatario(Locatario locatario) {
        throw new UnsupportedOperationException("editarLocatario não implementado"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Locatario> getListaLocatarios() {
        throw new UnsupportedOperationException("getListaLocatarios não implementado"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<String> getListaCodigoLocatarios() {
        throw new UnsupportedOperationException("getListaCodigoLocatarios não implementado"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluirLocatario(int id) {
        throw new UnsupportedOperationException("excluirLocatario não implementado"); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void setDadosBanco(String sql, Locatario locatario){
        int id = -1;
        try {
            PreparedStatement stmt = this.connection.prepareStatement(sql);

            stmt.setString(1, locatario.getNome());
            stmt.setString(2, locatario.getCpf());
            stmt.setString(3, locatario.getRg());
            stmt.setString(4, locatario.getOrgao());
            stmt.setString(5, locatario.getSexo());
            stmt.setString(6, locatario.getDataNascimento());
            stmt.setString(7, locatario.getTelefone1());
            stmt.setString(8, locatario.getTelefone2());
            stmt.setString(9, locatario.getCodigoLocatario());

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                id = rs.getInt(id);
            }
            
            stmt.close();
        }
        catch (SQLException ex) {
            Logger.getLogger(ImplsLocatarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            try {
                this.connection.close();
            }
            catch (SQLException ex) {
                Logger.getLogger(ImplsLocatarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
