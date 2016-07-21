package br.ufg.inf.alugadm.dao;

import java.sql.SQLException;

import br.ufg.inf.alugadm.model.Locatario;
import java.util.ArrayList;

public interface LocatarioDAO {

	public void inserir(Locatario locatario) throws SQLException;
	
	public void editar(Locatario locatario);
        
        public ArrayList<Locatario> getListaLocatarios() throws SQLException;

        public ArrayList<String> getListaCodigoLocatarios() throws SQLException;

        public void excluirLocatario(int id);
}
