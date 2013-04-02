package models;

import play.data.validation.Constraints;

import java.util.*;

public class User {

    public Long id;

    @Constraints.Required
    public String email;

    @Constraints.Required
    public String firstName;

    @Constraints.Required
    public String lastName;

    public String phone;

    public String city;

    @Constraints.Required
    public String postalCode;

    @Constraints.Required
    public String countryCode;

    public static List<User> all() {
        return new ArrayList<User>();
    }

    public static void create(User user) {
    }

    public static void delete(Long id) {
    }

}