list1 = list(input("Enter list of numbers seprated by coma: ")).split(",")
print("Given list is: ", list1)


firstElement = list1[0]

lastElement = list1[-1]

if (firstElement == lastElement):
    print(True)
else:
    print(False)