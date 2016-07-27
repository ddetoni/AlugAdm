package br.ufg.inf.alugadm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.ufg.inf.alugadm.model.Locatario;
import br.ufg.inf.alugadm.persistence.ConnectionFactory;

public class ImplsLocatarioDAO implements LocatarioDAO {

	private Connection connection;

	public ImplsLocatarioDAO() {

		this.connection = new ConnectionFactory().getConnection();
	}

	@Override
	public void inserir(Locatario locatario) throws SQLException {

		String sql = "insert into locatario "
				+ "(nome,cpf,identidade,orgao,sexo,data_nasc,tipo_pessoa,email,telefone,tipo_recebimento,data_cadastro,id)"
				+ "values (?,?,?,?,?,?,?,?,?,?,?,?)";

		try {

			PreparedStatement stmt = getConnection().prepareStatement(sql);

			stmt.setString(1, locatario.getNome());
			stmt.setString(2, locatario.getCpf());
			stmt.setString(3, locatario.getIdentidade());
			stmt.setString(4, locatario.getOrgao());
			stmt.setString(5, locatario.getSexo());
			stmt.setString(6, locatario.getDataNascimento());
			stmt.setString(7, locatario.getTipoPessoa());
			stmt.setString(8, locatario.getEmail());
			stmt.setString(9, locatario.getTelefone());
			stmt.setString(10, locatario.getTipoRecebimento());
			stmt.setString(11, locatario.getDataCadastro());
			stmt.setString(12, locatario.getId());

			stmt.executeUpdate();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException();
		} finally {
			getConnection().close();
		}

	}

	public Connection getConnection() {
		return connection;
	}

}
