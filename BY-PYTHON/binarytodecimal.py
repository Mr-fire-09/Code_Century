def binary_to_decimal(num):
    binary_val = num
    decimal_val = 0
    base = 1
    
    
    while num > 0 :
        rem = num % 10
        decimal_val = decimal_val + rem * base
        num = num // 10
        base = base * 2
        
        
    return binary_val,decimal_val


num = int(input("Enter  a  number :"))
binary,decimal= binary_to_decimal(num)

print(f"Binary number is {binary} and Decimal number is {decimal}")