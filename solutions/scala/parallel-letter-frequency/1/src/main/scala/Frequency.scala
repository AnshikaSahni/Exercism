object Frequency {
  def frequency(numWorkers: Int, texts: Seq[String]): Map[Char, Int] = {
     val pattern = """\p{L}""".r
    val result = texts.flatMap { case (token) => 
      pattern.findAllIn(token).map(_.toLowerCase).mkString("")
    }
    val resultCounts = result.groupBy(identity).view.mapValues(_.size).toMap
   resultCounts
  }
}
