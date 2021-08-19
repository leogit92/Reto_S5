package view;

import view.VistaReq1;
import view.VistaReq2;
import view.VistaReq3;
import view.VistaReq4;
import view.VistaReq5;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.*;
import java.awt.event.*;

public class Vista extends JFrame {

    //Label -> Mostrar texto
    private JLabel lblSolicitud1;
    private JLabel lblSolicitud2;
    private JLabel lblSolicitud3;
    private JLabel lblSolicitud4;
    private JLabel lblSolicitud5;
    private JLabel lblEnunciado;
    private JLabel lblEnunciado2;

    //Botones
    private JButton btnSolicitud1;
    private JButton btnSolicitud2;
    private JButton btnSolicitud3;
    private JButton btnSolicitud4;
    private JButton btnSolicitud5;

    public Vista(){
        //Titulo de la ventana
        this.setTitle("GUI de ProyectosConstrucción");
        //Ubicación y tamaño
        this.setBounds(0, 0, 450, 250);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        //Construir objeto layout
        GridLayout gLayout = new GridLayout(5, 2, 5, 5);
        //Contenedor de elementos
        Container objContainer = new Container();
        //Indicar el layout al objContainer
        objContainer.setLayout(gLayout);

        BorderLayout bLayout = new BorderLayout(5, 5);
        Container contentPane = this.getContentPane();
        contentPane.setLayout(bLayout);

        //inicializar los elementos gráficos y añadirlos al esquema

        this.lblSolicitud1 = new JLabel("Requerimiento 1: ");
        objContainer.add(this.lblSolicitud1);

        this.btnSolicitud1 = new JButton("Ver tabla");
        objContainer.add(this.btnSolicitud1);

        this.lblSolicitud2 = new JLabel("Requerimiento 2: ");
        objContainer.add(this.lblSolicitud2);

        this.btnSolicitud2 = new JButton("Ver tabla");
        objContainer.add(this.btnSolicitud2);

        this.lblSolicitud3 = new JLabel("Requerimiento 3: ");
        objContainer.add(this.lblSolicitud3);

        this.btnSolicitud3 = new JButton("Ver tabla");
        objContainer.add(this.btnSolicitud3);

        this.lblSolicitud4 = new JLabel("Requerimiento 4: ");
        objContainer.add(this.lblSolicitud4);

        this.btnSolicitud4 = new JButton("Ver tabla");
        objContainer.add(this.btnSolicitud4);

        this.lblSolicitud5 = new JLabel("Requerimiento 5: ");
        objContainer.add(this.lblSolicitud5);

        this.btnSolicitud5 = new JButton("Ver tabla");
        objContainer.add(this.btnSolicitud5);

        GridLayout northGridLayout = new GridLayout(2, 1, 5, 5);
        Container northContainer = new Container();
        northContainer.setLayout(northGridLayout);

        this.lblEnunciado = new JLabel("Este es el programa para ver las consultas de la base de datos ProyectosConstrucción");
        northContainer.add(this.lblEnunciado);

        this.lblEnunciado2 = new JLabel("En frente de cada requerimiento está el botón correspondiente para ver la tabla");
        northContainer.add(this.lblEnunciado2);

        //Manejador de eventos
        this.btnSolicitud1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                VistaReq1 objVistaFormulario1 = new VistaReq1();
                objVistaFormulario1.setVisible(true);
            }
        });

        this.btnSolicitud2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                VistaReq2 objVistaFormulario2 = new VistaReq2();
                objVistaFormulario2.setVisible(true);
            }
        });

        this.btnSolicitud3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                VistaReq3 objVistaFormulario3 = new VistaReq3();
                objVistaFormulario3.setVisible(true);
            }
        });

        this.btnSolicitud4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                VistaReq4 objVistaFormulario4 = new VistaReq4();
                objVistaFormulario4.setVisible(true);
            }
        });

        this.btnSolicitud5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                VistaReq5 objVistaFormulario5 = new VistaReq5();
                objVistaFormulario5.setVisible(true);
            }
        });

        this.add(objContainer, BorderLayout.CENTER);
        this.add(northContainer, BorderLayout.NORTH);

    }
    
    
}
