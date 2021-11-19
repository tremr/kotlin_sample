fun findSumOfTwo(list: List<Int>, number: Int): Pair<Int, Int>
{
	list.sort()
	
	for (element in list)
	{
		if (element.hasNext())
			if (element + element.next() == number)
				return pairOf(element, element.next())
	}
	
	return -1 to -1
}