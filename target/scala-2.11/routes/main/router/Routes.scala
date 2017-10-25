
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dd/Prac/notes/notespot/conf/routes
// @DATE:Tue Oct 24 17:39:27 IST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Assets_2: controllers.Assets,
  // @LINE:19
  LoginController_1: controllers.LoginController,
  // @LINE:30
  AdminController_0: controllers.AdminController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Assets_2: controllers.Assets,
    // @LINE:19
    LoginController_1: controllers.LoginController,
    // @LINE:30
    AdminController_0: controllers.AdminController
  ) = this(errorHandler, Assets_2, LoginController_1, AdminController_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Assets_2, LoginController_1, AdminController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Assets.at(path:String = "/public", file:String = "html/index.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """about""", """controllers.Assets.at(path:String = "/public", file:String = "html/index.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """index""", """controllers.Assets.at(path:String = "/public", file:String = "html/index.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home""", """controllers.Assets.at(path:String = "/public", file:String = "html/index.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contact""", """controllers.Assets.at(path:String = "/public", file:String = "html/index.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """notespot""", """controllers.Assets.at(path:String = "/public", file:String = "html/upload.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Assets.at(path:String = "/public", file:String = "html/index.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin""", """controllers.Assets.at(path:String = "/public", file:String = "html/admin.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.Assets.at(path:String = "/public", file:String = "html/index.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/notespot""", """controllers.LoginController.check(username:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/signup""", """controllers.LoginController.signup"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/login""", """controllers.LoginController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/upload""", """controllers.LoginController.upload"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/uploadFiles""", """controllers.LoginController.getfiles"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/addAdmin""", """controllers.AdminController.addAdmin"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Assets_at0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Assets_at0_invoker = createInvoker(
    Assets_2.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Assets_at2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("about")))
  )
  private[this] lazy val controllers_Assets_at2_invoker = createInvoker(
    Assets_2.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """about""",
      """Handling Html						""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Assets_at3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("index")))
  )
  private[this] lazy val controllers_Assets_at3_invoker = createInvoker(
    Assets_2.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """index""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_at4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home")))
  )
  private[this] lazy val controllers_Assets_at4_invoker = createInvoker(
    Assets_2.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """home""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Assets_at5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contact")))
  )
  private[this] lazy val controllers_Assets_at5_invoker = createInvoker(
    Assets_2.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """contact""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Assets_at6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("notespot")))
  )
  private[this] lazy val controllers_Assets_at6_invoker = createInvoker(
    Assets_2.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """notespot""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Assets_at7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Assets_at7_invoker = createInvoker(
    Assets_2.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Assets_at8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin")))
  )
  private[this] lazy val controllers_Assets_at8_invoker = createInvoker(
    Assets_2.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """admin""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Assets_at9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_Assets_at9_invoker = createInvoker(
    Assets_2.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """signup""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_LoginController_check10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/notespot")))
  )
  private[this] lazy val controllers_LoginController_check10_invoker = createInvoker(
    LoginController_1.check(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "check",
      Seq(classOf[String]),
      "GET",
      this.prefix + """api/notespot""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_LoginController_signup11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/signup")))
  )
  private[this] lazy val controllers_LoginController_signup11_invoker = createInvoker(
    LoginController_1.signup,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "signup",
      Nil,
      "POST",
      this.prefix + """api/signup""",
      """signup""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_LoginController_login12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/login")))
  )
  private[this] lazy val controllers_LoginController_login12_invoker = createInvoker(
    LoginController_1.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "POST",
      this.prefix + """api/login""",
      """login""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_LoginController_upload13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/upload")))
  )
  private[this] lazy val controllers_LoginController_upload13_invoker = createInvoker(
    LoginController_1.upload,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "upload",
      Nil,
      "POST",
      this.prefix + """api/upload""",
      """upload""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_LoginController_getfiles14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/uploadFiles")))
  )
  private[this] lazy val controllers_LoginController_getfiles14_invoker = createInvoker(
    LoginController_1.getfiles,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "getfiles",
      Nil,
      "GET",
      this.prefix + """api/uploadFiles""",
      """get notes""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_AdminController_addAdmin15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/addAdmin")))
  )
  private[this] lazy val controllers_AdminController_addAdmin15_invoker = createInvoker(
    AdminController_0.addAdmin,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "addAdmin",
      Nil,
      "POST",
      this.prefix + """api/addAdmin""",
      """GET /second									controllers.Assets.at(path="/public", file="html/index.html")""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Assets_at0_route(params) =>
      call(Param[String]("path", Right("/public")), Param[String]("file", Right("html/index.html"))) { (path, file) =>
        controllers_Assets_at0_invoker.call(Assets_2.at(path, file))
      }
  
    // @LINE:9
    case controllers_Assets_versioned1_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_2.versioned(path, file))
      }
  
    // @LINE:11
    case controllers_Assets_at2_route(params) =>
      call(Param[String]("path", Right("/public")), Param[String]("file", Right("html/index.html"))) { (path, file) =>
        controllers_Assets_at2_invoker.call(Assets_2.at(path, file))
      }
  
    // @LINE:12
    case controllers_Assets_at3_route(params) =>
      call(Param[String]("path", Right("/public")), Param[String]("file", Right("html/index.html"))) { (path, file) =>
        controllers_Assets_at3_invoker.call(Assets_2.at(path, file))
      }
  
    // @LINE:13
    case controllers_Assets_at4_route(params) =>
      call(Param[String]("path", Right("/public")), Param[String]("file", Right("html/index.html"))) { (path, file) =>
        controllers_Assets_at4_invoker.call(Assets_2.at(path, file))
      }
  
    // @LINE:14
    case controllers_Assets_at5_route(params) =>
      call(Param[String]("path", Right("/public")), Param[String]("file", Right("html/index.html"))) { (path, file) =>
        controllers_Assets_at5_invoker.call(Assets_2.at(path, file))
      }
  
    // @LINE:15
    case controllers_Assets_at6_route(params) =>
      call(Param[String]("path", Right("/public")), Param[String]("file", Right("html/upload.html"))) { (path, file) =>
        controllers_Assets_at6_invoker.call(Assets_2.at(path, file))
      }
  
    // @LINE:16
    case controllers_Assets_at7_route(params) =>
      call(Param[String]("path", Right("/public")), Param[String]("file", Right("html/index.html"))) { (path, file) =>
        controllers_Assets_at7_invoker.call(Assets_2.at(path, file))
      }
  
    // @LINE:17
    case controllers_Assets_at8_route(params) =>
      call(Param[String]("path", Right("/public")), Param[String]("file", Right("html/admin.html"))) { (path, file) =>
        controllers_Assets_at8_invoker.call(Assets_2.at(path, file))
      }
  
    // @LINE:18
    case controllers_Assets_at9_route(params) =>
      call(Param[String]("path", Right("/public")), Param[String]("file", Right("html/index.html"))) { (path, file) =>
        controllers_Assets_at9_invoker.call(Assets_2.at(path, file))
      }
  
    // @LINE:19
    case controllers_LoginController_check10_route(params) =>
      call(params.fromQuery[String]("username", None)) { (username) =>
        controllers_LoginController_check10_invoker.call(LoginController_1.check(username))
      }
  
    // @LINE:22
    case controllers_LoginController_signup11_route(params) =>
      call { 
        controllers_LoginController_signup11_invoker.call(LoginController_1.signup)
      }
  
    // @LINE:24
    case controllers_LoginController_login12_route(params) =>
      call { 
        controllers_LoginController_login12_invoker.call(LoginController_1.login)
      }
  
    // @LINE:26
    case controllers_LoginController_upload13_route(params) =>
      call { 
        controllers_LoginController_upload13_invoker.call(LoginController_1.upload)
      }
  
    // @LINE:28
    case controllers_LoginController_getfiles14_route(params) =>
      call { 
        controllers_LoginController_getfiles14_invoker.call(LoginController_1.getfiles)
      }
  
    // @LINE:30
    case controllers_AdminController_addAdmin15_route(params) =>
      call { 
        controllers_AdminController_addAdmin15_invoker.call(AdminController_0.addAdmin)
      }
  }
}
