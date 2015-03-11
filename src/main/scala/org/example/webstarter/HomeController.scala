package org.example.webstarter

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod}
/**
 * Created by anoel on 1/9/15.
 */
@Controller
@RequestMapping(Array("/"))
class HomeController {

  @RequestMapping(method = Array(RequestMethod.GET))
  def index (model: Model) = {
    model.addAttribute("name", "Amir Noel")
    "index"
  }
}
