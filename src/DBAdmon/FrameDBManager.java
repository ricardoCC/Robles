
package DBAdmon;

import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ricardo
 */
public class FrameDBManager {
    
    PreparedStatement ps;
    ResultSet rs;
    ResultSetMetaData rsmd;
    DefaultTableModel dtm;
    Coneccion con = new Coneccion();
    
    /*
     * Este metodo extrae los datos de la Base de Datos
     * y los inserta en una tabla
     * 
     * void DBpushFrame(String sql, JFrame tabla)
     */
    public void DBpushFrame(String sql, javax.swing.JTable tabla){
        con.conectar();
        try{
            ps = con.conn.prepareStatement(sql);
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            ArrayList<Object []>  data = new ArrayList<>();
            while (rs.next()) {                
                Object [] rows = new Object[rsmd.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] = rs.getObject(i+1);
                }
                data.add(rows);
            }  
            
            dtm = (DefaultTableModel) tabla.getModel(); 
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
        
    }
    
    /*
     * Inserta datos a la base desde un frame
     */
    
    public void FramepushDB(String sql){
        con.conectar();
        try {
            ps = con.conn.prepareStatement(sql);
            rs = ps.executeQuery();
            JOptionPane.showMessageDialog(null, "Insercion realizada "
                    + "correctamente");
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }
    
    /*
     *Este metodo retorna la consulta de un dato.
     * 
     * Puede servir para llenar un JtextField
     */
    
    public String getConsultarDato(String sql){
        con.conectar();
        String resultado = "";
        try {
            ps = con.conn.prepareStatement(sql);
            rs = ps.executeQuery();
            rs.next();
            resultado = rs.getString(1);
            //resultado = rs.;
            System.out.println(resultado);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error: " + e);
        }
        
        return resultado;
    }
    
       
    public void eliminarRegistro(String sql){
        con.conectar();
        try{
            ps = con.conn.prepareStatement(sql);
            rs = ps.executeQuery();
            rs.close();
            
            JOptionPane.showMessageDialog(null, "El Registro ha sido eliminado");
        }catch(SQLException | HeadlessException r){
            JOptionPane.showMessageDialog(null, "Error: "+ r);
        }
    }
}
