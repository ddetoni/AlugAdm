import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe responsável para realizar a abertura de conexão com o Postgresql
 */

public class Conexao {

	private String url;
	private String user;
	private String password;
	private String host;
	private String port;
	private String database;
	private String driver;
	private Connection conexao;

	public Conexao() {

		setUser(user);
		setPassword(password);
		setPort(port);
		setDatabase(database);
		setDriver("org.postgresql.Driver");
	}

	public void connect() {

		try {
			Class.forName(getDriver());
			setUrl("jdbc:postgresql://" + getHost() + ":" + getPort() + "/" + getDatabase());
			setConexao(DriverManager.getConnection(getUrl(), getUser(), getPassword()));
			Statement statement = getConexao().createStatement();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void disconnect() {

		try {

			getConexao().close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public Connection getConexao() {
		return conexao;
	}

	public void setConexao(Connection conexao) {
		this.conexao = conexao;
	}
}
