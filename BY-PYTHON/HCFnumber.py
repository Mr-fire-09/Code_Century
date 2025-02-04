num1 = int(input("Enter  a number :"))
num2 = int(input("Enter  a number :"))

hcf = 1

for i in range(1 , min(num1,num2) + 1):
    if num1 % i == 0  and num2 % i == 0:
        hcf = i
        
print(f" HCF of {num1 , num2} is {hcf}")