import java.util.*

fun main() {
    val klawiatura = Scanner(System.`in`)
    print("Podaj cyfre od 1 do 10:")
    val liczba = klawiatura.nextInt()
    if (liczba==1){
        print("Twoja licbza w zapisie rzymskim ma postac I")
    }else if(liczba==2){
        print("Twoja licbza w zapisie rzymskim ma postac II")
    }else if(liczba==3) {
        print("Twoja licbza w zapisie rzymskim ma postac III")
    }else if(liczba==4) {
        print("Twoja licbza w zapisie rzymskim ma postac IV")
    }else if(liczba==5) {
        print("Twoja licbza w zapisie rzymskim ma postac V")
    }else if(liczba==6) {
        print("Twoja licbza w zapisie rzymskim ma postac VI")
    }else if(liczba==7) {
        print("Twoja licbza w zapisie rzymskim ma postac VII")
    }else if(liczba==8) {
        print("Twoja licbza w zapisie rzymskim ma postac VIII")
    }else if(liczba==9) {
        print("Twoja licbza w zapisie rzymskim ma postac IX")
    }else if(liczba==10) {
        print("Twoja licbza w zapisie rzymskim ma postac X")
    }
}