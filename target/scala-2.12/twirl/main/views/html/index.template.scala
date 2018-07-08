
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.beans.HomeBeans,List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(bean: models.beans.HomeBeans, fruits: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.54*/("""

"""),_display_(/*3.2*/main(bean.title)/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
  """),format.raw/*4.3*/("""<h1>"""),_display_(/*4.8*/bean/*4.12*/.pageTitle),format.raw/*4.22*/("""</h1>
  <p>"""),_display_(/*5.7*/bean/*5.11*/.message),format.raw/*5.19*/("""</p>
  <ul>
      """),_display_(/*7.8*/for(fruit <- fruits) yield /*7.28*/ {_display_(Seq[Any](format.raw/*7.30*/("""
          """),_display_(/*8.12*/if(fruit.length() > 0)/*8.34*/ {_display_(Seq[Any](format.raw/*8.36*/("""
            """),format.raw/*9.13*/("""<li>
                <a href="/get?test="""),_display_(/*10.37*/fruit),format.raw/*10.42*/("""">
                    """),_display_(/*11.22*/fruit),format.raw/*11.27*/("""
                """),format.raw/*12.17*/("""</a>
            </li>
          """)))}),format.raw/*14.12*/("""
      """)))}),format.raw/*15.8*/("""
  """),format.raw/*16.3*/("""</ul>
""")))}),format.raw/*17.2*/("""
"""))
      }
    }
  }

  def render(bean:models.beans.HomeBeans,fruits:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(bean,fruits)

  def f:((models.beans.HomeBeans,List[String]) => play.twirl.api.HtmlFormat.Appendable) = (bean,fruits) => apply(bean,fruits)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Jul 08 22:24:34 JST 2018
                  SOURCE: D:/workspace/playtest/app/views/index.scala.html
                  HASH: fda76fac7128cb1b4e481f93da7f4d1b52c598b2
                  MATRIX: 977->1|1124->53|1154->58|1178->74|1217->76|1247->80|1277->85|1289->89|1319->99|1357->112|1369->116|1397->124|1443->145|1478->165|1517->167|1556->180|1586->202|1625->204|1666->218|1735->260|1761->265|1813->290|1839->295|1885->313|1952->349|1991->358|2022->362|2060->370
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|36->4|36->4|36->4|37->5|37->5|37->5|39->7|39->7|39->7|40->8|40->8|40->8|41->9|42->10|42->10|43->11|43->11|44->12|46->14|47->15|48->16|49->17
                  -- GENERATED --
              */
          