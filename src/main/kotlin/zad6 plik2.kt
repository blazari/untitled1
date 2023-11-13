import java.util.*

fun main() {
    val klawiatura = Scanner(System.`in`)
    print("Podaj liczbe sekund\n")
    val sekundy = klawiatura.nextDouble()
    val minuta = Math.round(sekundy/60)
    val godzina = Math.round(sekundy/3600)
    val dzien = Math.round(sekundy/86400)
    print("$sekundy to $dzien dni, $godzina godzin, $minuta, minut")

}