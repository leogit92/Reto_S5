package model.dao;

//Estructura de datos
import java.util.ArrayList;

//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Clase para conexión
import util.JDBCUtilities;

//Encapsulamiento de los datos
import model.vo.Lider;

public class LiderDao {

    public ArrayList<Lider> query_requerimiento_4() throws SQLException {
        ArrayList<Lider> arrayLideres;
        arrayLideres = new ArrayList<Lider>();
        if (!JDBCUtilities.estaVacia()) {
            String query = "SELECT L.Nombre, L.Primer_Apellido ";
            query += "FROM Proyecto P ";
            query += "INNER JOIN Lider L ON L.ID_lider = P.ID_Lider ";
            query += "WHERE P.Clasificacion = 'Casa'";
            Connection conn = JDBCUtilities.getConnection();
            PreparedStatement pStatement = conn.prepareStatement(query);
            ResultSet resultado = pStatement.executeQuery();
            while(resultado.next()){
                Lider objLider = new Lider(resultado.getString("Nombre"), resultado.getString("Primer_Apellido"));
                objLider.setNombre(resultado.getString("Nombre"));
                objLider.setApellido(resultado.getString("Primer_Apellido"));
                arrayLideres.add(objLider);
            }
            conn.close();
            pStatement.close();
        }else{
            System.out.println("¡No hay archivo de base de datos!");
        }
        return arrayLideres;
        
        
        /*
        Connection conexion = JDBCUtilities.getConnection();
        // Crea arreglo para almacenar objetos tipo Proyecto
        ArrayList<Lider> lideres = new ArrayList<Lider>();
        // Consultas

        return lideres;
        */
    }// Fin del método query_requerimiento_4

}