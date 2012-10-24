package com.thenetcircle.services

import cucumber.runtime.{ EN, ScalaDsl }
import org.scalatest.matchers.ShouldMatchers

class OrderSteps extends ScalaDsl with EN with ShouldMatchers {

  var user = null

  Given("I am an user is from community '(.+)'$") { //(communityName:String) => 
    //  user = User("test-user", Community(communityName)) 
  }

  When("I order the product (\\d+)$") {}

  Then("I can see the order is in my order chart") {}

}
