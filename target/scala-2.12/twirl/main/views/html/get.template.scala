
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object get extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(value: String = "Empty"):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>GET Request</title>
</head>
<body>
    ["""),_display_(/*9.7*/value),format.raw/*9.12*/("""]
</body>
</html>
"""))
      }
    }
  }

  def render(value:String): play.twirl.api.HtmlFormat.Appendable = apply(value)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (value) => apply(value)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Jul 08 22:07:44 JST 2018
                  SOURCE: D:/workspace/playtest/app/views/get.scala.html
                  HASH: fa2208bb77a0915fd95f10b8cf9c8fadbbb361e6
                  MATRIX: 946->1|1066->26|1094->28|1245->154|1270->159
                  LINES: 28->1|33->1|34->2|41->9|41->9
                  -- GENERATED --
              */
          