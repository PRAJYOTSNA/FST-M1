def fibonacci(number):
    if number <= 1:
        return number
    else:
        return(fibonacci(number-1) + fibonacci(number-2))

inputValue = int(input("Enter a number: "))

if inputValue <= 0:
    print("Enter a positive number:")
else:
    for i in range(nterms):
    print(fibonacci(i))