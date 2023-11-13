import java.util.*

fun main() {
    val klawiatura = Scanner(System.`in`)
    print("Podaj mase obiektu\n")
    val masa = klawiatura.nextDouble()
    val ciezar = masa*9.8
    if (ciezar>1000){
        print("Obiekt jest zbyt ciężki")
    }else if (ciezar<10){
        print("Obiekt jest zbyt lekki")
    }
}