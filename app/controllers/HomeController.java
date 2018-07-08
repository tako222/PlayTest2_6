package controllers;

import models.Fruits;
import models.beans.HomeBeans;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;
import java.util.Map;

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

    public Result requestGet() {
        Map<String, String[]> params = request().queryString();
        String value = null;
        if (params.containsKey("test")) {
            value = params.get("test")[0];
        }
        return ok(views.html.get.render(value));
    }
}
