class Mage (nom: String, vie: Int, attaque: Int, var mana: Int, armeEnMain: Arme) : Personnage(nom, vie, attaque, armeEnMain) {
    constructor(nom: String) : this(nom, 100, 20, 50, Poing())
    fun lancerSort(cible: Personnage) {
        if (mana >= 10) {
            mana -= 10
            println("$nom lance un sort sur ${cible.nom} (Mana restant: $mana)")
            cible.subirDegats(attaque * 2)
        } else {
            println("$nom n'a pas assez de mana, attaque normale")
            super.attaquer(cible)
        }
    }
    override fun attaquer(cible: Personnage) {
        lancerSort(cible)
    }
    override fun afficherEtat() {
        println("nom : $nom | Vie: $vie | Attaque : $attaque | Mana : $mana")
    }
}