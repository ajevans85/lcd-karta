package bbc.test

class PanelTwo {

  val digits = Array(
    Array("._." , "|.|" , "|_|"),
    Array("..." , "..|" , "..|"),
    Array("._." , "._|" , "|_."),
    Array("._." , "._|" , "._|"),
    Array("..." , "|_|" , "..|"),
    Array("._." , "|_." , "._|"),
    Array("._." , "|_." , "|_|"),
    Array("._." , "..|" , "..|"),
    Array("._." , "|_|" , "|_|"),
    Array("._." , "|_|" , "..|")
  )

  def display(num : Int) : String = {
    Seq(0, 1, 2).map { row =>
      String.valueOf(num).map {digit => digits(digit.toString.toInt)(row)} mkString " "
    } mkString "\n"
  }

}
