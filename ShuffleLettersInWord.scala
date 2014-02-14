import scala.language.postfixOps

object LetterShuffler {

  def shuffle(word: String): String =
    if (word.length <= 2) 
      word 
    else 
      word.head + scala.util.Random.shuffle(word.substring(1, word.length - 1) toList).mkString + word.last

  def main(args: Array[String]) {
     val result = if (args.size == 1) shuffle(args(0))
                  else shuffle("You can provide an argument.")
     
     println(result)
  }
    
}
