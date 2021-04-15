package pgt.app

import scala.annotation.nowarn
import com.softwaremill.macwire.wire
import play.api.{ Application, ApplicationLoader, BuiltInComponentsFromContext }
import play.api.routing.Router
import router.Routes

final class AppLoader extends ApplicationLoader {
  def load(ctx: ApplicationLoader.Context): Application = new AppComponents(ctx).application
}

final class AppComponents(ctx: ApplicationLoader.Context) 
  extends BuiltInComponentsFromContext(ctx) 
  with play.filters.HttpFiltersComponents
  with controllers.AssetsComponents
{
  lazy val home = wire[controllers.HomeController]

  val graalTest = new GraalTest
  graalTest.run()

  val router: Router = {
    @nowarn val prefix: String = "/"
    wire[Routes]
  }
}
