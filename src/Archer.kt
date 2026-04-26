class Archer(nom: String, vie: Int, attaque: Int, var precision: Int, armeEnMain: Arme) : Personnage(nom, vie, attaque, armeEnMain) {
    constructor(nom: String) : this(nom, 100, 18, 80, Poing())
    override fun attaquer(cible: Personnage) {
        val crit = (1..100).random()
        if (crit <= 30) {
            val degats = ((attaque * armeEnMain.multiplicateur) * 1.5).toInt()
            println("$nom réalise un tir précis !")
            cible.subirDegats(degats)
        } else {
            super.attaquer(cible)
        }
    }
    override fun afficherEtat() {
        println("Nom : $nom | Vie : $vie | Attaque : $attaque | Précision : $precision")
    }
}