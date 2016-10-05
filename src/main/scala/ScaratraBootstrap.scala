import org.scalatra._
import javax.servlet.ServletContext
//import interndiary.service.Context
//import jp.ne.hatena.intern.scalatra.HatenaOAuth

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext): Unit = {
    //Context.setup("db.default")
    context.mount(new interndiary.web.DiaryWeb, "/*")
    //context.mount(new HatenaOAuth, "/auth")
  }

  override def destroy(context: ServletContext): Unit = {
    //Context.destroy()
  }
}
