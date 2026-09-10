import User

object Main {
    def main(args: Array[String]): Unit = {
        val userName = User.getUserName
        println(s"Hello, $userName!")
    }
} 