
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
import play.api.mvc._
import play.api.data._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[CreatePersonForm],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(person: Form[CreatePersonForm])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/request/*5.9*/.flash.get("success").map/*5.34*/ { key =>_display_(Seq[Any](format.raw/*5.43*/("""
   """),_display_(/*6.5*/request/*6.12*/.messages(key)),format.raw/*6.26*/("""
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/main("Welcome to Play")/*9.25*/ {_display_(Seq[Any](format.raw/*9.27*/("""
  """),_display_(/*10.4*/form(routes.UserController.addPerson())/*10.43*/ {_display_(Seq[Any](format.raw/*10.45*/("""
		"""),_display_(/*11.4*/inputText(person("name"))),format.raw/*11.29*/("""
		"""),_display_(/*12.4*/inputText(person("age"))),format.raw/*12.28*/("""
		"""),_display_(/*13.4*/CSRF/*13.8*/.formField),format.raw/*13.18*/("""

		"""),format.raw/*15.3*/("""<div class="buttons">
			<input type="submit" value="Add Person"/>
		</div>
	""")))}),format.raw/*18.3*/("""
""")))}),format.raw/*19.2*/("""
"""))
      }
    }
  }

  def render(person:Form[CreatePersonForm],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(person)(request)

  def f:((Form[CreatePersonForm]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (person) => (request) => apply(person)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-01-14T08:47:55.168988
                  SOURCE: /home/qimia02/Documents/Projects/Scala-101/app/views/index.scala.html
                  HASH: 93e1244e3cf918cdf40390fc8a76a1423e4c7852
                  MATRIX: 767->1|913->77|957->75|984->93|1011->95|1025->102|1058->127|1104->136|1134->141|1149->148|1183->162|1214->164|1242->167|1273->190|1312->192|1342->196|1390->235|1430->237|1460->241|1506->266|1536->270|1581->294|1611->298|1623->302|1654->312|1685->316|1793->394|1825->396
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|29->5|30->6|30->6|30->6|31->7|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|36->12|36->12|37->13|37->13|37->13|39->15|42->18|43->19
                  -- GENERATED --
              */
          