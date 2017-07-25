
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dd/Prac/notes/notespot/conf/routes
// @DATE:Tue Jul 25 10:10:53 IST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:19
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def signup(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/signup")
    }
  
    // @LINE:21
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
    def at(): Call = {
    
      () match {
      
        // @LINE:6
        case ()  =>
          implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"), ("file", "html/index.html")))
          Call("GET", _prefix)
      
      }
    
    }
  
    // @LINE:9
    def versioned(file:Asset): Call = {
      implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
