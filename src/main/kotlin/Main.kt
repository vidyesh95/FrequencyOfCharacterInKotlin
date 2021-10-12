fun main(args: Array<String>) {
    val string = "Jack be nimble,Jack be quick\nJack jump over the candlestick"
    val char = 'n'
    var frequency = 0

    for (element in string) {
        if (char == element) {
            frequency += 1
        }
    }

    println("Frequency of $char : $frequency")
}