package testing

import org.scalacheck.Prop._
import org.scalacheck._

object PropsTest extends Properties("test issue") {

  property("it should fail") =
    forAll(Gen.alphaStr){ str =>
      false
    }

  property("it should pass") =
    forAll(Gen.alphaStr){ str =>
      true
    }
}
