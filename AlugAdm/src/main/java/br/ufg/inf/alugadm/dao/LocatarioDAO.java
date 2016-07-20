package br.ufg.inf.alugadm.dao;

import br.ufg.inf.alugadm.model.Locatario;
import java.util.ArrayList;

/**
 *
 * @author gustavosotnas
 */
public interface LocatarioDAO {

    public void salvarLocatario(Locatario locatario);
    
    public void editarLocatario(Locatario locatario);
    
    public ArrayList<Locatario> getListaLocatarios();

    public ArrayList<String> getListaCodigoLocatarios();
    
    public void excluirLocatario(int id);
}
