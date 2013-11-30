
package sic;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;


public class FondoPantallas extends javax.swing.JPanel {

    public FondoPantallas() {
        initComponents();
        this.setSize(1000,1000);
    }
    
    public void paintComponent(Graphics g){
        Dimension tam = getSize();
        
        ImageIcon imagenfondo = new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/verde.jpg")).getImage());
        g.drawImage(imagenfondo.getImage(),0,0, tam.width, tam.height, null); 
        setOpaque(false);
        super.paintComponent(g);     
        
     }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
