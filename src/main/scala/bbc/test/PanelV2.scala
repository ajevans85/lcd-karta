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

  val panelRows = Seq(0, 1, 2)


  def display(num : Int) : String = panelRows.map { row =>
      String.valueOf(num).map {digit => digits(digit.toString.toInt)(row)} mkString " "
    } mkString "\n"


}
