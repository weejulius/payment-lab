package com.thenetcircle.services

import org.scalatest.matchers.ShouldMatchers
import cucumber.api.scala.{ ScalaDsl, EN }

class OrderSteps extends ScalaDsl with EN with ShouldMatchers {

  var user = null

  Given("I am an user is from community '(.+)'$") {

  }

  When("I order the product (\\d+)$") {}

  Then("I can see the order is in my order chart") {}

}
