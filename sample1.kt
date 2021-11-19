fun findSumOfTwo(list: List<Int>, number: Int): Pair<Int, Int>
{
	var sorted_list: List<Pair<Int, Int>> = listOf()	
	for (i in list.indices)
		sorted_list += pairOf(i, list[i])
		
	sorted_list.sortWith(compareBy(Pair::second))
	
	for (i in 0 until sorted_list.size - 1)
	{
		val first_value  = sorted_list[i]
		val second_value = sorted_list[i + 1]
		
		if (fist_value + second_value == number)
			return pairOf(fist_value, second_value)		
	}
	
	return -1 to -1
}