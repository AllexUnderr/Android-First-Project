package password

import kotlin.random.Random
import kotlin.random.nextInt

class Password() {
    private val charPool: List<Char> = ('a'..'z') + ('A'..'Z') + ('0'..'9')

    fun generatePass(passLength: Int) =
        (1..passLength)
            .map { charPool[Random.nextInt(charPool.indices)] }
            .joinToString("")
}