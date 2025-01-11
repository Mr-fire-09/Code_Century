n = int(input("Enter  a  year  : "))

if  n % 400 == 0:
    print("It is a leap Year ")
    
elif n % 100 ==0 and n%100 != 0:
    print("It is a leap Year")
    
else:
    print("IT Is NOt A Leap Year ")