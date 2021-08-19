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

public class VistaReq4 extends JFrame{

    public static final Controlador controlador = new Controlador();
    private static String titlesReq4[];
    private static String dataReq4[][];

    public VistaReq4(){
        //Titulo de la ventana
        this.setTitle("Tabla Requrimento 4");
        //Ubicación y tamaño
        this.setBounds(0, 0, 500, 300);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        setLayout(new BorderLayout());
        vista_requerimiento_4();
        JTable tablaReq4 = new JTable(dataReq4, titlesReq4);
        tablaReq4.setRowSelectionAllowed(true);
        tablaReq4.setColumnSelectionAllowed(true);
        tablaReq4.setSelectionForeground(Color.white);
        tablaReq4.setSelectionBackground(Color.red);
        add(new JScrollPane(tablaReq4), BorderLayout.CENTER);
    }

    public static void vista_requerimiento_4() {
        try {

            titlesReq4 = new String[2];
            titlesReq4[0] = "Nombre_Lider";
            titlesReq4[1] = "Apellido_Lider";

            dataReq4 = new String[100][2];
            ArrayList<Lider> lideres;
            lideres = controlador.Solucionar_requerimiento_4();
            for (int iY = 0; iY < lideres.size(); iY++){
                dataReq4[iY][0] = lideres.get(iY).getNombre();
                dataReq4[iY][1] = lideres.get(iY).getApellido();
            }

        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }
}
