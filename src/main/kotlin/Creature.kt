import kotlin.random.Random

open class Creature(
    var attack: Int,
    var defense: Int,
    var health: Int,
    var damageRange: IntRange
) {
    var isAlive = true

    fun attack(target: Creature) {
        if(isAlive) {
            val attackModifier = attack - target.defense + 1
            val success = (1..attackModifier).any { Random.nextInt(1, 7) in 5..6 }
            if (success) {
                val damage = damageRange.random()
                target.health -= damage
                if (target.health <= 0) {
                    target.isAlive = false
                }
            }
        }else{
            println("Dead")
        }


    }

}