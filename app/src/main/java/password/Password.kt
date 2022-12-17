package password

class Password {
    private val charPool: List<Char> = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    private val charPoolWithSymbols: List<Char> = charPool + ('!'..'*')

    fun generatePass(passLength: Int = 8) =
        (1..passLength)
            .joinToString(separator = "") { charPool.random().toString() }

    fun generatePassWithSpecialSymbols(passLength: Int = 8) =
        (1..passLength)
            .joinToString(separator = "") { charPoolWithSymbols.random().toString() }
}