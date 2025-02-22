def gdcnumber(num1,num2):
    gdc = 1
    for i in range(1,min(num1,num2)+1):
        if num1 % i == 0 and num2 % i == 0:
            gdc = i
        
    return gdc



num1 = int(input("Enter first number: "))
num2 = int(input("Enter second number: "))
print("gcd",gdcnumber(num1,num2))