import java.io.Console

fun chaudfroid(ecart: Int): String {
    when (ecart) {
        in 1..10 -> return "Bouillant"
        in 11..25 -> return "Chaud"
        in 26..50 -> return "Froid"
        else -> return "Gelé"
    }
}

fun main() {
    val console : Console? = System.console()
    val chiffre : Int?
    var essai : Int? = null
    var chaudfroid : String?

    println("Entre un chiffre à deviner")
    chiffre = String(console!!.readPassword()).toInt()

    while (chiffre != essai) {
        println("Entre ton essai :")
        essai = readLine()!!.toInt()
        chaudfroid = chaudfroid(Math.abs(essai - chiffre))

        if (essai < chiffre) {
            println("Plus !")
            println(chaudfroid)
        } else if (essai > chiffre) {
            println("Moins !")
            println(chaudfroid)
        } else {
            println("Trouvé !")
        }
    }
}