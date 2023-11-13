import java.util.*

fun main() {
    val klawiatura = Scanner(System.`in`)
    print("Podaj wynik pierwszego testu\n")
    val pierwszy = klawiatura.nextDouble()
    print("Podaj wynik drugiego testu\n")
    val drugi = klawiatura.nextDouble()
    print("Podaj wynik trzeciego testu\n")
    val trzeci = klawiatura.nextDouble()
    val srednia = (pierwszy+drugi+trzeci)/3
    if(srednia>=90){
        print("Otrzymujesz ocene: 5")
    }else if (80<=srednia && srednia<=89){
        print("Otrzymujesz ocene: 4")
    }else if (srednia>=70 && srednia<=79){
        print("Otrzymujesz ocene: 3")
    }else if (srednia>=60 && srednia<=69){
        print("Otrzymujesz ocene: 2")
    }else if (srednia<60){
        print("Otrzymujesz ocene: 1")
    }
}