import kotlin.math.pow

fun main() {
    println("Podaj kwotę zdeponowaną na koncie:")
    val kwota = readln().toDouble()
    println("Podaj roczną stopę oprocentowania np. 0.01:")
    val r = readln().toDouble()
    println("Ile razy w roku odsetki są naliczane od kapitału:")
    val n = readln().toDouble()
    println("Podaj okres czasu w latach:")
    val t = readln().toDouble()
    val A = kwota * (1 + r/n).pow(n*t)
    println("Stan konta po $t latach wynosi %.2f".format(A))
}