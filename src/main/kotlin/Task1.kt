fun main() {

    val time = 86400
    val result = agoToText(time)

    println("Пользователь был(а) $result")

}

fun agoToText(time: Int): String {
    return when (time) {
        in 0..60 -> "только что"
        in 61..60 * 60 -> {
            val mins = time / 60
            "в сети $mins ${minutes(time)} назад"
        }

        in 60 * 60 + 1..24 * 60 * 60 -> {
            val hour = time / 3600
            "в сети $hour ${hours(time)} назад"
        }

        in 24 * 60 * 60 + 1..2 * 24 * 60 * 60 -> "в сети вчера"
        in 2 * 24 * 60 * 60 + 1..3 * 24 * 60 * 60 -> "в сети позавчера"
        else -> "в сети давно"
    }
}

fun minutes(time: Int): String {

    val mins = time / 60
    return when (mins) {
        1, 21, 31, 41, 51 -> "минуту"
        in 2..4, in 22..24, in 32..34, in 42..44, in 52..54 -> "минуты"
        else -> "минут"
    }

}

fun hours(time: Int): String {
    val hour = time / 3600
    return when (hour) {
        1, 21 -> "час"
        in 2..4, in 22..24 -> "часа"
        else -> "часов"
    }

}







