package model.dao;

//Estructura de datos
import java.util.ArrayList;

import model.vo.Lider;
import model.vo.Proyecto;

//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Clase para conexión
import util.JDBCUtilities;

public class ProyectoDao {

    public ArrayList<Proyecto> query_requerimiento_1() throws SQLException {
        ArrayList<Proyecto> arrayProyecto;
        arrayProyecto = new ArrayList<Proyecto>();
        if (!JDBCUtilities.estaVacia()) {
            String query = "SELECT Constructora, Serial ";
            query += "FROM Proyecto ";
            query += "WHERE Clasificacion = 'Casa'";
            Connection conn = JDBCUtilities.getConnection();
            PreparedStatement pStatement = conn.prepareStatement(query);
            ResultSet resultado = pStatement.executeQuery();
            while(resultado.next()){
                Proyecto objProyecto = new Proyecto();
                objProyecto.setNombre_constructora( resultado.getString("Constructora"));
                objProyecto.setSerial(resultado.getString("Serial"));
                arrayProyecto.add(objProyecto);
            }   
            //Cerrar conexión
            conn.close();
            pStatement.close();
        }else{
            System.out.println("¡No hay archivo de base de datos!");
        }
        
        return arrayProyecto;
        
    }

    public ArrayList<Proyecto> query_requerimiento_2() throws SQLException {
        ArrayList<Proyecto> arrayProyecto;
        arrayProyecto = new ArrayList<Proyecto>();
        if (!JDBCUtilities.estaVacia()) {
            String query = "SELECT P.Numero_Habitaciones, P.Numero_Banos, L.Nombre, L.Primer_Apellido, T.Estrato ";
            query += "FROM Proyecto P ";
            query += "INNER JOIN Lider L ON L.ID_lider = P.ID_Lider ";
            query += "INNER JOIN Tipo T ON T.ID_Tipo = P.ID_Tipo ";
            query += "WHERE P.Clasificacion = 'Casa'";
            Connection conn = JDBCUtilities.getConnection();
            PreparedStatement pStatement = conn.prepareStatement(query);
            ResultSet resultado = pStatement.executeQuery();
            while(resultado.next()){
                Proyecto objProyecto = new Proyecto();
                objProyecto.setNum_habitaciones( resultado.getInt("Numero_Habitaciones"));
                objProyecto.setNum_banios(resultado.getInt("Numero_Banos"));
                objProyecto.setEstrato_proyecto( resultado.getInt("Estrato"));
                objProyecto.setLider(resultado.getString("Nombre"), resultado.getString("Primer_Apellido"));
                arrayProyecto.add(objProyecto);
            }
            conn.close();
            pStatement.close();
        }else{
            System.out.println("¡No hay archivo de base de datos!");
        }
        return arrayProyecto;
    }// Fin del método query_requerimiento_2


    public ArrayList<Proyecto> query_requerimiento_3() throws SQLException {
        ArrayList<Proyecto> arrayProyecto;
        arrayProyecto = new ArrayList<Proyecto>();
        if (!JDBCUtilities.estaVacia()) {
            String query = "SELECT count(Constructora) as Casas, Constructora ";
            query += "FROM Proyecto ";
            query += "WHERE Clasificacion = 'Casa' ";
            query += "GROUP BY Constructora";
            Connection conn = JDBCUtilities.getConnection();
            PreparedStatement pStatement = conn.prepareStatement(query);
            ResultSet resultado = pStatement.executeQuery();
            while(resultado.next()){
                Proyecto objProyecto = new Proyecto();
                objProyecto.setNum_casas( resultado.getInt("Casas"));
                objProyecto.setNombre_constructora(resultado.getString("Constructora"));
                arrayProyecto.add(objProyecto);
            }
            conn.close();
            pStatement.close();
        }else{
            System.out.println("¡No hay archivo de base de datos!");
        }
        return arrayProyecto;
    }// Fin del método query_requerimiento_3


    public ArrayList<Proyecto> query_requerimiento_5() throws SQLException{
        ArrayList<Proyecto> arrayProyecto;
        arrayProyecto = new ArrayList<Proyecto>();
        if (!JDBCUtilities.estaVacia()) {
            String query = "SELECT count(Constructora) as Casas, Constructora ";
            query += "FROM Proyecto ";
            query += "WHERE Clasificacion = 'Casa' ";
            query += "GROUP BY Constructora ";
            query += "HAVING Casas >= 18 ";
            query += "ORDER BY Casas ASC";
            Connection conn = JDBCUtilities.getConnection();
            PreparedStatement pStatement = conn.prepareStatement(query);
            ResultSet resultado = pStatement.executeQuery();
            while(resultado.next()){
                Proyecto objProyecto = new Proyecto();
                objProyecto.setNum_casas( resultado.getInt("Casas"));
                objProyecto.setNombre_constructora(resultado.getString("Constructora"));
                arrayProyecto.add(objProyecto);
            }
            conn.close();
            pStatement.close();
        }else{
            System.out.println("¡No hay archivo de base de datos!");
        }
        return arrayProyecto;
    }// Fin del método query_requerimiento_4

}