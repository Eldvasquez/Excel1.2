
import java.awt.Color;
import java.awt.Desktop;
import javax.swing.JColorChooser;
import java.awt.Font;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import say.swing.JFontChooser;

/* UNIVERSIDAD MARIANO GALVEZ DE GUATEMALA
    PROGRAMACION 3
    BILLY JESHUA SICAN MATIAS 0901-17-16250
    KEVIN OSWALDO LOARCA FUENTES 0901-17-11537
    JAVIER ANTONIO ARGUETA GUERRA 0901-17-1010
    BRIAN HUMBERTO SANTIZO HERRERA 0901-17-1483
    FRANCISCO GREGORIO BERGANZA FRANCO 0901-17-16694

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author BRIAN
 */
public class Excel extends javax.swing.JFrame {
    
    DefaultTableModel md;
    String data[][] = {};
    Font tipoletra;
    CellData[][] clipboard;

    public Excel() {
        md = new DefaultTableModel() ;
        initComponents();
        
        
        //comandos para cambiar el tamaño y propiedades de la columna #filas
        
        TableColumnModel tcm = jTableAZ.getColumnModel();
        tcm.getColumn(0).setResizable(false);
        tcm.getColumn(0).setPreferredWidth(25);
        jTableAZ.getTableHeader().setReorderingAllowed(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAZ = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmuArchivo = new javax.swing.JMenu();
        jmiAbrir = new javax.swing.JMenuItem();
        jmiGuardar = new javax.swing.JMenuItem();
        jmiSalir = new javax.swing.JMenuItem();
        jmuNuevo = new javax.swing.JMenu();
        jmuOpciones = new javax.swing.JMenu();
        jmiCortar = new javax.swing.JMenuItem();
        jmiCopiar = new javax.swing.JMenuItem();
        jmiPegar = new javax.swing.JMenuItem();
        jmiColorLetra = new javax.swing.JMenuItem();
        jmiFuente = new javax.swing.JMenuItem();
        jmiBackground = new javax.swing.JMenuItem();
        jmuAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        jTableAZ.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "", "", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"2", "", "", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"3", "", "", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"4", "", "", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"5", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"6", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"7", null, null, null, "", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"8", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"9", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"10", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"11", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"12", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"13", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"14", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"15", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"16", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"17", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"18", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"19", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"20", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"21", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"22", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"23", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"24", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"25", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"26", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"27", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"28", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"29", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"30", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"31", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
            }
        ));
        jTableAZ.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTableAZ.setCellSelectionEnabled(true);
        jTableAZ.setDropMode(javax.swing.DropMode.ON_OR_INSERT);
        jScrollPane2.setViewportView(jTableAZ);

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));

        jmuArchivo.setBackground(new java.awt.Color(255, 255, 255));
        jmuArchivo.setText("ARCHIVO");

        jmiAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jmiAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-abrir-carpeta-20.png"))); // NOI18N
        jmiAbrir.setText("ABRIR");
        jmiAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAbrirActionPerformed(evt);
            }
        });
        jmuArchivo.add(jmiAbrir);

        jmiGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jmiGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-guardar-20.png"))); // NOI18N
        jmiGuardar.setText("GUARDAR");
        jmiGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiGuardarActionPerformed(evt);
            }
        });
        jmuArchivo.add(jmiGuardar);

        jmiSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-cancelar-20.png"))); // NOI18N
        jmiSalir.setText("SALIR");
        jmiSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSalirActionPerformed(evt);
            }
        });
        jmuArchivo.add(jmiSalir);

        jMenuBar1.add(jmuArchivo);

        jmuNuevo.setBackground(new java.awt.Color(255, 255, 255));
        jmuNuevo.setText("NUEVO ");
        jmuNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jmuNuevoMousePressed(evt);
            }
        });
        jMenuBar1.add(jmuNuevo);

        jmuOpciones.setBackground(new java.awt.Color(255, 255, 255));
        jmuOpciones.setText("OPCIONES");

        jmiCortar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jmiCortar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-cupón-para-recortar-20.png"))); // NOI18N
        jmiCortar.setText("CORTAR");
        jmiCortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCortarActionPerformed(evt);
            }
        });
        jmuOpciones.add(jmiCortar);

        jmiCopiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jmiCopiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-pegar-20.png"))); // NOI18N
        jmiCopiar.setText("COPIAR");
        jmiCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCopiarActionPerformed(evt);
            }
        });
        jmuOpciones.add(jmiCopiar);

        jmiPegar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jmiPegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-pegar-20.png"))); // NOI18N
        jmiPegar.setText("PEGAR");
        jmiPegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPegarActionPerformed(evt);
            }
        });
        jmuOpciones.add(jmiPegar);

        jmiColorLetra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-saturación-20.png"))); // NOI18N
        jmiColorLetra.setText("COLOR DE LETRA");
        jmiColorLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiColorLetraActionPerformed(evt);
            }
        });
        jmuOpciones.add(jmiColorLetra);

        jmiFuente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-tipo-20.png"))); // NOI18N
        jmiFuente.setText("FUENTE");
        jmiFuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFuenteActionPerformed(evt);
            }
        });
        jmuOpciones.add(jmiFuente);

        jmiBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-color-de-relleno-20.png"))); // NOI18N
        jmiBackground.setText("COLOR DE FONDO");
        jmiBackground.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiBackgroundActionPerformed(evt);
            }
        });
        jmuOpciones.add(jmiBackground);

        jMenuBar1.add(jmuOpciones);

        jmuAyuda.setBackground(new java.awt.Color(255, 255, 255));
        jmuAyuda.setText("AYUDA");
        jmuAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jmuAyudaMousePressed(evt);
            }
        });
        jMenuBar1.add(jmuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1281, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiGuardarActionPerformed
        //JAVIER ARGUETA
        
        // boton guardar        
        JFileChooser fc = new JFileChooser();
        fc.showSaveDialog(this);
        String guardar = fc.getSelectedFile().getAbsolutePath();
        
        //se creo el archivo en el que se guardara la tabla
        
        File file = new File(guardar);
        saveTable(file);

    }//GEN-LAST:event_jmiGuardarActionPerformed

    private void jmuAyudaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmuAyudaMousePressed

        if (Desktop.isDesktopSupported()) {
            try {
                //Abre el manual de usuario que esta guardado en src como manual de usuario.pdf
                File path = new File(new File("").getAbsoluteFile() + "/src/Manual de Usuario.PDF");
                Desktop.getDesktop().open(path);
            } catch (IOException ex) {

            }
        }

    }//GEN-LAST:event_jmuAyudaMousePressed

    private void jmiColorLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiColorLetraActionPerformed
        //BRYAN SANTIZO
        //funcion llamada para cambiar el color de la letra
        
        Color c = JColorChooser.showDialog(rootPane, "COLOR", this.getForeground());
        jTableAZ.setForeground(c);

    }//GEN-LAST:event_jmiColorLetraActionPerformed

    private void jmuNuevoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmuNuevoMousePressed
        //funcion para crear una nueva tabla 
        //BILLY SICAN
        //BRIAN SANTIZO
        String Columna = "";                            
        Object[][] filas = new Object[31][27];              //se crea la tabla en una matriz Object
        for (int intconteo = 0; intconteo <= 30; intconteo++) {         //ciclo para llenar la tabla
            Columna = Integer.toString(intconteo + 1);
            filas[intconteo][0] = Columna;
            for (int intcolum = 1; intcolum <= 26; intcolum++) {
                filas[intconteo][intcolum] = null;
            }
        }
        jTableAZ.setModel(new javax.swing.table.DefaultTableModel(filas,        //metodo para añadir cabecera
                new String[]{
                    "", "A", "B", "C", "D", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
                }
        ));
        //codigo para editar la columna de #filas, para que no sea agrandable y de un especifico tamaño
        
        TableColumnModel tcm = jTableAZ.getColumnModel();
        tcm.getColumn(0).setResizable(false);
        tcm.getColumn(0).setPreferredWidth(25);
        jTableAZ.getTableHeader().setReorderingAllowed(false);

    }//GEN-LAST:event_jmuNuevoMousePressed

    private void jmiSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSalirActionPerformed
        //BRYAN SANTIZO
        System.exit(0);
    }//GEN-LAST:event_jmiSalirActionPerformed

    private void jmiAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAbrirActionPerformed
        //JAVIER ARGUETA
        
        // boton para cargar o abrir
        final JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(this);
        String path = fc.getSelectedFile().getAbsolutePath();
        File f = new File(path);

        if (f.isFile()) {
            loadTable(f);
        }
    }//GEN-LAST:event_jmiAbrirActionPerformed

    private void jmiPegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPegarActionPerformed
            //JAVIER ARGUETA
        //KEVIN LOARCA
        // Boton ABRIR
        File file = new File("copiar.txt");
        pegar(file);
    }//GEN-LAST:event_jmiPegarActionPerformed

    private void jmiCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCopiarActionPerformed
        //JAVIER ARGUETA
        //KEVIN LOARCA
        //Boton COPIAR
        File file = new File("copiar.txt");
        copiar(file);
    }//GEN-LAST:event_jmiCopiarActionPerformed

    private void jmiFuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFuenteActionPerformed
        //BILLY SICAN
        //Boton para cambiar tipo de letra
        
        JFontChooser tipodeletra = new JFontChooser();
        int inttl = tipodeletra.showDialog(this);
        if (inttl == JFontChooser.OK_OPTION) {
            tipoletra = tipodeletra.getSelectedFont();
            jTableAZ.setFont(tipoletra);
        }
    }//GEN-LAST:event_jmiFuenteActionPerformed

    private void jmiBackgroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiBackgroundActionPerformed
        //KEVIN LOARCA
        // TODO add your handling code here:
        JColorChooser jcc = new JColorChooser();
        Color c = jcc.showDialog(null, "Seleccione el Color", Color.RED);
        //Cambia el color de las celdas
        jTableAZ.setBackground(c);
    }//GEN-LAST:event_jmiBackgroundActionPerformed

    private void jmiCortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCortarActionPerformed
    //FRANCISCO    
    //Boton CORTAR
        
        File file = new File("copiar.txt");
        copiar(file);                               //primero se copia lo seleccionado
        cortar();                                   //luego se corta lo seleccionado
    }//GEN-LAST:event_jmiCortarActionPerformed

