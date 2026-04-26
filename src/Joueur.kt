class Joueur(
    val nom: String,
    var vie: Int,
    var attaque: Int = 10,
    var armeEquipee: Arme,
    var inventaire: MutableList<Arme> = mutableListOf(Arme("Poing", 5.0))
) {

    constructor(nom: String, vie: Int) : this(
        nom, vie, 10, Arme("Poing", 5.0), mutableListOf()
    )

    fun recevoirDegats(degat: Int) {
        vie -= degat
        if (vie < 0) vie = 0
    }

    fun ajouterArme(arme: Arme) {
        inventaire.add(arme)
    }

    fun changerArme(nomArme: String) {
        val armeTrouvee = inventaire.find { it.nom == nomArme }

        if (armeTrouvee == null) {
            println("Arme non trouvée dans l'inventaire")
        } else {
            inventaire.remove(armeTrouvee)
            inventaire.add(armeEquipee)
            armeEquipee = armeTrouvee
            println("$nom a équipé $armeEquipee")
        }
    }

    fun afficherInventaire() {
        println("Inventaire de $nom :")
        for (arme in inventaire) {
            println(arme)
        }
    }

    override fun toString(): String {
        return "($nom, vie=$vie, attaque=$attaque, arme=$armeEquipee, inventaire=$inventaire)"
    }
}