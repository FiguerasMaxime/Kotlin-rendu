fun main() {

    val animalerie = Animalerie()

    animalerie.ajouterAnimal(Perroquet())
    animalerie.ajouterAnimal(Chat())

    for (type in animalerie.list) {
        type.quiSuisJe()
        type.bruit()
    }
}