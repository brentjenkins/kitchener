package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import static play.data.Form.*;

import java.util.*;

import models.*;

import views.html.user.*;

/**
 * Created with IntelliJ IDEA.
 * User: bjenkins
 * Date: 4/5/13
 * Time: 8:56 PM
 * To change this template use File | Settings | File Templates.
 */
@Security.Authenticated(Secured.class)
public class UserDashboard extends Controller {

    /**
     * Display the dashboard.
     */
    public static Result index() {
        return ok(
                dashboard.render(
                        User.findByEmail("brentjenkins@gmail.com")
                )
        );
    }

    /**
     * Display the user profile.
     */
    public static Result profile() {
        return ok(
                profile.render(
                        User.findByEmail("brentjenkins@gmail.com")
                )
        );
    }
}
