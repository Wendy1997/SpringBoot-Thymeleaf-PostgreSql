package wendy.damar.demo.models;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    // An autogenerated id (unique for each user in the db)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String email;

    @NotNull
    private String name;

    // Public methods

    public User() {
    }

    public User(long id) {
        this.id = id;
    }

    public User(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setName(String name){
        this.name = name;
    }

    public long getId(){
        return this.id;
    }

    public String getEmail(){
        return this.email;
    }

    public String getName(){
        return this.name;
    }
}