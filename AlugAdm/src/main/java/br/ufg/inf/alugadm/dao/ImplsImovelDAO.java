package br.ufg.inf.alugadm.dao;

import java.sql.Connection;
import java.sql.SQLException;
import br.ufg.inf.alugadm.model.Imovel;
import br.ufg.inf.alugadm.persistence.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ImplsImovelDAO implements ImovelDao {

    private final Connection connection;

    public ImplsImovelDAO() throws SQLException {
        this.connection = ConnectionFactory.getConnection();
    }

    @Override
    public ArrayList<Imovel> getListaImoveis() {
        String sql = "SELECT codigoImovel, tipo, dataCadastro, valorAlguel, status, logradouro, complemento, cidade, estado, categoria, numQuartos, garagem, cep FROM Imovel";
        ArrayList<Imovel> listaImovel = new ArrayList<Imovel>();
        try {
            Statement statement = connection.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            Imovel imovel = new Imovel();
            imovel.setCode(resultSet.getInt("codigoImovel"));
            imovel.setTipo(resultSet.getString("tipo"));
            imovel.setData(resultSet.getString("dataCadastro"));
            imovel.setValor(resultSet.getFloat("valorAluguel"));
            imovel.setStatus(resultSet.getString("status"));
            imovel.setLogradouro(resultSet.getString("logradouro"));
            imovel.setComplemento(resultSet.getString("complemento"));
            imovel.setCidade(resultSet.getString("cidade"));
            imovel.setEstado(resultSet.getString("estado"));
            imovel.setCategoria(resultSet.getString("categoria"));
            imovel.setNumQuartos(resultSet.getInt("numQuartos"));
            imovel.setGaragem(resultSet.getBoolean("garagem"));
            imovel.setCep(resultSet.getString("cep"));

            listaImovel.add(imovel);
        } catch (SQLException e) {

        } finally {
            getConnection().close();
        }
        return listaImovel;
    }

    @Override
    public void salvarImovel(Imovel imovel) {
        String sql = "INSERT INTO postgres (codigoImovel, tipo, dataCadastro, valorAluguel, status, logadouro,"
                + " complemento, cidade, estado, categoria, numQuartos, garagem, cep) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?) RETURNING codigoImovel";
        int id = -1;
        try {
            PreparedStatement stmt = this.connection.prepareStatement(sql);

            stmt.setInt(1, imovel.getCodigoImovel());
            stmt.setString(2, imovel.getTipo());
            stmt.setDate(3, imovel.getDataCadastro());
            stmt.setFloat(4, imovel.getValorAlguel());
            stmt.setString(5, imovel.getStatus());
            stmt.setString(6, imovel.getLogradouro());
            stmt.setString(7, imovel.getComplemento());
            stmt.setString(8, imovel.getCidade());
            stmt.setString(9, imovel.getEstado());
            stmt.setString(10, imovel.getCategoria());
            stmt.setInt(11, imovel.getNumQuartos());
            stmt.setString(12, imovel.getGaragem());
            stmt.setString(13, imovel.getCep());

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                id = rs.getInt(id);
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    @Override
    public void excluirImovel(int id) {

    }

    @Override
    public void editarImovel(Imovel imovel) {
        String sql = "UPDATE imovel SET codigoImovel = ?, tipo = ?, dataCadastro = ?, valorAluguel = ?, status = ?, "
                + "logadouro = ?, complemento = ?, cidade = ?, estado = ?, categoria = ?, numQuartos = ?, "
                + "garagem = ?, cep = ? WHERE codigoImovel = ?";

        try {
            PreparedStatement stmt = this.connection.prepareStatement(sql);

            stmt.setInt(1, imovel.getCodigoImovel());
            stmt.setString(2, imovel.getTipo());
            stmt.setDate(3, imovel.getDataCadastro());
            stmt.setFloat(4, imovel.getValorAlguel());
            stmt.setString(5, imovel.getStatus());
            stmt.setString(6, imovel.getLogradouro());
            stmt.setString(7, imovel.getComplemento());
            stmt.setString(8, imovel.getCidade());
            stmt.setString(9, imovel.getEstado());
            stmt.setString(10, imovel.getCategoria());
            stmt.setInt(11, imovel.getNumQuartos());
            stmt.setString(12, imovel.getGaragem());
            stmt.setString(13, imovel.getCep());

            stmt.execute();

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    @Override
    public ArrayList<String> getListaCodigoImoveis() {
        
    }
}
