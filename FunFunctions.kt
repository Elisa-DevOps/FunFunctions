//Project: Fun Functions Kotlin Project
//Purpose: Create functions that are fun to call/ invoke
//Author: Elisa Aldridge

fun smores() {
    println("Roast a marshmallow.")
    println("Place marshmallow on a graham cracker.")
    println("Place chocolate on marshmallow.")
    println("Put a new graham cracker on chocolate.")
    println("Enjoy!")
  }

fun noSmores() {
    println("I'm sorry to hear you don't want to learn to make a smore.")
}

fun greeting() {
    println("Hello Friend, Happy October 1st")
    println("Would you like to learn to make a Smore? y/n")
}

fun pumpkin() {
    println("                  @@@")
    println("                   @@@")
    println("                    @@@                       H A P P Y")
    println("                    @@@")
    println("           @@@@@@@@@@@@@@@@@@@@@@         H A L L O W E E N")
    println("         @@@@@@@@@@@@@@@@@@@@@@@@@@")
    println("       @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@")
    println("     @@@@@@@@ @@@@@@@@@@@@@@@@ @@@@@@@@")
    println("   @@@@@@@@@   @@@@@@@@@@@@@@   @@@@@@@@@")
    println(" @@@@@@@@@@     @@@@@@@@@@@@     @@@@@@@@@@")
    println("@@@@@@@@@@       @@@@  @@@@       @@@@@@@@@@")
    println("@@@@@@@@@@@@@@@@@@@@    @@@@@@@@@@@@@@@@@@@@")
    println("@@@@@@@@@@@@@@@@@@        @@@@@@@@@@@@@@@@@@")
    println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@")
    println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@")
    println("@@@@@@@@@ @@@@@@@@@@@@@@@@@@@@@@@@ @@@@@@@@@")
    println(" @@@@@@@@  @@ @@ @@ @@ @@ @@ @@ @  @@@@@@@@")
    println("   @@@@@@@                        @@@@@@@")
    println("     @@@@@@  @@ @@ @@ @@ @@ @@ @ @@@@@@")
    println("      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@")
    println("        @@@@@@@@@@@@@@@@@@@@@@@@@@")
    println("          @@@@@@@@@@@@@@@@@@@@@@")
}
  
  
  fun main() {
    greeting()

    //user asked if wants recipe for smore
    var x = readLine()
    println(x)
    if (x == "y" || x == "yes" || x == "ye") {
        smores()
    } else if (x == "n" || x == "no") {
        noSmores()
    }
    pumpkin()
  }
  