//AQUI VAN TODOS LAS FUNCIONES Y METODOS
    //RESTAURAR       
    
    //FRANCISCO
    private void cortar(){      //funcion cortar
        
        int rows[] = jTableAZ.getSelectedRows();            //Se obtienen LAS CELDAS y COLUMNAS seleccionadas, todo el area
        int colm[] = jTableAZ.getSelectedColumns();
        
        for (int i = 0; i < rows.length; i++){
                for (int j = 0; j < colm.length; j++){
                    jTableAZ.setValueAt("", rows[i], colm[j]);          //se borra/vacian las celdas seleccionadas
                }
           }
        
    }
    //JAVIER ARGUETA
    private void pegar(File file) {
        //funcion pegar
        
        int row = jTableAZ.getSelectedRow();        //Se obtienen la celda y columna seleccionada
        int col = jTableAZ.getSelectedColumn();

        try {
            FileReader fr = new FileReader(file);           //se crea el buffer para leer archivo 
            BufferedReader br = new BufferedReader(fr);

            Object[] lines = br.lines().toArray();                  //se almacenan las lineas en el obeto
            String[] colmsAyd = lines[0].toString().split("\t");    //se dividen las lineas por columnas

            for (int i = 0; i < lines.length; i++) {                    //ciclo para leer del archivo y pegar en la posicion obtenida anteriormente
                String[] colums = lines[i].toString().split("\t");
                for (int j = 0; j < colmsAyd.length; j++) {

                    jTableAZ.setValueAt(colums[j], row + i, col + j);       //se edita la celda con el valor deseado
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Excel.class.getName()).log(Level.SEVERE, null, ex);
        }

        file.delete();
    }
    //JAVIER ARGUETA
    private void copiar(File file) {
        //funcion copiar
        
            int rows[] = jTableAZ.getSelectedRows();                    //Se obtienen LAS CELDAS y COLUMNAS seleccionadas, todo el area
            int colm[] = jTableAZ.getSelectedColumns();
            

        try {

            FileWriter fw = new FileWriter(file);                       //se crea el buffer para leer el archivo
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < rows.length; i++) {                     // ciclo para copiar lo de cada celda individual
                for (int j = 0; j < colm.length; j++) {
                    Object value = jTableAZ.getValueAt(rows[i], colm[j]);       //se obtiene el valor de la celda

                    if (value != null) {
                        bw.write(jTableAZ.getValueAt(rows[i], colm[j]).toString() + "\t");          // se verifica si esta vacia o no
                    } else {
                        bw.write(" \t");
                    }
                }
                bw.newLine();
            }

            bw.close();                                         //se cierra el buffer
            fw.close();

        } catch (IOException ex) {
            Logger.getLogger(Excel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //JAVIER ARGUETA
    private void saveTable(File file) {
        //funcion guardar TODA la tabla 
        
        
        try {
            FileWriter fw = new FileWriter(file);                   //se crea el buffer para el archivo
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < jTableAZ.getRowCount(); i++) {                      //ciclo para leer la tabla y guardar en el archivo
                for (int j = 1; j < jTableAZ.getColumnCount(); j++) {
                    Object value = jTableAZ.getValueAt(i, j);
                    if (value != null) {                                            //ciclo para verificar si está vacio o no la celda
                        bw.write(jTableAZ.getValueAt(i, j).toString() + "\t");      //se escribe en el archivo lo obtenido en la celda, concatenando el separador "\t" que nos ayudara a diferencias filas y columnas
                    } else {
                        bw.write(" \t");
                    }

                }
                bw.newLine();           //se escribe una nueva linea en el archivo
            }

            bw.close();                 //se cierra el buffer
            fw.close();

        } catch (IOException ex) {
            Logger.getLogger(Excel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private DefaultTableModel getTableModel(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        return model;
    }
    //JAVIER ARGUETA
    private void loadTable(File file) {
        //funcion cargar tabla
        
        try {
            FileReader fr = new FileReader(file);                       //se crea el buffer
            BufferedReader br = new BufferedReader(fr);

            Object[] lines = br.lines().toArray();                      //el objeto lines recibira todas las lineas del archivo
            String[] colmsAyd = lines[0].toString().split("\t");

            for (int i = 0; i < lines.length; i++) {
                String[] colums = lines[i].toString().split("\t");      //se separa por columnas gracias al separador "\t" que se concatenó antes        
                for (int j = 0; j < colmsAyd.length; j++) {

                    jTableAZ.setValueAt(colums[j], i, 1 + j);     //se escribe en la celda deseada de la tabla, empezando po 0,0 - 0,1 y así hasta llenarla
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Excel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Excel().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableAZ;
    private javax.swing.JMenuItem jmiAbrir;
    private javax.swing.JMenuItem jmiBackground;
    private javax.swing.JMenuItem jmiColorLetra;
    private javax.swing.JMenuItem jmiCopiar;
    private javax.swing.JMenuItem jmiCortar;
    private javax.swing.JMenuItem jmiFuente;
    private javax.swing.JMenuItem jmiGuardar;
    private javax.swing.JMenuItem jmiPegar;
    private javax.swing.JMenuItem jmiSalir;
    private javax.swing.JMenu jmuArchivo;
    private javax.swing.JMenu jmuAyuda;
    private javax.swing.JMenu jmuNuevo;
    private javax.swing.JMenu jmuOpciones;
    // End of variables declaration//GEN-END:variables

    private static class JColorChoose {

    }

}
