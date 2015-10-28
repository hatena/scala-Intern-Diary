package interndiary.web

import org.scalatra._

class DiaryWeb extends DiaryWebStack  {
  get("/") {
    interndiary.html.index(msg = "Write your best diary, please!")
  }
}
