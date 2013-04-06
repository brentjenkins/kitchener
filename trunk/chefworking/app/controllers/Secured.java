package controllers;

import play.mvc.*;
import play.mvc.Http.*;

public class Secured extends Security.Authenticator {

    @Override
    public String getUsername(Context ctx) {
        return ctx.session().get("email");
    }

    @Override
    public Result onUnauthorized(Context ctx) {
        return redirect(routes.Application.login());
    }

/*
    // Access rights
    // TODO: add this back when we implement reps for employers
    public static boolean isMemberOf(Long employer) {
        return Restaurant.isMember(
                employer,
                Context.current().request().username()
        );
    }
*/
}