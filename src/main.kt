fun solution(number: Int): Int {
    val sumMap = mutableMapOf<Int, Int>()
    var sum = 0

    for (n in (number - 1).downTo(1)) {
        if (sumMap.containsKey(n)) {
            sum += sumMap[n]!!
            break
        } else if (n % 3 == 0 || n % 5 == 0) {
            sum += n
        }
    }

    sumMap[number] = sum
    return sum
}

fun main() {
    println(solution(10))
    println(solution(20))
    println(solution(200))
}