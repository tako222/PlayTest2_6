// @GENERATOR:play-routes-compiler
// @SOURCE:D:/workspace/playtest/conf/routes
// @DATE:Sun Jul 08 22:05:22 JST 2018


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
