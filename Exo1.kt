import java.util.*

fun main(args: Array<String>) {
    val min = 0
    val max = 100
    val aleatoire = SplittableRandom()
    val objectif= aleatoire.nextInt(min, max)
    val reader = Scanner(System.`in`)
    var utilisateur: Int

    ordinateur("J'ai choisi un nombre entre $min et $max")
    do {
        ordinateur("Une idée?")
        utilisateur = reader.nextInt()
        if (utilisateur > objectif) ordinateur("C'est moins !")
        else if (utilisateur < objectif) ordinateur("C'est plus !")
    } while(utilisateur != objectif)

    ordinateur("Felicitation !")
}

fun ordinateur(text: String) {
    println(text)
}