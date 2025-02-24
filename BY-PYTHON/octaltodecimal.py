def octaltodecimal(num):
    decimal_val = 0
    base = 1
    
    while num :
        last_digit = num % 10
        num = int(num / 10)
        decimal_val += last_digit * base
        base = base * 8
        
    return decimal_val

num = int(input("Enter  a octal Number : "))
print(octaltodecimal(num))