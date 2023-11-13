import java.util.Scanner

fun main() {
    val klawiatura = Scanner(System.`in`)
    println("Podaj wynik z pierwszego testu:")
    val pierwszyTest = klawiatura.nextDouble()
    println("Podaj wynik z drugiego testu")
    val drugiTest = klawiatura.nextDouble()
    println("Podaj wynik z trzeciego testu")
    val trzeciTest = klawiatura.nextDouble()

    val srednia = (pierwszyTest+drugiTest+trzeciTest)/3
    println("Wynik z pierwszego testu wynosi: $pierwszyTest")
    println("Wynik z drugiego testu wynosi: $drugiTest")
    println("Wynik z trzeciego testu wynosi: $trzeciTest")
    println("Srednia z wszystkich tych testow wynosi $srednia")

}