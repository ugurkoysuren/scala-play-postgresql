// @GENERATOR:play-routes-compiler
// @SOURCE:/home/qimia02/Documents/Projects/Scala-101/conf/routes
// @DATE:Tue Jan 14 08:47:54 EET 2020


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
