fun main() {

    val array: IntArray = intArrayOf(12, 120, 300, 470, 150, 220, 310)
    fun evenNums(list: IntArray): Int {
        var sum: Int = 0
        var count: Int = 0

        for (i in 2..(list.count() - 1) step 2) {
            sum = sum + list[i]
            count = count + 1
        }
        var avg: Int = sum / count
        return avg
    }
    println(evenNums(array))

    var testStr = "radar"

    fun IsPalindrom(str: String) {
        var reversed = ""
        var len = str.length

        for (i in (len - 1) downTo 0) {
            reversed = reversed + str[i]
        }
        if (str.equals(reversed, ignoreCase = true)) {
            println("it's Palindrome")
        } else {
            println("it's not Palindrome")
        }
    }
    IsPalindrom(testStr)


}
