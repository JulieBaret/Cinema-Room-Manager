fun main() {
    val size = readln().toInt() // number of companies
    val companyIncomeList = MutableList(size) { readln().toInt() } // list of company incomes
    val taxPercentageList = MutableList(size) { readln().toInt() } // list of tax percentage
    // output the number of the company that pays the largest tax (starting from 1)
    var result: Int = 0 // initialization
    var taxToCompare: Int = 0 // initialization
    for (index in companyIncomeList.indices) {
        val taxToPay = companyIncomeList[index] * taxPercentageList[index] // calculating for each company
        if (taxToPay > taxToCompare) { // only keep the higher tax to pay
            taxToCompare = taxToPay // update the payment to compare
            result = index + 1 // update the result
        }
    }
    print(result)
}

/* quicker !

fun main() {
    val companies = MutableList(readLine()!!.toInt()) { readLine()!!.toInt() }
    for (i in companies.indices) {
        companies[i] *= readLine()!!.toInt()
    }
    println(companies.indexOf(companies.maxOrNull()) + 1)
}

 */