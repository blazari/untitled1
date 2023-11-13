import java.util.*

fun main() {
    val klawiatura = Scanner(System.`in`)
    print("Podaj liczbe kalori w produkcie:\n")
    val kalorie = klawiatura.nextDouble()
    print("Podaj liczbe gramow tłuszczu w produkcie\n")
    val gramTluszczu = klawiatura.nextDouble()
    val kaloriezTluszczu = gramTluszczu*9/100
    print("Procent kalori z tluszczu wynosi $kaloriezTluszczu%")

}