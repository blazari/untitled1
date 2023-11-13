import java.util.*

fun main() {
    val klawiatura = Scanner(System.`in`)
    print("Witaj!\nW tym programie sprawdzisz czy data jest magiczna\nPodaj dzień\n")
    val dzien = klawiatura.nextInt()
    print("Podaj numer miesiac:\n")
    val miesiac = klawiatura.nextInt()
    print("Podaj dwie ostatnie cyfry roku:\n")
    val rok = klawiatura.nextInt()
    val sprawdzenie = dzien*miesiac
    if(sprawdzenie==rok){
        print("Data jest magiczna!")
    }else{
        print("Data nie jest magiczna :(")
    }


}