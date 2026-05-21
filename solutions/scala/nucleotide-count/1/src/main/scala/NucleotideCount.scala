class DNA(strand: String) {
  val allowedLetters = Set('A', 'C', 'G', 'T')

  def nucleotideCounts: Either[String, Map[Char, Int]] = {
    if (!strand.forall(allowedLetters.contains)) {
      Left("Invalid nucleotide in strand")
    } else {
      val baseMap: Map[Char, Int] = allowedLetters.map(_ -> 0).toMap
      val strandCounts = strand.groupBy(identity).view.mapValues(_.size).toMap
      
      val finalMap: Map[Char, Int] = baseMap ++ strandCounts
      
      Right(finalMap)
    }
  }
}
