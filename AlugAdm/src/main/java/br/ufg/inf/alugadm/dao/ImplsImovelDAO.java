package br.ufg.inf.alugadm.dao;

import br.ufg.inf.alugadm.model.Imovel;
import br.ufg.inf.alugadm.persistence.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.omg.PortableServer.ThreadPolicyOperations;

public class ImplsImovelDAO implements ImovelDao {

    private final Connection connection;
    private ArrayList<Imovel> linhaImovel;
    private ArrayList<String> linhaCodigo;
    private Imovel imovel;
    private String sql;

    public ImplsImovelDAO() throws SQLException {
        this.connection = ConnectionFactory.getConnection();
    }

    @Override
    public ArrayList<Imovel> getListaImoveis() {
        String sql = "SELECT * FROM imovel";
        linhaImovel = new ArrayList<Imovel>();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                imovel = new Imovel();

                imovel.setId(resultSet.getInt("codigoImovel"));
                imovel.setData_cadastro(resultSet.getDate("tipo"));
                imovel.setCategoria(resultSet.getString("dataCadastro"));
                imovel.setTipo_imovel(resultSet.getString("valorAluguel"));
                imovel.setStatus(resultSet.getString("status"));
                imovel.setLogradouro(resultSet.getString("logradouro"));
                imovel.setComplemento(resultSet.getString("complemento"));
                imovel.setCidade(resultSet.getString("cidade"));
                imovel.setEstado(resultSet.getString("estado"));
                imovel.setNum_quartos(resultSet.getString("categoria"));
                imovel.setGaragem(resultSet.getString("numQuartos"));
                imovel.setValor_aluguel(resultSet.getString("garagem"));
                imovel.setCep(resultSet.getString("cep"));

                linhaImovel.add(imovel);
            }
        } catch (SQLException e) {
            Logger.getLogger(ImplsImovelDAO.class.getName()).log(Level.SEVERE, null, e);
        }

        return linhaImovel;
    }

    public boolean linhaExiste(int id) {
        linhaImovel = new ArrayList<Imovel>();
        sql = "SELECT id FROM alugadm WHERE id = ?";

        try {
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            stmt.setInt(1, id);

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

    @Override
    public void salvarImovel(Imovel imovel) {
        int id = imovel.getId();
        boolean exist = linhaExiste(id);

        if (!exist) {
            String sql = "INSERT INTO imovel (id, data_cadastro, categoria, tipo_imovel, status, logradouro, "
                    + "complemento, cidade, estado, num_quartos, garagem, valor_alguel, cep) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";

            try {
                PreparedStatement stmt = this.connection.prepareStatement(sql);

                stmt.setInt(1, imovel.getId());
                stmt.setDate(2, imovel.getData_cadastro());
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
                stmt.setInt(1, imovel.getId());
                stmt.setDate(2, imovel.getData_cadastro());
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

    @Override
    public void excluirImovel(int id) {

    }

    @Override
    public void editarImovel(Imovel imovel) {
        String sql = "UPDATE alugadm SET id=?, data_cadastro=?, categoria=?, tipo_imovel=?, status=?, logradouro=?, "
                + "complemento=?, cidade=?, estado=?, num_quartos=?, garagem=?, valor_alguel=?, cep=?";

        try {
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            stmt.setInt(1, imovel.getId());
            stmt.setDate(2, imovel.getData_cadastro());
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

    @Override
    public ArrayList<String> getListaCodigoImoveis() {
        String sql = "SELECT * FROM imovel";
        linhaCodigo = new ArrayList<String>();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                imovel = new Imovel();
                int id = imovel.getId();
                String codigo = String.valueOf(id);
                linhaCodigo.add(codigo);
            }
        } catch (SQLException e) {
            Logger.getLogger(ImplsImovelDAO.class.getName()).log(Level.SEVERE, null, e);
        }

        return linhaCodigo;
    }
}
