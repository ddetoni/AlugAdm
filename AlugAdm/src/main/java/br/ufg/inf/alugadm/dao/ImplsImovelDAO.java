package br.ufg.inf.alugadm.dao;

import br.ufg.inf.alugadm.model.Imovel;
import br.ufg.inf.alugadm.persistence.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ImplsImovelDAO{

    private final Connection connection;
    private ArrayList<Imovel> linhaImovel;
    private ArrayList<String> linhaCodigo;
    private Imovel imovel;
    private String sql;

    public ImplsImovelDAO() throws SQLException {
        this.connection = ConnectionFactory.getConnection();
    }

    public ArrayList<Imovel> getListaImoveis() throws SQLException {
    linhaImovel = new ArrayList<Imovel>();
        sql = "SELECT id, data_cadastro, categoria, tipo_imovel, status, logradouro,complemento, cidade, estado, num_quartos, garagem,"
                + " valor_aluguel, cep FROM imovel";

        PreparedStatement stmt = this.connection.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            imovel = new Imovel();
            
            imovel.setId(rs.getString("id"));
            imovel.setData_cadastro(rs.getString("data_cadastro"));
            imovel.setCategoria(rs.getString("categoria"));
            imovel.setTipo_imovel(rs.getString("tipo_imovel"));
            imovel.setStatus(rs.getString("status"));
            imovel.setLogradouro(rs.getString("logradouro"));
            imovel.setComplemento(rs.getString("complemento"));
            imovel.setCidade(rs.getString("cidade"));
            imovel.setEstado(rs.getString("estado"));
            imovel.setNum_quartos(rs.getString("num_quartos"));
            imovel.setGaragem(rs.getString("garagem"));
            imovel.setValor_aluguel(rs.getString("valor_aluguel"));
            imovel.setCep(rs.getString("cep"));
            
            linhaImovel.add(imovel);
        }

        return linhaImovel;    
    }

    public boolean linhaExiste(String id) {
        linhaImovel = new ArrayList<Imovel>();
        sql = "SELECT id FROM alugadm WHERE id = ?";

        try {
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            stmt.setString(1, id);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ImplsImovelDAO.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public void salvarImovel(Imovel imovel) throws SQLException {
        String id = imovel.getId();
        boolean exist = linhaExiste(id);
        if (!exist) {
            String sql = "INSERT INTO imovel (id, data_cadastro, categoria, tipo_imovel, status, logradouro, complemento, cidade, estado, num_quartos, garagem, valor_aluguel, cep VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            try {
                
                stmt.setString(1, imovel.getId());
                stmt.setString(2, imovel.getData_cadastro());
                stmt.setString(3, imovel.getCategoria());
                stmt.setString(4, imovel.getTipo_imovel());
                stmt.setString(5, imovel.getStatus());
                stmt.setString(6, imovel.getLogradouro());
                stmt.setString(7, imovel.getComplemento());
                stmt.setString(8, imovel.getCidade());
                stmt.setString(9, imovel.getEstado());
                stmt.setString(10, imovel.getNum_quartos());
                stmt.setString(11, imovel.getGaragem());
                stmt.setString(12, imovel.getValor_aluguel());
                stmt.setString(13, imovel.getCep());
                stmt.execute();
                stmt.close();

                ResultSet rs = stmt.executeQuery();
            } catch (SQLException e) {
                Logger.getLogger(ImplsImovelDAO.class
                        .getName()).log(Level.SEVERE, null, e);
            }
        } else {
            sql = "UPDATE alugadm SET id=?, data_cadastro=?, categoria=?, tipo_imovel=?, status=?, logradouro=?, "
                    + "complemento=?, cidade=?, estado=?, num_quartos=?, garagem=?, valor_alguel=?, cep=?";
            try {
                PreparedStatement stmt = this.connection.prepareStatement(sql);
                stmt.setString(1, imovel.getId());
                stmt.setString(2, imovel.getData_cadastro());
                stmt.setString(3, imovel.getCategoria());
                stmt.setString(4, imovel.getTipo_imovel());
                stmt.setString(5, imovel.getStatus());
                stmt.setString(6, imovel.getLogradouro());
                stmt.setString(7, imovel.getComplemento());
                stmt.setString(8, imovel.getCidade());
                stmt.setString(9, imovel.getEstado());
                stmt.setString(12, imovel.getGaragem());
                stmt.setString(12, imovel.getValor_aluguel());
                stmt.setString(13, imovel.getCep());
                stmt.execute();
                stmt.close();
            } catch (SQLException e) {
                Logger.getLogger(ImplsImovelDAO.class.getName()).log(Level.SEVERE, null, e);
            }

        }
    }

    public void editarImovel(Imovel imovel) {
        String sql = "UPDATE alugadm SET id=?, data_cadastro=?, categoria=?, tipo_imovel=?, status=?, logradouro=?, "
                + "complemento=?, cidade=?, estado=?, num_quartos=?, garagem=?, valor_alguel=?, cep=?";

        try {
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            stmt.setString(1, imovel.getId());
            stmt.setString(2, imovel.getData_cadastro());
            stmt.setString(3, imovel.getCategoria());
            stmt.setString(4, imovel.getTipo_imovel());
            stmt.setString(5, imovel.getStatus());
            stmt.setString(6, imovel.getLogradouro());
            stmt.setString(7, imovel.getComplemento());
            stmt.setString(8, imovel.getCidade());
            stmt.setString(9, imovel.getEstado());
            stmt.setString(12, imovel.getGaragem());
            stmt.setString(12, imovel.getValor_aluguel());
            stmt.setString(13, imovel.getCep());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(ImplsImovelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<String> getListaCodigoImoveis() {
        String sql = "SELECT * FROM imovel";
        linhaCodigo = new ArrayList<String>();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                imovel = new Imovel();
                String id = imovel.getId();
                String codigo = String.valueOf(id);
                linhaCodigo.add(codigo);
            }
        } catch (SQLException e) {
            Logger.getLogger(ImplsImovelDAO.class.getName()).log(Level.SEVERE, null, e);
        }

        return linhaCodigo;
    }

    public void excluirImovel(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
