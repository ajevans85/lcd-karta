package bbc.test

class PanelTwo {

  val digits =
    Seq("._." , "|.|" , "|_|") ::
    Seq("..." , "..|" , "..|") ::
    Seq("._." , "._|" , "|_.") ::
    Seq("._." , "._|" , "._|") ::
    Seq("..." , "|_|" , "..|") ::
    Seq("._." , "|_." , "._|") ::
    Seq("._." , "|_." , "|_|") ::
    Seq("._." , "..|" , "..|") ::
    Seq("._." , "|_|" , "|_|") ::
    Seq("._." , "|_|" , "..|") ::
    Nil


  def display(num : Int) : String = Seq(0, 1, 2).map { row =>
      String.valueOf(num).map {digit => digits(digit.toString.toInt)(row)} mkString " "
    } mkString "\n"


}
