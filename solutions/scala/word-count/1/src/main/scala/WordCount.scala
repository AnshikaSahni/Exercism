case class WordCount(input: String)  {
  def countWords:Map[String,Int] ={
    val pattern = """[a-zA-Z]+'[a-zA-Z]+|[a-zA-Z]+|\d+""".r 
    val tokens = pattern.findAllIn(input).map(_.toLowerCase).toSeq
     val resultCounts = tokens.groupBy(identity).view.mapValues(_.size).toMap
    resultCounts
  }
}