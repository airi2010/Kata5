/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ggaaa.persistence;

import ggaaa.Model.Person;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Airam
 */
public class SqlitePeopleLoader {
    
    public static List<Person> load() throws ClassNotFoundException, SQLException {
        List<Person> list=new ArrayList<>();
        Class.forName("org.sqlite.JDBC");
       Connection conection=DriverManager.getConnection("jdbc:sqlite:data/people2.db");
       try(Statement state=conection.createStatement()){
       ResultSet set=state.executeQuery("SELECT * FROM people");
        while(set.next()){
           list.add(new Person(set.getString("first_name"),set.getString("address"),set.getString("email")));
        }
       };
       return list;
    }
    
}
