
val telex: MutableList<String> = mutableListOf("aw", "aa", "dd", "ee", "oo", "ow", "w")

fun main() {

    print("Nhập vào một chuỗi: ")
    val input: String? = readlnOrNull()

    if (input != null) {
        val textVn = countLetters(input)
        print("Sum: ${textVn.size} =>")
        for (value in textVn) {
            print("\t $value")
        }

    }

}

fun countLetters(text: String): Set<String> {
    val input = text.trim()
    val textVn = mutableSetOf<String>()
    for (i in 0..<input.length - 1) {

        val value = input[i].toString().plus(input[i + 1])

        if (telex.contains(input[i].toString())) {
            textVn.add(input[i].toString())
        }

        if (telex.contains(value)) {
            textVn.add(value)
        }
    }
    return textVn
}