
int quantity = 3
int[] numbers = new int[3]

for(int i = 0; i < 3; i++){
	print "Please enter number " + (i+1) + ": "
	String input1 = System.console().readLine()
	numbers[i] = Integer.parseInt(input1)
}

HashMap<Integer, Integer> map = sort(numbers)

int i = 0
for(number in map.keySet()){
	if(i > 0)
		print ", "
	print number
	i++
}

def sort(int[] numbers){
	
	//insertion sort O(N)
	HashMap<Integer, Integer> sorted = new HashMap<>()
	for(num in numbers){
		sorted[num] = num
	}

	return sorted
}