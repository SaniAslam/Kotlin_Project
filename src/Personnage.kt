open class Personnage(val nom: String, var vie: Int, val attaque: Int, var armeEnMain: Arme ) {

    open fun attaquer(cible: Personnage) {
        if (vie <= 0) {
            println("$nom ne peut pas attaquer (KO)")
        } else {
            val degatsTotal = (attaque * armeEnMain.multiplicateur).toInt()
            println("$nom attaque ${cible.nom} avec ${armeEnMain.nom} et inflige $degatsTotal dégâts")
            cible.subirDegats(degatsTotal)
        }
    }

    open fun subirDegats(degats: Int) {
        vie -= degats
        if (vie < 0) vie = 0
        println("$nom perd $degats points de vie (Vie restante : $vie)")
    }

    open fun afficherEtat() {
        println("Nom : $nom | Vie : $vie | Attaque : $attaque | Arme en main : $armeEnMain")
    }
}