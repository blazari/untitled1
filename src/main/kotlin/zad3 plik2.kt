import java.util.*

fun main() {
    val klawiatura = Scanner(System.`in`)
    print("Witaj w programie w którym sprawdzisz swoje BMI!\nPodaj swoja wage:\n")
    val waga = klawiatura.nextDouble()
    print("Podaj swój wzrost:\n")
    val wzrost = klawiatura.nextDouble()
    val bmi = waga/wzrost*wzrost
    if (bmi<18.5) {
        print("Masz niedowage")
    }else if (18.5<bmi && bmi<25){
        print("Twoja waga jest odpowiednia")
    }else {
        print("Masz nadwage")
    }
}