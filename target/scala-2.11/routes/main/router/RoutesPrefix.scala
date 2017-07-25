
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dd/Prac/notes/notespot/conf/routes
// @DATE:Tue Jul 25 10:10:53 IST 2017


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
