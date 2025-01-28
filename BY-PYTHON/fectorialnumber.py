num = int(input("Enter  a number : "))
fact = 1


if num < 0:
    print("NUmber dont exist ")
    
else :
    for i in range(1,num+1):
        fact *= i
    print("Factorial of", num, "is :", fact)