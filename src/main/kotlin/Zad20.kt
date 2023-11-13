import java.util.*

fun main() {
    val klawiatura = Scanner(System.`in`)
    println("Podaj ilosc ciasteczek ktora chcesz zrobic")
    val iloscCiastek = klawiatura.nextDouble()
    val cukier = iloscCiastek*1.5/48
    val maslo = iloscCiastek*1/48
    val maka = iloscCiastek*2.75/48
    println("Do zrobienia takiej ilosci ciastek potrzebujesz:")
    println("$cukier szklanki cukru")
    println("$maslo szklanki masla")
    println("$maka szklanki maki")
}