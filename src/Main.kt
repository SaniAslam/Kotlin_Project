fun main() {
        val joueur1 = Guerrier("Arthur", 150, 25, 10)
        val joueur2 = Mage("Merlin")

        joueur1.armeEnMain = Hache()
        joueur2.armeEnMain = Epee()

        val combat = Combat(joueur1, joueur2)
        combat.lancer()
}

/*

        val test1 = Guerrier("Test1", 600, 30, 15)
        val test2 = Mage("Test2")

        val combat = Combat(test1, test2)

        combat.lancer()/*

        /*println("===== BOSS FIGHT : SANI vs RAYAN =====")

        val sani = Assassin("Sani", 600, 35, 90, DoubleLame())
        val rayan = Mage("Rayan", 650, 30, 120, Epee())

        val combat = Combat(sani, rayan)

        combat.lancer()*/
}
/*fun main() {

        println("===== TEST 1 =====")

        val test1 = Guerrier("Test1", 150, 25, 10)
        val test2 = Mage("Test2")

        test2.armeEnMain = Epee()
        test1.armeEnMain = Hache()

        test2.attaquer(test1)
        test1.attaquer(test2)



        println("\n===== TEST 2 =====")

        val test3 = Archer("Test3")
        test3.armeEnMain = Arc()

        test3.attaquer(test1)



        println("\n===== TEST 3 =====")

        val test4 = Assassin("Test4")
        test4.armeEnMain = DoubleLame()

        test4.attaquer(test2)



        println("\n===== TEST 4 =====")

        val test5 = Paladin("Test5")
        test5.armeEnMain = Lance()

        test5.attaquer(test1)
        test5.afficherEtat()
}*/
/*



    /*
    // Création Épée
    val epee = Arme("Épée", 15)
    println(epee.toString())

    // Création .Arc
    val arc = Arme(".Arc", 10)
    println(arc.toString())

    // Modification valide
    arc.degat = 12
    println(arc.toString())

    // Modification invalide
    arc.degat = -5

    //Arthur avec épée
    val arthur = Joueur("Artur",50,epee)
    println(arthur)

    //Nouvelle arme
    val hache =Arme ("Hache",20)

    //Ajout armes
    arthur.ajouterArme(arc)
    arthur.ajouterArme(hache)

    //afficher inventaire
    arthur.afficherInventaire()

    //changer arme arc
    arthur.changerArme("Hache")

    // changer arme inexistante
    arthur.changerArme("Lance")

    // joueur sans arme &quipée (constructeur secondaire)
    val lancelot = Joueur ("Lancelot",50)
    println(lancelot)

    //équiper lancelot avec arc
    lancelot.ajouterArme(arc)
    lancelot.changerArme(".Arc")

    println("Lancelot est équipé de l'arme : ${lancelot.armeEquipee}")

    // afficher inventaire Lancelot

    lancelot.afficherInventaire()

    val combat = Combat(arthur,lancelot)
    combat.lancer()
*/
    /*
    val perceval = Personnage("Perceval",100,15)
    val mordred = Personnage("Mordred",80,20)

    perceval.afficherEtat()
    mordred.attaquer(perceval)
    perceval.subirDegats(100)
    perceval.attaquer(mordred)
*/
   /* val arthur = Guerrier("Arthur",150,50,5)
    val merlin = Mage("Merlin",150,20,20)
    val morgane = Mage("Morgane")

    val lesPersonnages: MutableList<Personnage> = mutableListOf()
    lesPersonnages.add(arthur)
    lesPersonnages.add(merlin)

    for (personnage in lesPersonnages) {
        personnage.afficherEtat()
    }

    for (tour in 1..3){
        println("\n--- Tour $tour ---")
        merlin.attaquer(arthur)
        arthur.attaquer(merlin)
    }

    for (personnage in lesPersonnages){
        personnage.afficherEtat()
    }

    */

        /* Armes
        val epee = Epee()
        val arc = Arc()

        // Joueurs
        val arthur = Joueur("Arthur", 100, 15, epee)
        val merlin = Joueur("Merlin", 100, 50, arc)

        // Combat
        val combat = Combat(arthur, merlin)

        // Lancer combat
        combat.lancer()*/

*/