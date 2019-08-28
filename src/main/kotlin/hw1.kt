fun main() {
    val exclusive = false
    val amount = 200 // стоимость текущей продажи
    val total = 11_000 // сумма предыдущих продаж
    val fee = calculateFee(amount, total, exclusive)  // exclusive по умолчанию = false
    println(fee) // 40
    }

    fun calculateFee (amount: Int, total: Int, exclusive: Boolean): Any {
        var procent: Int = 0
        if (total in 0..1000) procent = 30
        if (total in 1001..10_000) procent = 25
        if (total in 10_001..50_000) procent = 20
        if (total >=50_001) procent = 15
        if (exclusive) procent == - 5
        return amount * procent / 100
    }