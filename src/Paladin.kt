class Paladin(nom: String, vie: Int, attaque: Int, var foi: Int, armeEnMain: Arme) : Personnage(nom, vie, attaque, armeEnMain) {
    constructor(nom: String) : this(nom, 130, 20, 70, Poing())
    override fun attaquer(cible: Personnage) {
        val degats = (attaque * armeEnMain.multiplicateur).toInt()
        println("$nom attaque ${cible.nom}")
        cible.subirDegats(degats)
        val soin = (degats * 0.08).toInt()
        vie += soin

        println("$nom récupère $soin PV")
    }
    override fun afficherEtat() {
        println("Nom : $nom | Vie : $vie | Attaque : $attaque | Foi : $foi")
    }
}