import java.util.*

fun main() {
    val klawiatura = Scanner(System.`in`)
    print("Podaj wage przesylki(w kilogramach):\n")
    val waga = klawiatura.nextDouble()
    println("Podaj odleglosc do wyslania przesylki:")
    val odleglosc = klawiatura.nextDouble()
    val liczenie = odleglosc/500
    val kilo = 1.10
    val dwakilo = 2.20
    val trzy = 3.70
    val cztery = 3.80
    if(liczenie<2){
        if (waga<=1){
            println("Koszt przesylki wynosi 1,10zł")
        }else if (waga>1 && waga<=3){
            println("Koszt przesylki wynosi 2,20zł")
        }else if (waga>3 && waga<=5){
            println("Koszt przesylki wynosi 3,70zł")
        }
        else if (waga>5) {
            println("Koszt przesylki wynosi 3,80zł")
        }
        }else if (liczenie>=2) {
            if (waga <= 1) {
                println("Koszt przesylki wynosi 2,20zł")
            } else if (waga > 1 && waga <= 3) {
                println("Koszt przesylki wynosi 4,40zł")
            } else if (waga > 3 && waga <= 5) {
                println("Koszt przesylki wynosi 7,40zł")
            } else if (waga > 5) {
                println("Koszt przesylki wynosi 7,60zł")
            }
        }
}