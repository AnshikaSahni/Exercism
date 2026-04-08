object Etl {
  def transform(scoreMap: Map[Int, Seq[String]]): Map[String, Int] = 
  scoreMap.flatMap{ case(point, letters) => 
    letters.map { letter => (letter.toLowerCase , point) } }
}
