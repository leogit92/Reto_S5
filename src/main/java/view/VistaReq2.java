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

public class VistaReq2 extends JFrame {

    public static final Controlador controlador = new Controlador();
    private static String titlesReq2[];
    private static String dataReq2[][];

    public VistaReq2(){
        //Titulo de la ventana
        this.setTitle("Tabla Requrimento 2");
        //Ubicación y tamaño
        this.setBounds(0, 0, 500, 300);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        setLayout(new BorderLayout());
        vista_requerimiento_2();
        JTable tablaReq2 = new JTable(dataReq2, titlesReq2);
        tablaReq2.setRowSelectionAllowed(true);
        tablaReq2.setColumnSelectionAllowed(true);
        tablaReq2.setSelectionForeground(Color.white);
        tablaReq2.setSelectionBackground(Color.red);
        add(new JScrollPane(tablaReq2), BorderLayout.CENTER);
    
    }

    public static void vista_requerimiento_2() {
        try {

            titlesReq2 = new String[5];
            titlesReq2[0] = "Numero_Habitaciones";
            titlesReq2[1] = "Numero_banos";
            titlesReq2[2] = "Nombre_Lider";
            titlesReq2[3] = "Apellido_Lider";
            titlesReq2[4] = "Estrato_Proyecto";

            dataReq2 = new String[100][5];
            ArrayList<Proyecto> proyectos;
            proyectos = controlador.Solucionar_requerimiento_2();
            for (int iY = 0; iY < proyectos.size(); iY++){
                dataReq2[iY][0] = ""+proyectos.get(iY).getNum_habitaciones();
                dataReq2[iY][1] = ""+proyectos.get(iY).getNum_banios();
                dataReq2[iY][2] = proyectos.get(iY).getNombreLider();
                dataReq2[iY][3] = proyectos.get(iY).getApellidoLider();
                dataReq2[iY][4] = ""+proyectos.get(iY).getEstrato_proyecto();
            }

        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }
}
