 import scala.math.Ordering.Implicits.seqOrdering
class School {
  type DB = Map[Int, Seq[String]]

  var students:DB = Map.empty[Int, Seq[String]]

  def add(name: String, g: Int) = {
    students= students + (g -> (students.getOrElse(g,Seq.empty[String])++ Seq(name)))
  }

  def db: DB = {
    students
  }

  def grade(g: Int): Seq[String] = {
    students.getOrElse(g,Seq.empty[String])
  }

  def sorted: DB = {
    students.toSeq.sortBy(_._1).map{ case(a,b) => 
      (a,b.sorted)
    }.toMap
  }
}

