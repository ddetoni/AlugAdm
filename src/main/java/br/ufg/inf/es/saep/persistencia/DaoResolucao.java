package br.ufg.inf.es.saep.persistencia;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import br.ufg.inf.es.saep.dominio.Resolucao;
import br.ufg.inf.es.saep.dominio.Tipo;
import br.ufg.inf.es.saep.persistencia.conversores.Conversor;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import java.util.List;
import java.util.Map;

/**
 *
 * @author JuliannyAS
 */
public class DaoResolucao{

    Gson gson = new Gson();
    String databaseName = "test";
    MongoClient mongo = new MongoClient();
    MongoDatabase db = mongo.getDatabase(databaseName);
    
    /**
     *
     * @param idResolucao
     * @return
     */
    public Resolucao mostrarPorId(String idResolucao) {
        
        
        DBObject dbResolucao;
        dbResolucao = mongo.findOne(new Conversor().converterStringToMap(idResolucao), getDbResolucaoCollection());
        Resolucao resolucao = new Conversor().converterDBObjectToResolucao(dbResolucao);
        return resolucao;
    }

    public boolean salvarResolucao(Resolucao resolucao) {

        Map<String, Object> mapResolucao = new Conversor().converterResolucaoToMap(resolucao);
        save(mapResolucao, getDbCollectionResolucao());

        if (mapResolucao != null) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean removerResolucao(String idResolucao) {

    }

    public List<String> mostrarTodosPorId() {

        List<DBObject> listTemp = findAll(getDbCollectionResolucao());
        List<String> list = 
        
        return list;
    }

    public void salvarTipo(Tipo tipo) {

    }

    public void removerTipo(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Tipo mostrarTipoPorId(String id) {
        String json = findOne(id);
        Tipo tipo = gson.fromJson(json, Tipo.class);
        return tipo;
    }

    public List<Tipo> mostrarTiposPorNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public DBCollection getDbCollectionResolucao() {
        DBCollection dbCollection = MongoConnection.getInstance().getDB().getCollection(Resolucao.class.getSimpleName());
        return dbCollection;

    }
    
     public DBCollection getDbCollectionTipo() {
        DBCollection dbCollection = MongoConnection.getInstance().getDB().getCollection(Tipo.class.getSimpleName());
        return dbCollection;

    }

}
