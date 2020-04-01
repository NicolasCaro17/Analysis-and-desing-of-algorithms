package vista;

import modelo.Pais;
import controlador.Paises;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import persistencia.Persistencia;

public class Principal extends javax.swing.JFrame {

    //Relaciones:
    public Pais pais;
    public Paises paises;
    public Persistencia persistencia;

    public InicioJPanel inicioJPanel;
    public AgregarJPanel agregarJPanel;
    public ModificarJPanel modificarJPanel;
    public EliminarJPanel eliminarJPanel;

    public Principal() throws IOException, FileNotFoundException, ClassNotFoundException {
        paises = new Paises();
        persistencia = new Persistencia();
        try {
            paises = persistencia.recuperar();
        } catch (Exception FileNotFoundException) {
            System.out.println("Archivo aun no creado");
            persistencia.guardar(paises);
        }
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Registro Covid-19");
        setName("pricipalJFrame");
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
        iniciar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 164, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 91, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                try {
                    new Principal().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }

    public void iniciar() throws IOException {
        inicioJPanel = new InicioJPanel(this);
        inicioJPanel.setVisible(true);
        add(inicioJPanel);
        pack();
        setLocationRelativeTo(null);
    }

    //Navegacion entre paneles
    protected void irAAgregar(JPanel jPanel) {
        remove(jPanel);
        agregarJPanel = new AgregarJPanel(this);
        agregarJPanel.setVisible(true);
        add(agregarJPanel);
        pack();
        setLocationRelativeTo(null);
    }

    protected void irAModificar(JPanel jPanel) {
        remove(jPanel);
        modificarJPanel = new ModificarJPanel(this);
        modificarJPanel.setVisible(true);
        add(modificarJPanel);
        pack();
        setLocationRelativeTo(null);
    }

    protected void irAEliminar(JPanel jPanel) {
        remove(jPanel);
        eliminarJPanel = new EliminarJPanel(this);
        eliminarJPanel.setVisible(true);
        add(eliminarJPanel);
        pack();
        setLocationRelativeTo(null);
    }

    protected void volverAInicio(JPanel jPanel) throws IOException {
        remove(jPanel);
        inicioJPanel = new InicioJPanel(this);
        inicioJPanel.setVisible(true);
        add(inicioJPanel);
        pack();
        setLocationRelativeTo(null);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
