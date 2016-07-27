package br.ufg.inf.alugadm.dao;

import java.sql.SQLException;

import br.ufg.inf.alugadm.model.Locatario;

public interface LocatarioDAO {

	public void inserir(Locatario locatario) throws SQLException;
	
	public void editar(Locatario locatario) throws SQLException;
}
