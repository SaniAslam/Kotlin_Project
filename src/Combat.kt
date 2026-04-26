class Combat(private val joueur1: Personnage, private val joueur2: Personnage) {

    private fun jouerTour(attaquant: Personnage, defenseur: Personnage) {
        println("${attaquant.nom} attaque ${defenseur.nom} !")
        attaquant.attaquer(defenseur)
        println("${defenseur.nom} a ${defenseur.vie} PV")
    }
    private fun afficherVainqueur(){
        println("\n Fin du combat !")
        when {
            joueur1.vie > 0 -> println("${joueur1.nom} a gagné !")
            joueur2.vie > 0 -> println("${joueur2.nom} a gagné !")
            else -> println("Match nul !")
        }
    }
    fun lancer(){
        val distribution = ArmeAleatoire()
        distribution.coffre(joueur1)
        distribution.coffre(joueur2)
        println("Début du combat entre ${joueur1.nom} et ${joueur2.nom} !")
        var tour = 1
        while (joueur1.vie > 0 && joueur2.vie > 0){
            println("\n--- Tour $tour ---")
            jouerTour(joueur1, joueur2)
            if (joueur2.vie == 0) break
            jouerTour(joueur2, joueur1)
            tour++
        }
        afficherVainqueur()
    }

}