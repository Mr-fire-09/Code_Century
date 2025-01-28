number = int(input("Enter  a number : "))

num = number

digit , total_sum = 0,0

length = len(str(num))

while num > 0:
    digit = num % 10
    num //= 10
    total_sum += pow(digit,length)
    
    
if total_sum == number :
    print( "IS A Amstrong Number")
    
else:
    print( "IS NOT A Amstrong Number")