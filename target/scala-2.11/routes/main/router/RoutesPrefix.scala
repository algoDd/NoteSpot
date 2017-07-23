
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dd/Prac/notespot/conf/routes
// @DATE:Sun Jul 23 16:34:29 IST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
