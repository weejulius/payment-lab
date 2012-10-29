package com.thenetcircle.services

import org.specs2._
import specification._

class OrderProductSpec extends Specification {
  def is =

    "In order to get the payment service from  provider" ^ bt ^
      "As a community I want to generate an identifier for the payment" ^
      endp ^
      "Order a product" ^ br ^
      "Given an community ${com}" ^ anCommunity ^
      "When I fetch an identifier for a payment" ^ generateId ^
      "Then I should get an identifier ${1}" ^ result ^
      end

  object anCommunity extends Given[String] {
    def extract(name: String) = extract1(name)
  }

  object generateId extends When[String, String] {asdasd
    def extract(name: String, text: String) = "2"
  }

  object result extends Then[String] {
    def extract(result: String, expect: String) = result must_== extract1(expect)
  }

}
