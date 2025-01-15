##  create  a python code to chek the number is prime or not 
num = int(input("Enter  a number :"))
flag = 0

if num  > 2 :
    print("NUmber is NOt  Prime ")
    
else :
    for i in range(2,num):
        if num % i == 0:
            flag = 1
            break
        
    if flag == 1:
        print("Number is not prime")
        
    else:
        print("Number is Prime")