package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Locatario;
import persistence.ConnectionFactory;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ImplsLocatarioDAO implements LocatarioDAO {

	private Connection connection;
        private ArrayList<Locatario> linhaLocatario;
        private Locatario locatario;
        private String sql;
        private ArrayList<String> linhaCodigo;

	public ImplsLocatarioDAO() throws SQLException {

		this.connection = ConnectionFactory.getConnection();
	}

	@Override
	public void inserir(Locatario locatario) throws SQLException {

		String sql = "insert into locatario "
				+ "(nome,cpf,identidade,orgao,sexo,dataNascimento,tipo_pessoa,email,telefone,tipo_recebimento,data_cadastro,id)"
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

	@Override
	public void editar(Locatario locatario){

		String sql = "update locatario set "
				+ "nome = ?,cpf = ?,identidade = ?,orgao = ?,sexo = ?,dataNascimento = ?,tipo_pessoa = ?,email = ?,telefone = ?,tipo_recebimento = ?,data_cadastro = ?,id = ? "
				+ "where id = ?";
               
		
		try {

			PreparedStatement stmt = this.connection.prepareStatement(sql);

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
			stmt.setString(13, locatario.getId());

			stmt.executeUpdate();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException();
		} finally {
                    try {
                        this.connection.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(ImplsLocatarioDAO.class.getName()).log(Level.SEVERE, null, ex);
                    }
		}
	}

	public Connection getConnection() {
		return connection;
	}

        @Override
        public ArrayList<Locatario> getListaLocatarios() throws SQLException{
                linhaLocatario = new ArrayList<Locatario>();
        sql = "SELECT * FROM locatario";

        PreparedStatement stmt = this.connection.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            locatario = new Locatario();
            
            locatario.setNome(rs.getString("nome"));
            locatario.setCpf(rs.getString("cpf"));
            locatario.setIdentidade(rs.getString("identidade"));
            locatario.setOrgao(rs.getString("orgao"));
            locatario.setSexo(rs.getString("sexo"));
            locatario.setDataNascimento(rs.getString("dataNascimento"));
            locatario.setTipoPessoa(rs.getString("tipoPessoa"));
            locatario.setEmail(rs.getString("email"));
            locatario.setTelefone(rs.getString("telefone"));
            locatario.setTipoRecebimento(rs.getString("tipoRecebimento"));
            locatario.setDataCadastro(rs.getString("dataCadastro"));
            locatario.setId(rs.getString("id"));
            
            linhaLocatario.add(locatario);
        }

        return linhaLocatario;    
        }

        @Override
        public ArrayList<String> getListaCodigoLocatarios() {
          String sql = "SELECT * FROM locatario";
        linhaCodigo = new ArrayList<String>();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                locatario = new Locatario();
                String id = locatario.getId();
                linhaCodigo.add(id);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ImplsLocatarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return linhaCodigo;  
        }

        @Override
        public void excluirLocatario(int id) {
            
        }

}
