package controllers;

import com.google.inject.Inject;
import controllers.forms.TestForm;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

public class FormController extends Controller {

    private Form<TestForm> form;

    @Inject
    public FormController(FormFactory formFactory) {
        this.form = formFactory.form(TestForm.class);
    }

    public Result index() {
        return ok(views.html.forms.form.render(form));
    }

    public Result requestPost() {
        Form<TestForm> testForm = form.bindFromRequest();
        TestForm tForm = testForm.get();
        return ok(views.html.forms.result.render(tForm));
    }
}
