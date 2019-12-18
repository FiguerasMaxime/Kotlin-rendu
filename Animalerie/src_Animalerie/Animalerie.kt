class Animalerie {
    var list = mutableListOf<Animal>()

    fun ajouterAnimal(type: Animal){
        list.add(type)
    }
}