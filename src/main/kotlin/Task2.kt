fun main() {

    val result = commission("Maestro", pay=80000)

    if (result != -33.33)
        println("Ваша комиссия за перевод: $result")
    else
        println("Вы превысили лимиты")
}

fun commission(paySystem: String = "VK Pay", payIntoMonth: Int = 0, pay: Int): Double {

    val monthPay = payIntoMonth + pay
    val limitMonthMax = 600_000
    val limitMonthVkMax = 40_000
    val limitDayMax = 150_000
    val limitDayVkMax = 15_000

    return when (paySystem) {
        "Mastercard", "Maestro" -> {
            if (pay <= limitDayMax && monthPay <= limitMonthMax) {
                if (monthPay < 75000) 0.0 else (pay / 100 * 0.6) + 20
            } else -33.33
        }

        "Visa", "Mir" -> {
            if (pay <= limitDayMax && monthPay <= limitMonthMax) {
                val feeMinimum = 35
                val fee = (pay / 100) * 0.75
                return (if (fee < feeMinimum) feeMinimum else fee).toDouble()
            } else -33.33
        }

        else -> {    //VK pay
            if (pay <= limitDayVkMax && monthPay <= limitMonthVkMax) {
                0.0
            } else -33.33
        }
    }
}