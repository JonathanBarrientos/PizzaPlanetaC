package com.ulima.sw.pizzaplanetac.dao;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.ulima.sw.pizzaplanetac.beans.Ingrediente;


public class LoginDAO {

    public Integer login(String usuario, String password) {
        ConexionMLab con = new ConexionMLab();
        MongoClient mongo = con.getConexion();
        int variable = 0;
        try {
            DB db = mongo.getDB("basededatos");
            DBCollection coleccion = db.getCollection("cliente");
            
            BasicDBObject subquery = new BasicDBObject();

            subquery.put("Usuario.usu", usuario);
            subquery.put("Usuario.pass", password);

            
            DBCursor cursor = coleccion.find(subquery);
            if (cursor.hasNext()) {
                variable = 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            mongo.close();
        }
        return variable;

    }
}