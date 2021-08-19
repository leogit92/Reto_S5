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

public class VistaReq3 extends JFrame {

    public static final Controlador controlador = new Controlador();
    private static String titlesReq3[];
    private static String dataReq3[][];

    public VistaReq3(){
        //Titulo de la ventana
        this.setTitle("Tabla Requrimento 3");
        //Ubicación y tamaño
        this.setBounds(0, 0, 500, 300);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        setLayout(new BorderLayout());
        vista_requerimiento_3();
        JTable tablaReq3 = new JTable(dataReq3, titlesReq3);
        tablaReq3.setRowSelectionAllowed(true);
        tablaReq3.setColumnSelectionAllowed(true);
        tablaReq3.setSelectionForeground(Color.white);
        tablaReq3.setSelectionBackground(Color.red);
        add(new JScrollPane(tablaReq3), BorderLayout.CENTER);
    }

    public static void vista_requerimiento_3() {
        try {

            titlesReq3 = new String[2];
            titlesReq3[0] = "Cantidad_Casas";
            titlesReq3[1] = "Constructora";

            dataReq3 = new String[10][2];
            ArrayList<Proyecto> proyectos;
            proyectos = controlador.Solucionar_requerimiento_3();
            for (int iY = 0; iY < proyectos.size(); iY++){
                dataReq3[iY][0] = ""+proyectos.get(iY).getNum_casas();
                dataReq3[iY][1] = proyectos.get(iY).getNombre_constructora();
            }

        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }

}
