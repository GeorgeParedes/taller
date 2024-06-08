package ubilapaz.edu.bo.template.entity;

//@Entity
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name="User")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    Integer id;

    @Column (name = "NOMBRE")
    String nombre;

    @Column (name = "USERNAME")
    String username;

    @Column (name = "PASSWORD")
    String password;

    public void setNombre(Object nombre) {
    }

    public void setUsername(Object username) {
    }

    public void setPassword(Object password) {
    }
}
