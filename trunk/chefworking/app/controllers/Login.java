package controllers;

import play.mvc.*;
import play.data.*;
import static play.data.Form.*;

import views.html.login.*;

import models.*;
/**
 * Created with IntelliJ IDEA.
 * User: bjenkins
 * Date: 4/5/13
 * Time: 9:29 AM
 * To change this template use File | Settings | File Templates.
 */
public class Login extends Controller {

    /**
     * Defines a form wrapping the User class.
     */
    final static Form<User> loginForm = form(User.class);

    /**
     * Display a blank form.
     */
    public static Result blank() {
        return ok(form.render(loginForm));
    }

    /**
     * Handle the form submission.
     */
    public static Result submit() {
        Form<User> filledForm = loginForm.bindFromRequest();

        if(filledForm.hasErrors()) {
            return badRequest(form.render(filledForm));
        } else {
            User created = filledForm.get();
            return ok(summary.render(created));
        }
    }
}
