object Grains {
  def square(squareNum:Int):Option[BigInt] = {
    squareNum match {
      case n if (n <= 0 || n > 64) => None
      case n if n >= 1 => Some(BigInt(2).pow(n-1))
    }
  }
  def total: BigInt = {
  (for (i <- 1 to 64) yield BigInt(2).pow(i - 1)).sum
}
}