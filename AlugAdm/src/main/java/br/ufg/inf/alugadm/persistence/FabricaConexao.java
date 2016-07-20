/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.alugadm.persistence;

/**
 *
 * @author JuliannyAS
 */
public class FabricaConexao {
    
    private Connection connection = null;
    
    public Connection getConnection() throws SQLException{
        if(connection == null){
            try{  
                Class.forName("org.postgresql.Driver");
               
               String usuario = "postgres";
               String senha = "suaSenha";
               
               String url_local = "jdbc:postgresql://localhost:5432/alugadm";
               
               connection = DriverManager.getConnection(url_local, usuario, senha);
            }catch(ClassNotFoundException e){
        
                
            }
        }
        return connection;
    }
}
