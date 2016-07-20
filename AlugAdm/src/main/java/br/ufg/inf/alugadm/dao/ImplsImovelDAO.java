package br.ufg.inf.alugadm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.ufg.inf.alugadm.model.Imovel;
import br.ufg.inf.alugadm.persistence.FabricaConexao;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ImplsImovelDAO implements ImovelDao {

	private Connection connection;

	private ImplsImovelDAO() throws SQLException {
		FabricaConexao conexao = new FabricaConexao();
		this.connection = conexao.getConnection();
	}

    @Override
    public ArrayList<Imovel> getImoveis() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Imovel getImovelPorCodigo(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void salvarImovel(Imovel imovel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluirImovel(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editarImovel(Imovel imovel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<String> getListaCodigoImoveis() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        
}
