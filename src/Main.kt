import java.time.LocalDate

fun calNextFullMoon(currentDate: LocalDate): LocalDate {
    return currentDate.plusDays(29)
}

fun main() {
    val currentDate = LocalDate.now()
    val nextFullMoon = calNextFullMoon(currentDate)
    println("The current date is: $currentDate")
    println("The next full moon will be on: $nextFullMoon")
}