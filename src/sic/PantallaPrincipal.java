
package sic;


import java.awt.BorderLayout;

import DBAdmon.Coneccion;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


public class PantallaPrincipal extends javax.swing.JFrame {

    public PantallaPrincipal() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/admin.png")).getImage());
        
        Fondo f = new Fondo();
        this.add(f, BorderLayout.CENTER);
        this.pack();
        Fecha hilo;
        hilo = new Fecha(LabelFecha);
        hilo.start();
        

    }
    
        
    @SuppressWarnings("unchecked")
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        LabelFecha = new javax.swing.JLabel();
        btnCatalogo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnReporteDiario = new javax.swing.JButton();
        btnPuesto = new javax.swing.JButton();
        btnConfiguracion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnempleados = new javax.swing.JButton();
        btnReporteMayorizacion = new javax.swing.JButton();
        btnDiario1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnBComprobacion = new javax.swing.JButton();
        btnEERR = new javax.swing.JButton();
        btnEECapital = new javax.swing.JButton();
        btnBGeneral = new javax.swing.JButton();
        btnProdyVta = new javax.swing.JButton();
        btnBoletaTrabajo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        LabelFecha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelFecha.setForeground(new java.awt.Color(204, 204, 255));
        LabelFecha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelFecha.setText("fecha");
        LabelFecha.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        LabelFecha.setBounds(1020, 20, 330, 30);
        jDesktopPane1.add(LabelFecha, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnCatalogo.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        btnCatalogo.setForeground(new java.awt.Color(204, 204, 0));
        btnCatalogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/catalogo48.png"))); // NOI18N
        btnCatalogo.setText("Catalogo de Cuentas");
        btnCatalogo.setBorderPainted(false);
        btnCatalogo.setContentAreaFilled(false);
        btnCatalogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCatalogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCatalogo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/catalogo48.png"))); // NOI18N
        btnCatalogo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/catalogo64.png"))); // NOI18N
        btnCatalogo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCatalogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCatalogoMouseClicked(evt);
            }
        });
        btnCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatalogoActionPerformed(evt);
            }
        });
        btnCatalogo.setBounds(110, 150, 190, 100);
        jDesktopPane1.add(btnCatalogo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setBackground(new java.awt.Color(0, 51, 51));
        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 204, 255));
        jLabel1.setText("ADMINISTRACIÓN");
        jLabel1.setMaximumSize(new java.awt.Dimension(190, 26));
        jLabel1.setBounds(70, 100, 180, 22);
        jDesktopPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnReporteDiario.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        btnReporteDiario.setForeground(new java.awt.Color(204, 204, 0));
        btnReporteDiario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/librodiario48.png"))); // NOI18N
        btnReporteDiario.setText("Libro Diario");
        btnReporteDiario.setBorder(null);
        btnReporteDiario.setBorderPainted(false);
        btnReporteDiario.setContentAreaFilled(false);
        btnReporteDiario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReporteDiario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReporteDiario.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/librodiario48.png"))); // NOI18N
        btnReporteDiario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/librodiario64.png"))); // NOI18N
        btnReporteDiario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReporteDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteDiarioActionPerformed(evt);
            }
        });
        btnReporteDiario.setBounds(130, 360, 170, 100);
        jDesktopPane1.add(btnReporteDiario, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnPuesto.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        btnPuesto.setForeground(new java.awt.Color(204, 204, 0));
        btnPuesto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/puestos48.png"))); // NOI18N
        btnPuesto.setText("Puestos");
        btnPuesto.setBorderPainted(false);
        btnPuesto.setContentAreaFilled(false);
        btnPuesto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPuesto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPuesto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/puestos48.png"))); // NOI18N
        btnPuesto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/puestos64.png"))); // NOI18N
        btnPuesto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuestoActionPerformed(evt);
            }
        });
        btnPuesto.setBounds(650, 150, 170, 100);
        jDesktopPane1.add(btnPuesto, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/config32.png"))); // NOI18N
        btnConfiguracion.setBorderPainted(false);
        btnConfiguracion.setContentAreaFilled(false);
        btnConfiguracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfiguracion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/config32.png"))); // NOI18N
        btnConfiguracion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/config48.png"))); // NOI18N
        btnConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracionActionPerformed(evt);
            }
        });
        btnConfiguracion.setBounds(1190, 620, 100, 60);
        jDesktopPane1.add(btnConfiguracion, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setBackground(new java.awt.Color(0, 51, 51));
        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 204, 255));
        jLabel2.setText("REPORTES");
        jLabel2.setBounds(80, 310, 130, 22);
        jDesktopPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnempleados.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        btnempleados.setForeground(new java.awt.Color(204, 204, 0));
        btnempleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/empleado48.png"))); // NOI18N
        btnempleados.setText("Empleados");
        btnempleados.setBorderPainted(false);
        btnempleados.setContentAreaFilled(false);
        btnempleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnempleados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnempleados.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/empleado48.png"))); // NOI18N
        btnempleados.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/empleado64.png"))); // NOI18N
        btnempleados.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnempleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnempleadosActionPerformed(evt);
            }
        });
        btnempleados.setBounds(880, 150, 170, 100);
        jDesktopPane1.add(btnempleados, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnReporteMayorizacion.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        btnReporteMayorizacion.setForeground(new java.awt.Color(204, 204, 0));
        btnReporteMayorizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/libromayor48.png"))); // NOI18N
        btnReporteMayorizacion.setText("Mayorización");
        btnReporteMayorizacion.setBorderPainted(false);
        btnReporteMayorizacion.setContentAreaFilled(false);
        btnReporteMayorizacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReporteMayorizacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReporteMayorizacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/libromayor48.png"))); // NOI18N
        btnReporteMayorizacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/libromayor64.png"))); // NOI18N
        btnReporteMayorizacion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReporteMayorizacion.setBounds(460, 360, 170, 100);
        jDesktopPane1.add(btnReporteMayorizacion, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnDiario1.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        btnDiario1.setForeground(new java.awt.Color(204, 204, 0));
        btnDiario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/librodiario48.png"))); // NOI18N
        btnDiario1.setText("Partida Libro Diario");
        btnDiario1.setBorder(null);
        btnDiario1.setBorderPainted(false);
        btnDiario1.setContentAreaFilled(false);
        btnDiario1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDiario1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDiario1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/librodiario48.png"))); // NOI18N
        btnDiario1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/librodiario64.png"))); // NOI18N
        btnDiario1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDiario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiario1ActionPerformed(evt);
            }
        });
        btnDiario1.setBounds(390, 150, 170, 100);
        jDesktopPane1.add(btnDiario1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/planilla48.png"))); // NOI18N
        jButton2.setText("Planilla de Pagos");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/planilla48.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/planilla64.png"))); // NOI18N
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.setBounds(770, 360, 170, 100);
        jDesktopPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir24.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir24.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir32.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(1250, 620, 100, 60);
        jDesktopPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnBComprobacion.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        btnBComprobacion.setForeground(new java.awt.Color(204, 204, 0));
        btnBComprobacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/balancedecomprob48.png"))); // NOI18N
        btnBComprobacion.setText("Balance de Comprobación");
        btnBComprobacion.setBorderPainted(false);
        btnBComprobacion.setContentAreaFilled(false);
        btnBComprobacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBComprobacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBComprobacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/balancedecomprob48.png"))); // NOI18N
        btnBComprobacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/balancedecomprob64.png"))); // NOI18N
        btnBComprobacion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBComprobacion.setBounds(1050, 350, 220, 120);
        jDesktopPane1.add(btnBComprobacion, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnEERR.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        btnEERR.setForeground(new java.awt.Color(204, 204, 0));
        btnEERR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/estadoresultados48.png"))); // NOI18N
        btnEERR.setText("Estado de Resultados");
        btnEERR.setBorderPainted(false);
        btnEERR.setContentAreaFilled(false);
        btnEERR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEERR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEERR.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/estadoresultados48.png"))); // NOI18N
        btnEERR.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/estadoresultados64.png"))); // NOI18N
        btnEERR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEERR.setBounds(120, 510, 190, 100);
        jDesktopPane1.add(btnEERR, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnEECapital.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        btnEECapital.setForeground(new java.awt.Color(204, 204, 0));
        btnEECapital.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/estadocapital48.png"))); // NOI18N
        btnEECapital.setText("Estado de Capital");
        btnEECapital.setBorderPainted(false);
        btnEECapital.setContentAreaFilled(false);
        btnEECapital.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEECapital.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEECapital.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/estadocapital48.png"))); // NOI18N
        btnEECapital.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/estadocapital64.png"))); // NOI18N
        btnEECapital.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEECapital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEECapitalActionPerformed(evt);
            }
        });
        btnEECapital.setBounds(450, 500, 190, 110);
        jDesktopPane1.add(btnEECapital, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnBGeneral.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        btnBGeneral.setForeground(new java.awt.Color(204, 204, 0));
        btnBGeneral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/balancegeneral48.png"))); // NOI18N
        btnBGeneral.setText("Balance General");
        btnBGeneral.setBorderPainted(false);
        btnBGeneral.setContentAreaFilled(false);
        btnBGeneral.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBGeneral.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBGeneral.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/balancegeneral48.png"))); // NOI18N
        btnBGeneral.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/balancegeneral64.png"))); // NOI18N
        btnBGeneral.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBGeneralActionPerformed(evt);
            }
        });
        btnBGeneral.setBounds(760, 510, 190, 100);
        jDesktopPane1.add(btnBGeneral, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnProdyVta.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        btnProdyVta.setForeground(new java.awt.Color(204, 204, 0));
        btnProdyVta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/produccionyventas48.png"))); // NOI18N
        btnProdyVta.setText("Estado de Costos de Produccion y Ventas");
        btnProdyVta.setBorderPainted(false);
        btnProdyVta.setContentAreaFilled(false);
        btnProdyVta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProdyVta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProdyVta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/produccionyventas48.png"))); // NOI18N
        btnProdyVta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/produccionyvtas64.png"))); // NOI18N
        btnProdyVta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnProdyVta.setBounds(1000, 500, 340, 100);
        jDesktopPane1.add(btnProdyVta, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnBoletaTrabajo.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        btnBoletaTrabajo.setForeground(new java.awt.Color(204, 204, 0));
        btnBoletaTrabajo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/reportecliente48.png"))); // NOI18N
        btnBoletaTrabajo.setText("Boleta de Trabajo");
        btnBoletaTrabajo.setBorderPainted(false);
        btnBoletaTrabajo.setContentAreaFilled(false);
        btnBoletaTrabajo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBoletaTrabajo.setDefaultCapable(false);
        btnBoletaTrabajo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBoletaTrabajo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/reportecliente48.png"))); // NOI18N
        btnBoletaTrabajo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/reportecliente64.png"))); // NOI18N
        btnBoletaTrabajo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBoletaTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoletaTrabajoActionPerformed(evt);
            }
        });
        btnBoletaTrabajo.setBounds(1140, 150, 170, 100);
        jDesktopPane1.add(btnBoletaTrabajo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1361, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReporteDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteDiarioActionPerformed
        
    }//GEN-LAST:event_btnReporteDiarioActionPerformed

    private void btnCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatalogoActionPerformed
        Cuenta cta = new Cuenta();
        cta.setVisible(true);
    }//GEN-LAST:event_btnCatalogoActionPerformed

    private void btnPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuestoActionPerformed
       Puestos puestos = new Puestos();
       puestos.setVisible(true);
    }//GEN-LAST:event_btnPuestoActionPerformed

    private void btnempleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnempleadosActionPerformed
        Empleado emp = new Empleado();
        emp.setVisible(true);
    }//GEN-LAST:event_btnempleadosActionPerformed

    private void btnCatalogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCatalogoMouseClicked
         //Clientes clientes = new Clientes();
    }//GEN-LAST:event_btnCatalogoMouseClicked

    private void btnDiario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiario1ActionPerformed
       Diario d = new Diario();
        d.setVisible(true);
    }//GEN-LAST:event_btnDiario1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionActionPerformed
        // TODO add your handling code here:
        config cf = new config();
        cf.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_btnConfiguracionActionPerformed

    private void btnBoletaTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoletaTrabajoActionPerformed
        BoletadeTrabajo bt = new BoletadeTrabajo();
        bt.setVisible(true);
    }//GEN-LAST:event_btnBoletaTrabajoActionPerformed

    private void btnEECapitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEECapitalActionPerformed
        // TODO add your handling code here:
        ShowReport("EstadoDeCapital.jasper");
        
        
    }//GEN-LAST:event_btnEECapitalActionPerformed

    private void btnBGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBGeneralActionPerformed
        // TODO add your handling code here:
        ShowReport("BalanceGeneral.jasper");
    }//GEN-LAST:event_btnBGeneralActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelFecha;
    private javax.swing.JButton btnBComprobacion;
    private javax.swing.JButton btnBGeneral;
    private javax.swing.JButton btnBoletaTrabajo;
    private javax.swing.JButton btnCatalogo;
    private javax.swing.JButton btnConfiguracion;
    private javax.swing.JButton btnDiario1;
    private javax.swing.JButton btnEECapital;
    private javax.swing.JButton btnEERR;
    private javax.swing.JButton btnProdyVta;
    private javax.swing.JButton btnPuesto;
    private javax.swing.JButton btnReporteDiario;
    private javax.swing.JButton btnReporteMayorizacion;
    private javax.swing.JButton btnempleados;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables


    private void ShowReport(String nombre){
        try
        {        
            Coneccion cnx = new Coneccion();
            cnx.conectar();
            //URL in=getClass().getResource( "/Reportes/CatalogoDeCuentas.jasper" );  
            URL in=getClass().getResource( "/Reportes/" + nombre );  
            URL logo = getClass().getResource("/imagenes/LOGOSIC.V.png");
            //JOptionPane.showMessageDialog(null, logo);
            System.out.println("master" + in);
            if (in== null) 
            {                
                System.out.println("No encuentro el archivo del reporte maestro.");
                //System.exit(2);
            } 
            JasperReport masterReport = null;
            try 
            {
                masterReport = (JasperReport) JRLoader.loadObject(in);
            } 
            catch (JRException e) 
            {
                System.out.println("Error cargando el reporte maestro: " + e.getMessage());
                cnx.conn.close();                
            }          
             Map<String,Object> parametro = new HashMap<>();                  
             parametro.put("img", logo);             
            JasperPrint jasperPrint = JasperFillManager.fillReport(masterReport,parametro,cnx.conn);
            JasperViewer jviewer = new JasperViewer(jasperPrint,false);
            jviewer.setVisible(true);          
        }
            catch (Exception j)
        {
               Logger.getLogger(getClass().getName()).log(Level.SEVERE, "Mensaje crítico...",j);
            System.out.println("Mensaje de Error:"+j.getMessage());
        }
    }


}
