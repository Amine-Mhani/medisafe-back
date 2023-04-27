package ma.ensaj.medisafe.beans;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Auth {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private String imei;
    private Date date;


    public Auth() {
    }

    public Auth(User user, String imei, Date date) {

        this.user = user;
        this.imei = imei;
        this.date = date;

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public String getImei() {
        return imei;
    }

    public Date getDate() {
        return date;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public void setDate(Date date) {
        this.date = date;
    }


}