/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fon.ai.np.mvnautoservisklijent.ui.view;

/**
 *
 * @author Nikola
 */
public class FLogin extends javax.swing.JFrame {

    /**
     * Creates new form FLogin
     */
    public FLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtKorisnickoIme = new javax.swing.JTextField();
        txtLozinka = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        btnOdustani = new javax.swing.JButton();
        btnUloguj = new javax.swing.JButton();
        lblGreskaLozinka = new javax.swing.JLabel();
        lblGreskaKorisnicko = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlLogin.setBorder(javax.swing.BorderFactory.createTitledBorder("Dobrodosli!"));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel1.setText("Korisnicko ime:");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel2.setText("Lozinka:");

        btnOdustani.setText("Odustani");

        btnUloguj.setText("Prijavi se");

        lblGreskaLozinka.setForeground(new java.awt.Color(255, 0, 0));

        lblGreskaKorisnicko.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGreskaKorisnicko, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addComponent(btnOdustani, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                        .addComponent(btnUloguj, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtKorisnickoIme)
                    .addComponent(txtLozinka)
                    .addComponent(lblGreskaLozinka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKorisnickoIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(lblGreskaKorisnicko, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLozinka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblGreskaLozinka, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUloguj)
                    .addComponent(btnOdustani))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOdustani;
    private javax.swing.JButton btnUloguj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblGreskaKorisnicko;
    private javax.swing.JLabel lblGreskaLozinka;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JTextField txtKorisnickoIme;
    private javax.swing.JPasswordField txtLozinka;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JButton getBtnOdustani() {
        return btnOdustani;
    }

    public void setBtnOdustani(javax.swing.JButton btnOdustani) {
        this.btnOdustani = btnOdustani;
    }

    public javax.swing.JButton getBtnUloguj() {
        return btnUloguj;
    }

    public void setBtnUloguj(javax.swing.JButton btnUloguj) {
        this.btnUloguj = btnUloguj;
    }

    public javax.swing.JTextField getTxtKorisnickoIme() {
        return txtKorisnickoIme;
    }

    public void setTxtKorisnickoIme(javax.swing.JTextField txtKorisnickoIme) {
        this.txtKorisnickoIme = txtKorisnickoIme;
    }

    public javax.swing.JPasswordField getTxtLozinka() {
        return txtLozinka;
    }

    public void setTxtLozinka(javax.swing.JPasswordField txtLozinka) {
        this.txtLozinka = txtLozinka;
    }

    public javax.swing.JLabel getLblGreskaKorisnicko() {
        return lblGreskaKorisnicko;
    }

    public void setLblGreskaKorisnicko(javax.swing.JLabel lblGreskaKorisnicko) {
        this.lblGreskaKorisnicko = lblGreskaKorisnicko;
    }

    public javax.swing.JLabel getLblGreskaLozinka() {
        return lblGreskaLozinka;
    }

    public void setLblGreskaLozinka(javax.swing.JLabel lblGreskaLozinka) {
        this.lblGreskaLozinka = lblGreskaLozinka;
    }
    
}