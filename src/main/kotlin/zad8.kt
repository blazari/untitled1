import java.util.*

fun main() {
    val klawiatura = Scanner(System.`in`)
    print("Podaj ilość pakietów które zakupił*ś\n")
    val iloscPakietow = klawiatura.nextInt()
    val rabat1 = 99*iloscPakietow*0.20
    val rabat2 = 99*iloscPakietow*0.30
    val rabat3 = 99*iloscPakietow*0.40
    val rabat4 = 99*iloscPakietow*0.50
    if(iloscPakietow>=10 && iloscPakietow<=19){
        print("Zakupiles $iloscPakietow rabat wynosi 20% cena po rabacie $rabat1")
    }else if (iloscPakietow>=20 && iloscPakietow<=49){
        print("Zakupiles $iloscPakietow rabat wynosi 30% cena po rabacie $rabat2")
    }else if (iloscPakietow>=50 && iloscPakietow<=99){
        print("Zakupiles $iloscPakietow rabat wynosi 40% cena po rabacie $rabat3")
    }else if (iloscPakietow>=100){
        print("Zakupiles $iloscPakietow rabat wynosi 50% cena po rabacie $rabat4")
    }

}