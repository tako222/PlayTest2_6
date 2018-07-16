package controllers;

import models.Fruits;
import controllers.beans.HomeBeans;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    public Result index() {
        HomeBeans bean = new HomeBeans();
        bean.pageTitle = "Home Title";
        bean.message = "Hello, world!";
        Fruits f = new Fruits();
        List<String> fruits = f.getFruits();

        return ok(views.html.index.render(bean, fruits));
    }

    public Result requestGet(String value) {
        return ok(views.html.get.render(value));
    }
}
