package models;

import play.data.validation.Constraints.*;
import play.db.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.*;

@Entity
@Table(name="GEOCOUNTRY")
public class Country extends Model {

    @Id
    @Column(name="ID")
    public Long id;

    @Required
    @Column(name="COUNTRYCODE")
    public String countryCode;

    @Required
    @Column(name="NAME")
    public String name;

    public static Finder<Long,Country> find = new Finder(
            Long.class, Country.class
    );

    public static List<Country> all() {
        return find.all();
    }

    public static List<String> list() {
        List<String> codes = new ArrayList<String>();
        for (Country country : all())
        {
            codes.add(country.countryCode);
        }
        return codes;
    }

}