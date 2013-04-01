package controllers;

import play.mvc.*;

import scala.Long;

public class Application extends Controller {
  
    public static Result index() {
        return ok("Hello world!");
    }

    public static Result profile() {
        return TODO;
    }

    public static Result editProfile() {
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

    public static Result newJobPosting() {
        return TODO;
    }

    public static Result deleteJobPosting(Long id) {
        return TODO;
    }

    public static Result restaurants() {
        return TODO;
    }

    public static Result askForReferral() {
        return TODO;
    }

    public static Result provideReferral() {
        return TODO;
    }

}
