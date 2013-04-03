package models;

import play.data.validation.Constraints.*;
import play.db.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.*;

@Entity
@Table(name="EMPLOYER")
public class Employer extends Model {

    @Id
    @Column(name="ID")
    public Long id;

    @Required
    @Column(name="NAME")
    public String name;

    @Required
    @Column(name="INDUSTRY_ID")
    public String industryId;

    @Column(name="WEBSITE")
    public String website;

    @Column(name="PHONE")
    public String phone;

    @Column(name="ADDRESS")
    public String address;

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

    @Required
    @Column(name="CATEGORY")
    public String category;

    public static Finder<Long,Employer> find = new Finder(
            Long.class, Employer.class
    );

    public static List<Employer> all() {
        return find.all();
    }

    public static void create(Employer employer) {
        employer.save();
    }

    public static void delete(Long id) {
        find.ref(id).delete();
    }

}