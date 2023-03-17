package cinema

fun main() {
    println("Enter the number of rows:")
    val rows = readln().toInt()
    
    println("Enter the number of seats in each row:")
    val seats = readln().toInt()

    //total of seats inside the cinema
    val totalSeats = rows * seats

    //saving the cinema arrangement
    val cinema = MutableList(rows) { MutableList(seats) { 'S' } }

    // total of purchased ticket
    var purchasedTickets = 0

    //income from purchased ticket
    var currentIncome = 0

    //total income from cinema size
    val totalIncome = if (rows * seats <= 60) 10 * totalSeats else ((totalSeats / 2) * 8 + (totalSeats / 2) * 10)


    //decompose code into functions
    fun showSeats () {
        // print the cinema arrangement
        print("\nCinema:\n ")
        for (i in 1..seats) print(" $i")
        print("\n")
        for (i in 1..rows) println("$i " + cinema[i - 1].joinToString(" "))
        print("\n")
    }

    fun buyTicket () {
        println("Enter a row number:")
        val rowNumber = readln().toInt()

        println("Enter a seat number in that row:")
        val seatNumber = readln().toInt()

        try {
            when (cinema[rowNumber - 1][seatNumber - 1]) {
                'B' -> {
                    println("That ticket has already been purchased!\n")
                    buyTicket()
                }
                'S' -> {
                    // update the cinema arrangement
                    cinema[rowNumber - 1][seatNumber - 1] = 'B'
                    ++purchasedTickets
                    //calculate the price
                    val ticketPrice = if (rows * seats <= 60) 10 else if (rowNumber > (rows / 2)) 8 else 10
                    currentIncome += ticketPrice
                    println("\nTicket price: $$ticketPrice\n")
                }
            }
        } catch (e: IndexOutOfBoundsException) {
            println("Wrong input!\n")
            buyTicket()
        }
    }

    fun showStats () {
        println("Number of purchased tickets: $purchasedTickets")
        val percent = purchasedTickets.toDouble() / totalSeats * 100
        val formatPercent = "%.2f".format(percent)
        println("Percentage: $formatPercent%")
        println("Current income: $$currentIncome")
        println("Total income: $$totalIncome\n")
    }

    //infinite loop
    var isPlaying = true
    while (isPlaying) {
        //print the menu
        println("1. Show the seats\n" +
                "2. Buy a ticket\n" +
                "3. Statistics\n" +
                "0. Exit\n")

        when (readln().toInt()) {
            1 -> showSeats()
            2 -> buyTicket()
            3 -> showStats()
            0 -> isPlaying = false
        }
    }

}
