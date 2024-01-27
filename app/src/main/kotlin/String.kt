fun main() {
    val text = "Deani"
    var firstChar = text[0]

    println("Kata pertama pada kalimat " + text + " Ialah $firstChar")

    for (char in text) {
        print(" $char ")
    }
}