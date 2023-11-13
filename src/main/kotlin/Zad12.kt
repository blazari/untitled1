fun main() {
    println("Wprowadź wartość kupowanego produktu:")
    val cenaProduktu = readln().toDouble()
    val podStan = cenaProduktu*0.04
    val podLok = cenaProduktu*0.02
    val calosc = cenaProduktu + podLok + podStan.toDouble()
    println("Cena produktu wynosi: $cenaProduktu, podatek stanowy wynosi: $podStan, podatek lokalny wynosi: $podLok. Łącznie zapłacisz: $calosc")
}