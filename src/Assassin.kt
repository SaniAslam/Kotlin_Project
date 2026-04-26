class Assassin(nom: String, vie: Int, attaque: Int, var agilite: Int, armeEnMain: Arme) : Personnage(nom, vie, attaque, armeEnMain) {
    constructor(nom: String) : this(nom, 90, 25, 95, Poing())
    override fun attaquer(cible: Personnage) {
        val crit = (1..100).random()
        if (crit <= 20) {
            val degats = ((attaque * armeEnMain.multiplicateur) * 2).toInt()
            println("$nom réalise un coup critique !")
            cible.subirDegats(degats)
        } else {
            super.attaquer(cible)
        }
    }

    override fun afficherEtat() {
        println("Nom : $nom | Vie : $vie | Attaque : $attaque | Agilité : $agilite")
    }
}