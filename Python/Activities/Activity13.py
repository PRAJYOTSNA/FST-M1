def calculate_sum(numbers):
	sum = 0
	for i in numbers:
		sum += i
	return sum


list1 = [5,11,65,32,28]

result = calculate_sum(list1)

print("Sum of all the elements from list is: " + str(result))