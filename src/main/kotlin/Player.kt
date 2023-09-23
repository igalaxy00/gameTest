import Creature
class Player(
    attack: Int,
    defense: Int,
    health: Int,
    damageRange: IntRange
) : Creature(attack, defense, health, damageRange) {

    private val maxHealth = health
    var healCount = 4


     fun heal() {
        if (healCount > 0) {
            if (maxHealth > 0) {
                val healAmount = maxHealth * 0.3
                health += healAmount.toInt()
                if (health > maxHealth) {
                    health = maxHealth
                }
            }
            healCount--
        }
    }


}