fun findSumOfTwo(list: List<Int>, number: Int): Pair<Int, Int> {
    val map: MutableMap<Int, Int> = mutableMapOf()
    for (i in list.indices) {
        val k = map.getOrDefault(i, list[i])
        map += i to k
    }
    while (map.isNotEmpty()) {
        for (i in 0 until map.size) {
            val delta = number - map.getValue(i)
            map.remove(i)
            for (it in map.keys) if (map.getValue(it) == delta) return i to it
        }
    }
    return -1 to -1
}