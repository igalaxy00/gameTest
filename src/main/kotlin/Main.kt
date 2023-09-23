fun main(args: Array<String>) {
    println("Hello World!")
    val player = Player(10, 5, 100, 1..6)
    val monster = Monster(8, 3, 80, 2..8)

    player.attack(monster)
    monster.attack(player)

    player.heal()

}