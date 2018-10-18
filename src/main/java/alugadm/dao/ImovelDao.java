package alugadm.dao;

import alugadm.model.Imovel;
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
