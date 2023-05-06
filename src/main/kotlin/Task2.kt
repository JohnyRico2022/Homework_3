fun main() {
    val paySystem = "VK Pay"
    val pay = 1400

    val moneyTransfer = fee(paySystem, pay)

    println("Вы совершаете перевод на $pay руб.")
    println("Выша комиссия по платежной системе $paySystem составляет: $moneyTransfer руб.")
    println(limits(paySystem, pay))
    println(limitsMonth(paySystem, pay))


}

fun fee(paySystem: String, pay: Int): Double {
    return when (paySystem) {
        "Mastercard", "Maestro" -> {
            if (pay < 75000) 0.0 else (pay / 100 * 0.6) + 20
        }

        "Visa", "Mir" -> {
            val feeMinimum = 35
            val fee = (pay / 100) * 0.75

            return (if (fee < feeMinimum) feeMinimum else fee).toDouble()
        }

        else -> 0.0 //VK Pay

    }

}

fun limits(paySystem: String, pay: Int): String {
    val limitDayMax = 150_000
    val limitDayVkMax = 15_000

    when (paySystem) {
        "VK Pay" -> {
            if (pay <= limitDayVkMax)
                return "Операция успешна, дневные лимиты не превышены"
        }

        else -> {
            if (pay <= limitDayMax)
                return "Операция успешна, дневные лимиты не превышены"
        }
    }
    return "Превышены дневные лимиты"
}


fun limitsMonth(paySystem: String, pay: Int): String {
    val limitMonthMax = 600_000
    val limitMonthVkMax = 40_000
    val limitDayMax = 150_000
    val limitDayVkMax = 15_000

    when (paySystem) {
        "VK Pay" -> {
            val balance = limitMonthVkMax - pay
            return if (pay <= limitMonthVkMax && pay <= limitDayVkMax)
                "Ваш остаток по переводам в этом месяце составляет $balance руб. "
            else ""

        }

        else -> {

            val balance = limitMonthMax - pay
            return if (pay <= limitMonthMax && pay <= limitDayMax)

                "Ваш остаток по переводам в этом месяце составляет $balance руб. "
            else ""

        }
    }

    return ""
}