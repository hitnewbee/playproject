package controllers
import play.api.mvc.{Action, Controller}

class Application extends Controller{

  def index= Action{
    Redirect("/cloud")
  }

  def login=Action.async{request =>
    controllers.Assets.at(path="/public/web","index.html")(request)
  }

  def defaultUrlMatcher(file:String) = Action{
    if (file.endsWith("/")){
      Redirect("/"+file.substring(0,file.length-1))
    }else{
      NotFound("")
    }
  }
}
