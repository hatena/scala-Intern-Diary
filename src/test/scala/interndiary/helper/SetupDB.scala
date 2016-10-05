package interndiary.helper

import org.scalatest.{FunSpec, BeforeAndAfterAll}
import interndiary.repository.Context

trait SetupDB extends BeforeAndAfterAll { self: FunSpec =>
  implicit lazy val ctx = Context.createContext
  override def beforeAll(): Unit = {
    Context.setup("db.default")
    super.beforeAll()
  }
  override def afterAll(): Unit = {
    Context.destroy
    super.afterAll()
  }
}
