package br.com.sistemaos.dal;

import java.sql.*;

/**
 * Conexão com o banco de dados
 *
 * @author Lucas Benfatti
 */
public class ModuloConexao {

    /**
     * Método responsável por estabelecer a conexão com o BD
     *
     * @return conexao
     */
    public static Connection conector() {
        Connection conexao = null;

        //comando para chamar o driver do mysqlconnector.jar
        String driver = "com.mysql.cj.jdbc.Driver";

        //armazenando informações referente ao BD
        String url = "jdbc:mysql://localhost:3306/dbsistemaordemservico?characterEncoding=utf-8";
        String user = "dba";
        String password = "xxxxxx";

        //estabelece a conexão com o BD
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            //System.out.println(e);
            return null;
        }
    }

}
