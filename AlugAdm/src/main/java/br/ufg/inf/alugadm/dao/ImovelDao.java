/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.alugadm.dao;

import br.ufg.inf.alugadm.model.Imovel;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author JuliannyAS
 */
public interface ImovelDao {

    public ArrayList<Imovel> getListaImoveis() throws SQLException;
    
    public void salvarImovel(Imovel imovel);

    public void excluirImovel(int id);

    public void editarImovel(Imovel imovel);
    
    public ArrayList<String> getListaCodigoImoveis();
}
