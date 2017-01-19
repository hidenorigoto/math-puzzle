object Q01 {
  def main (args: Array[String]): Unit = {
    val n = Stream from 10

    val result = n.filter(n => isReversible10(n) && isReversible2(n) && isReversible8(n))
                    .take(1)(0)
    println(result.toString)
  }

  def isReversible10(n: Int): Boolean = {
    val nStr = n.toString

    nStr == nStr.reverse
  }
  def isReversible2(n: Int): Boolean = {
    val nStr = n.toBinaryString

    nStr == nStr.reverse
  }
  def isReversible8(n: Int): Boolean = {
    val nStr = n.toOctalString

    nStr == nStr.reverse
  }
}