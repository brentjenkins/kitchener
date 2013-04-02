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
    @Column(name="EMAIL")
    public String email;

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

    public static Finder<Long,User> find = new Finder(
            Long.class, User.class
    );

    public static List<User> all() {
        return find.all();
    }

    public static void create(User user) {
        user.save();
    }

    public static void delete(Long id) {
        find.ref(id).delete();
    }

}