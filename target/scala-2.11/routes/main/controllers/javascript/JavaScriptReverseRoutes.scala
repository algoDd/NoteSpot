
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dd/Prac/notespot/conf/routes
// @DATE:Sun Jul 23 16:34:29 IST 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
        
          if (file1 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("html/index.html") + """) {
            return _wA({method:"GET", url:"""" + _prefix + """"})
          }
        
          if (file1 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("html/about1.html") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "about"})
          }
        
          if (file1 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("html/home.html") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home"})
          }
        
          if (file1 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("html/contact1.html") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contact"})
          }
        
        }
      """
    )
  
    // @LINE:9
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
