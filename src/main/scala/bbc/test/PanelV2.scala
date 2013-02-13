package bbc.test

object PanelV2 {

  private val digits =
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


  private val panelRows = Seq(0, 1, 2)


  def display(num : Int) : String = panelRows.map { row =>
      num.toString.map {digit => digits(digit.getNumericValue)(row)} mkString " "
    } mkString "\n"


}
