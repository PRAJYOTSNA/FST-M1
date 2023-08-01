numberList = list(input("Enter List of numbers to find Sum seprated by space : ").split(" "))
sum = 0

for n in numberList:
  sum += int(n)

print(sum)