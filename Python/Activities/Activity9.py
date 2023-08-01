list1 = list(input("Enter list of numbers seprated by coma: ")).split(",")
list2 = list(input("Enter list of numbers seprated by coma: ")).split(",")

print("Given list1 : ", list1)
print("Given list2 : ", list2)

list3 = []


for n in list1:
    if (n % 2 != 0):
        list3.append(n)
        

for m in ist2:
    if (m % 2 == 0):
        list3.append(m)


print("Concatinated List is:", list3)
