package view;

import java.sql.SQLException;
import java.util.ArrayList;

import controller.Controlador;
import model.vo.Lider;
import model.vo.Proyecto;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.*;

public class VistaReq5 extends JFrame{
    
    public static final Controlador controlador = new Controlador();
    private static String titlesReq5[];
    private static String dataReq5[][];

    public VistaReq5(){
        //Titulo de la ventana
        this.setTitle("Tabla Requrimento 5");
        //Ubicación y tamaño
        this.setBounds(0, 0, 500, 300);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        setLayout(new BorderLayout());
        vista_requerimiento_5();
        JTable tablaReq5 = new JTable(dataReq5, titlesReq5);
        tablaReq5.setRowSelectionAllowed(true);
        tablaReq5.setColumnSelectionAllowed(true);
        tablaReq5.setSelectionForeground(Color.white);
        tablaReq5.setSelectionBackground(Color.red);
        add(new JScrollPane(tablaReq5), BorderLayout.CENTER);
    }

    public static void vista_requerimiento_5() {
        try {

            titlesReq5 = new String[2];
            titlesReq5[0] = "Cantidad_Casas";
            titlesReq5[1] = "Constructora";

            dataReq5 = new String[10][2];
            ArrayList<Proyecto> proyectos;
            proyectos = controlador.Solucionar_requerimiento_5();
            for (int iY = 0; iY < proyectos.size(); iY++){
                dataReq5[iY][0] = ""+proyectos.get(iY).getNum_casas();
                dataReq5[iY][1] = proyectos.get(iY).getNombre_constructora();
            }

        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }

}
