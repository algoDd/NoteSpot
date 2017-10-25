
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dd/Prac/notes/notespot/conf/routes
// @DATE:Tue Oct 24 17:39:27 IST 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:19
  class ReverseLoginController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def upload: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.upload",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/upload"})
        }
      """
    )
  
    // @LINE:28
    def getfiles: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.getfiles",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/uploadFiles"})
        }
      """
    )
  
    // @LINE:22
    def signup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.signup",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/signup"})
        }
      """
    )
  
    // @LINE:19
    def check: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.check",
      """
        function(username0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/notespot" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("username", username0)])})
        }
      """
    )
  
    // @LINE:24
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.login",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/login"})
        }
      """
    )
  
  }

  // @LINE:30
  class ReverseAdminController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def addAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.addAdmin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/addAdmin"})
        }
      """
    )
  
  }

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
        
          if (file1 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("html/index.html") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "about"})
          }
        
          if (file1 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("html/index.html") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "index"})
          }
        
          if (file1 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("html/index.html") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home"})
          }
        
          if (file1 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("html/index.html") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contact"})
          }
        
          if (file1 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("html/upload.html") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "notespot"})
          }
        
          if (file1 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("html/index.html") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
          }
        
          if (file1 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("html/admin.html") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin"})
          }
        
          if (file1 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("html/index.html") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
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
