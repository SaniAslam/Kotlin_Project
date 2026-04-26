
open class Arme(val nom: String, multiplicateurInitial: Double) {

    var multiplicateur: Double = multiplicateurInitial
        set(value) {
            if (value > 0) {
                field = value
                println("Modification du multiplicateur de l'arme $nom.")
            } else {
                println("Valeur invalide pour le multiplicateur")
            }
        }

    override fun toString(): String {
        return "($nom, x$multiplicateur)"
    }
}


class ArmeAleatoire {
    fun coffre(joueur: Personnage) {
        if (joueur.armeEnMain.nom == "Poing") {
            attribuerArme(joueur)
        }
    }
    fun attribuerArme(joueur: Personnage) {
        val chance = (1..100).random()
        joueur.armeEnMain = when {
            chance <= 25 -> Poing()
            chance <= 45 -> Epee()
            chance <= 60 -> Hache()
            chance <= 75 -> Arc()
            chance <= 88 -> Lance()
            else -> DoubleLame()
        }
        println("${joueur.nom} a trouvé dans un coffre: ${joueur.armeEnMain.nom}")
    }
}