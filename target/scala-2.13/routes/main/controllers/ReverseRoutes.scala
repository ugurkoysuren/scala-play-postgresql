// @GENERATOR:play-routes-compiler
// @SOURCE:/home/qimia02/Documents/Projects/Scala-101/conf/routes
// @DATE:Tue Jan 14 08:47:54 EET 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:11
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:6
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def getPersons(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "persons")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:7
    def addPerson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "person")
    }
  
  }


}
