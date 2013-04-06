package controllers;

import play.mvc.*;
import play.data.*;
import static play.data.Form.*;

import views.html.signup.*;
import views.html.user.*;

import models.*;

public class SignUp extends Controller {

    /**
     * Defines a form wrapping the User class.
     */
    final static Form<User> signupForm = form(User.class);

    /**
     * Display a blank form.
     */
    public static Result blank() {
        return ok(form.render(signupForm));
    }

    /**
     * Handle the form submission.
     */
    public static Result submit() {
        Form<User> filledForm = signupForm.bindFromRequest();

        // Check accept conditions
        if(!"true".equals(filledForm.field("accept").value())) {
            filledForm.reject("accept", "You must accept the terms and conditions");
        }

        if(filledForm.hasErrors()) {
            return badRequest(form.render(filledForm));
        } else {
            User created = filledForm.get();
            return ok(profile.render(created));
        }
    }

}