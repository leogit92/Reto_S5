package view;

import view.Vista;

import java.sql.SQLException;
import java.util.ArrayList;

import controller.Controlador;
import model.vo.Lider;
import model.vo.Proyecto;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.*;

public class VistaReq1 extends JFrame {

    public static final Controlador controlador = new Controlador();
    private static String titlesReq1[];
    private static String dataReq1[][];

    public VistaReq1(){
        //Titulo de la ventana
        this.setTitle("Tabla Requrimento 1");
        //Ubicación y tamaño
        this.setBounds(0, 0, 500, 300);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        setLayout(new BorderLayout());
        vista_requerimiento_1();
        JTable tablaReq1 = new JTable(dataReq1, titlesReq1);
        tablaReq1.setRowSelectionAllowed(true);
        tablaReq1.setColumnSelectionAllowed(true);
        tablaReq1.setSelectionForeground(Color.white);
        tablaReq1.setSelectionBackground(Color.red);
        add(new JScrollPane(tablaReq1), BorderLayout.CENTER);
        
        
    }


    public static void vista_requerimiento_1() {

        try {

            titlesReq1 = new String[2];
            titlesReq1[0] = "Constructora";
            titlesReq1[1] = "Serial";

            dataReq1 = new String[100][2];
            ArrayList<Proyecto> proyectos;
            proyectos = controlador.Solucionar_requerimiento_1();
            for (int iY = 0; iY < proyectos.size(); iY++){
                dataReq1[iY][0] = proyectos.get(iY).getNombre_constructora();
                dataReq1[iY][1] = proyectos.get(iY).getSerial();
            }

        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }

    }

}
