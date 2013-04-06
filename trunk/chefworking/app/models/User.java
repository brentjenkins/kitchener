package models;

import play.data.validation.Constraints.*;
import play.db.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.*;

@Entity
@Table(name="USER")
public class User extends Model {

    @Id
    @Column(name="ID")
    public Long id;

    @Required
    @Email
    @Column(name="EMAIL")
    public String email;

    @Required
    @MinLength(value = 6)
    public String password;

    @Required
    @Column(name="FIRSTNAME")
    public String firstName;

    @Required
    @Column(name="LASTNAME")
    public String lastName;

    @Column(name="PHONE")
    public String phone;

    @Column(name="CITY")
    public String city;

    @Column(name="STATECODE")
    public String stateCode;

    @Required
    @Column(name="POSTALCODE")
    public String postalCode;

    @Required
    @Column(name="COUNTRYCODE")
    public String countryCode;

    public static Model.Finder<String,User> find = new Model.Finder(String.class, User.class);

    public static List<User> all() {
        return find.all();
    }

    public static void create(User user) {
        user.save();
    }

    public static User findByEmail(String email) {
        return find.where().eq("email", email).findUnique();
    }

    /**
     * Authenticate a User.
     * TODO: use an md5 hash of the password
     */
    public static User authenticate(String email, String password) {
        return find.where()
                .eq("email", email)
                .eq("password", password)
                .findUnique();
    }

}