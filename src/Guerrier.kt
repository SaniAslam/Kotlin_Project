class Guerrier(nom: String, vie: Int, attaque: Int, var armure: Int, armeEnMain: Arme) : Personnage(nom, vie, attaque, armeEnMain) {

    constructor(nom: String, vie: Int, attaque: Int, armure: Int) : this(nom, vie, attaque, armure, Poing())
    override fun afficherEtat() {
        println("nom : $nom | Vie : $vie | Attaque : $attaque | Armure : $armure | Arme en main : ${armeEnMain.nom}")
    }
}