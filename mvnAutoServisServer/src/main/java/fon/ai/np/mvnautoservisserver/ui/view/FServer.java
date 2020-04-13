/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fon.ai.np.mvnautoservisserver.ui.view;

import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Nikola
 */
public class FServer extends javax.swing.JFrame {

    /**
     * Creates new form FrmServer
     */
    public FServer() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtStatusServera = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKlijenata = new javax.swing.JTable();
        btnZatvori = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuServer = new javax.swing.JMenu();
        jMenuItemPokreni = new javax.swing.JMenuItem();
        jMenuItemZaustavi = new javax.swing.JMenuItem();
        jMenuConfiguration = new javax.swing.JMenu();
        jMenuItemServerConfig = new javax.swing.JMenuItem();
        jMenuItemDatabaseConfig = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Autoservis - Server");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel1.setText("Status:");

        txtStatusServera.setEditable(false);
        txtStatusServera.setText("Server trenutno nije pokrenut");

        tblKlijenata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Redni broj", "Klijent", "Vreme povezivanja"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblKlijenata.setRowHeight(25);
        jScrollPane1.setViewportView(tblKlijenata);

        btnZatvori.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnZatvori.setText("Zatvori");

        jMenuServer.setText("Server");

        jMenuItemPokreni.setText("Pokreni");
        jMenuServer.add(jMenuItemPokreni);

        jMenuItemZaustavi.setText("Zaustavi");
        jMenuServer.add(jMenuItemZaustavi);

        jMenuBar1.add(jMenuServer);

        jMenuConfiguration.setText("Configuration");

        jMenuItemServerConfig.setText("Server configuration");
        jMenuConfiguration.add(jMenuItemServerConfig);

        jMenuItemDatabaseConfig.setText("Database configuration");
        jMenuConfiguration.add(jMenuItemDatabaseConfig);

        jMenuBar1.add(jMenuConfiguration);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtStatusServera, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 424, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnZatvori, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtStatusServera, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnZatvori, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnZatvori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuConfiguration;
    private javax.swing.JMenuItem jMenuItemDatabaseConfig;
    private javax.swing.JMenuItem jMenuItemPokreni;
    private javax.swing.JMenuItem jMenuItemServerConfig;
    private javax.swing.JMenuItem jMenuItemZaustavi;
    private javax.swing.JMenu jMenuServer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblKlijenata;
    private javax.swing.JTextField txtStatusServera;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnZatvori() {
        return btnZatvori;
    }

    public JMenuItem getjMenuItemStart() {
        return jMenuItemPokreni;
    }

    public JMenuItem getjMenuItemStop() {
        return jMenuItemZaustavi;
    }

    public JTable getTblClients() {
        return tblKlijenata;
    }

    public JTextField getTxtStatusServera() {
        return txtStatusServera;
    }

    public JMenuItem getjMenuItemDatabaseConfig() {
        return jMenuItemDatabaseConfig;
    }

    public JMenuItem getjMenuItemServerConfig() {
        return jMenuItemServerConfig;
    }
    

}
