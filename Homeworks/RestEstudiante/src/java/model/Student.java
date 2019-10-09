
package model;

public class Student {
    
    int idStudent;
    String firstname;
    String lastname;
    String telephone;
    String mail;

    public Student(int idStudent, String firstname, String lastname, String telephone, String mail) {
        this.idStudent = idStudent;
        this.firstname = firstname;
        this.lastname = lastname;
        this.telephone = telephone;
        this.mail = mail;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
