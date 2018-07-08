package controllers;

import models.Fruits;
import models.beans.HomeBeans;
import play.mvc.*;

import javax.swing.text.View;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
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
