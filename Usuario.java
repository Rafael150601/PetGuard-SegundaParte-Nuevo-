package pe.edu.upc.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="User")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;

    @Column(name="userName", length=40, nullable = false)
    private String userName;

    @Column(name="password",length = 20,nullable = false)
    private String password;

    public Usuario() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Usuario(int idUser, String userName, String password) {
        super();
        this.idUser = idUser;
        this.userName = userName;
        this.password = password;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}