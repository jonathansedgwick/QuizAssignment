fun main() {
    var correct = 0

    print("What color is an apple: ")
    var answer = readln()!!.toString()
    if (answer.equals("Red", true)) {
        println("Correct")
        correct++
    }
    else
        println("Incorrect")

    print("What state is Chicago in: ")
    answer = readln()!!.toString()
    if (answer.equals("Illinois", true)) {
        println("Correct")
        correct++
    }
    else
        println("Incorrect")

    print("Who is the current president: ")
    answer = readln()!!.toString()
    if (answer.equals("Joe Biden", true)) {
        println("Correct")
        correct++
    }
    else
        println("Incorrect")

    print("Which is larger; a pen or an elephant: ")
    answer = readln()!!.toString()
    if (answer.equals("Elephant", true)) {
        println("Correct")
        correct++
    }
    else
        println("Incorrect")

    print("What is 5 + 5: ")
    answer = readln()!!.toString()
    if (answer.equals("5", true)) {
        println("Correct")
        correct++
    }
    else
        println("Incorrect")

    println("You got $correct/5 correct")

}