
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dd/Prac/notes/notespot/conf/routes
// @DATE:Mon Jul 24 22:49:18 IST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:17
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def signup(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/signup")
    }
  
    // @LINE:19
    def login(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/login")
    }
  
  }

  // @LINE:6
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def at(file:String): Call = {
    
      (file: @unchecked) match {
      
        // @LINE:6
        case (file) if file == "html/index.html" =>
          implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"), ("file", "html/index.html")))
          Call("GET", _prefix)
      
        // @LINE:11
        case (file) if file == "html/about1.html" =>
          implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"), ("file", "html/about1.html")))
          Call("GET", _prefix + { _defaultPrefix } + "about")
      
        // @LINE:12
        case (file) if file == "html/home.html" =>
          implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"), ("file", "html/home.html")))
          Call("GET", _prefix + { _defaultPrefix } + "home")
      
        // @LINE:13
        case (file) if file == "html/contact1.html" =>
          implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"), ("file", "html/contact1.html")))
          Call("GET", _prefix + { _defaultPrefix } + "contact")
      
        // @LINE:14
        case (file) if file == "html/login.html" =>
          implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"), ("file", "html/login.html")))
          Call("GET", _prefix + { _defaultPrefix } + "login")
      
        // @LINE:15
        case (file) if file == "html/signup.html" =>
          implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"), ("file", "html/signup.html")))
          Call("GET", _prefix + { _defaultPrefix } + "signup")
      
      }
    
    }
  
    // @LINE:9
    def versioned(file:Asset): Call = {
      implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
