def is_abudant(n):
    sum = 1
    
    for i in range(2,n):
        if (n%i==0):
            sum = sum+i
            
    return sum > n



num = int(input("Enter  a number :"))

if is_abudant(num):
    print(f"{num} is and abudant number ")

else :
    print(f"{num} is not an abudant number ")
          

          