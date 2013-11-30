/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sic;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author Angela
 */
public class Fecha extends Thread{
    
    JLabel LabelFecha;
    
    public Fecha(JLabel LabelFecha)
    {
        this.LabelFecha = LabelFecha;
    }
    
    @Override
    public void run()
    {
        while(true)  {
            Date hoy = new Date();
            SimpleDateFormat fecha = new SimpleDateFormat("EEEEEEEEEE dd 'de' MMMM 'de' yyyyy");
            SimpleDateFormat hora = new SimpleDateFormat("hh:mm:ss");
            LabelFecha.setText(fecha.format(hoy)+"  " + hora.format(hoy));
            
        }       
    }
    
}
