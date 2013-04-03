package controllers;

import models.Employer;
import models.User;
import play.data.Form;
import play.mvc.*;

import scala.Long;

public class Application extends Controller {

    static Form<Employer> employerForm = Form.form(Employer.class);

    public static Result index() {
        return redirect(routes.Application.users());
    }

    public static Result users() {
        return TODO;
    }

    public static Result user() {
        return TODO;
    }

    public static Result deleteUser(Long id) {
        return TODO;
    }

    public static Result restaurants() {
        return TODO;
    }

    public static Result newRestaurant() {
        return TODO;
    }

    public static Result jobHistories() {
        return TODO;
    }

    public static Result newJobHistory() {
        return TODO;
    }

    public static Result deleteJobHistory(Long id) {
        return TODO;
    }

    public static Result jobPostings() {
        return TODO;
    }

    public static Result jobPosting(Long id) {
        return TODO;
    }

    public static Result newJobPosting() {
        return TODO;
    }

    public static Result deleteJobPosting(Long id) {
        return TODO;
    }

    public static Result askForReferral() {
        return TODO;
    }

    public static Result provideReferral() {
        return TODO;
    }

}
