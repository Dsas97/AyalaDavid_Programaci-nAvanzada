
package services;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LinkSearch {
    
    ///Search URIS
    private String sqlGetStudent = "SELECT * from  student WHERE ";
    
    private final List<Student> listStudent = new ArrayList<Student>();
    
    public List<Student> listStudent(){
        Conexion conect1 = new Conexion();
        Connection con1 = conect1.getConnection();
        String sql = "SELECT * FROM student";
        try
        {
            Statement st = con1.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()){
                int idStudent = rs.getInt("idStudent");
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                String telephone = rs.getString("telephone");
                String mail = rs.getString("mail");

                Student student =  new Student(idStudent, firstname, lastname, telephone, mail);
                listStudent.add(student);
            }
            st.close();
            return listStudent;
        }catch (SQLException e){
            System.err.println("Got an exception! ");
            return null;
        }
    }
    
    public Student getStudent(String firstname, String lastname)
    {
            Conexion conect1 = new Conexion();
            Connection con1 = conect1.getConnection();
            
            String sql = sqlGetStudent + "(firstname= '" + firstname + "' "
                    + "and lastname= '" + lastname + "')";
            try
            {
                Statement st = con1.createStatement();
                ResultSet rs = st.executeQuery(sql);

                Student student = null;
                while(rs.next()){
                    student = new Student(rs.getInt("idStudent"), firstname, 
                            lastname, rs.getString("telephone"), 
                            rs.getString("mail"));
                }
                con1.close();
                return student;
            }    catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error...");
                return null;
        }
    }
    
}
