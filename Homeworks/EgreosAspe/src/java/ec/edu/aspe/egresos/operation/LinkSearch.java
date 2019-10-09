/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.aspe.egresos.operation;

import ec.edu.aspe.egresos.model.CasaComercial;
import ec.edu.aspe.egresos.model.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class LinkSearch {
    Connection con =null;
    Conexion obj_con= new Conexion();
    PreparedStatement pst=null;
    ResultSet rs=null;
    String cadena;
    
    private String sqlGetStudent = "SELECT * from  CC WHERE ";
    
    private final List<CasaComercial> listCasaComercial = new ArrayList<CasaComercial>();
    
    public List<CasaComercial> listCasaComercial(){
        Conexion conect1 = new Conexion();
        Connection con1 = conect1.getConnection();
        String sql = "SELECT * from CC";
        try
        {
            Statement st = con1.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()){
                String ID_CC = rs.getString("ID_CC");
                String NOMBRE_CC = rs.getString("NOMBRE_CC");
                String RUC_CC = rs.getString("RUC_CC");
                String PRODUCTOS_CC = rs.getString("PRODUCTOS_CC");
                String VENTAS_CC = rs.getString("VENTAS_CC");

                CasaComercial cc =  new CasaComercial(ID_CC, NOMBRE_CC, RUC_CC, PRODUCTOS_CC, VENTAS_CC);
                listCasaComercial.add(cc);
            }
            st.close();
            return listCasaComercial;
        }catch (SQLException e){
            System.err.println("Got an exception! ");
            return null;
        }
    }
    
    public List<String> cargarCC(){
        List<String> casasComerciales = new ArrayList();
        cadena= "select NOMBRE_CC from CC";
        try
        {
            con =obj_con.getConnection();
            pst= con.prepareStatement(cadena);
            rs=pst.executeQuery(cadena);
            while(rs.next())
                casasComerciales.add(rs.getString(1));
            rs.close();
        }
	catch (SQLException ex)
	{
          JOptionPane.showMessageDialog(null,ex.getMessage(),"Mensaje: ",JOptionPane.ERROR_MESSAGE);
        }
        return casasComerciales;
    }
    
    public String cargarRUC(String nombrecc){
        String ruc="0000000000000";
        cadena= "select RUC_CC from CC where NOMBRE_CC like '"+ nombrecc +"'";
        try
        {
            con =obj_con.getConnection();
            pst= con.prepareStatement(cadena);
            rs=pst.executeQuery(cadena);
            if(rs.next())
                ruc = rs.getString(1);
            rs.close();
            return ruc;
        }
	catch (SQLException ex)
	{
          JOptionPane.showMessageDialog(null,ex.getMessage(),"Mensaje: ",JOptionPane.ERROR_MESSAGE);
        }
        return ruc;
    }
    
    public String cargarVenta(String product){
        String venta="0000";
        cadena= "select VENTAS_CC from CC where PRODUCTOS_CC like '"+ product +"'";
        try
        {
            con =obj_con.getConnection();
            pst= con.prepareStatement(cadena);
            rs=pst.executeQuery(cadena);
            if(rs.next())
                venta = rs.getString(1);
            rs.close();
            return venta;
        }
	catch (SQLException ex)
	{
          JOptionPane.showMessageDialog(null,ex.getMessage(),"Mensaje: ",JOptionPane.ERROR_MESSAGE);
        }
        return venta;
    }
    
    public String cargarProducto(String product){
        String venta="No Existe";
        cadena= "select NOMBRE_CC from CC where PRODUCTOS_CC like '"+ product +"'";
        try
        {
            con =obj_con.getConnection();
            pst= con.prepareStatement(cadena);
            rs=pst.executeQuery(cadena);
            if(rs.next())
                venta = rs.getString(1);
            rs.close();
            return venta;
        }
	catch (SQLException ex)
	{
          JOptionPane.showMessageDialog(null,ex.getMessage(),"Mensaje: ",JOptionPane.ERROR_MESSAGE);
        }
        return venta;
    }
    
}
