fun main() {
    println("Wybierz: Powietrze; Woda; Stal")
    val slowo = readln().toString()
    println("Jaką odległość fala dźwiękowa ma przebyć w nośniku? Wartość podaj w metrach")
    val nosnik = readln().toDouble()

    when (slowo) {
        "Powietrze" -> println("Czas wynosi " + nosnik/343 +" s")
        "Woda" -> println("Czas wynosi " + nosnik/1490 +" s")
        "Stal" -> println("Czas wynosi " + nosnik/5100 +" s")
        else -> println("Niepoprawny wybór")
    }
}