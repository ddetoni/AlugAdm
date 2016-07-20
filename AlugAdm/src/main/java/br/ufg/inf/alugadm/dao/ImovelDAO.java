package br.ufg.inf.alugadm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.ufg.inf.alugadm.model.Imovel;
import br.ufg.inf.alugadm.persistence.FabricaConexao;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ImovelDAO {
        
	private Connection connection;

	public ImovelDAO() throws SQLException {
		FabricaConexao conexao = new FabricaConexao();
		this.connection = conexao.getConnection();
	}

	public void register(Imovel imovel) throws SQLException {

		String sql = "INSERT INTO Imovel (codigoImovel, tipo, dataCadastro, valorAlguel, status, logradouro, complemento, cidade, estado, categoria, numQuartos, garagem, cep) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {

			PreparedStatement statement = getConnection().prepareStatement(sql);

			statement.setInt(1, imovel.getCode());
			statement.setString(2, imovel.getTipo());
			statement.setString(3, imovel.getData());
			statement.setFloat(4, imovel.getValor());
			statement.setString(5, imovel.getStatus());
			statement.setString(6, imovel.getLogradouro());
			statement.setString(7, imovel.getComplemento());
			statement.setString(8, imovel.getCidade());
			statement.setString(9, imovel.getEstado());
			statement.setString(10, imovel.getCategoria());
			statement.setInt(11, imovel.getNumQuartos());
			statement.setBoolean(12, imovel.isGaragem());
			statement.setString(13, imovel.getCep());

			statement.execute();
			statement.close();

		} catch (SQLException e){
			e.printStackTrace();
		} finally {
			getConnection().close();
		}

	}
	
	public ArrayList<Imovel> getListaImoveis() throws SQLException{
		String sql = "SELECT codigoImovel, tipo, dataCadastro, valorAlguel, status, logradouro, complemento, cidade, estado, categoria, numQuartos, garagem, cep FROM Imovel";
                ArrayList<Imovel> listaImovel = new ArrayList<Imovel>();
                try{
                	Statement statement = getConnection().createStatement();
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

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

}
