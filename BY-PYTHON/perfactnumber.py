# Function to check if a number is perfect
def is_perfect(n):
    sum_of_divisors = 0
    for i in range(1, n):
        if n % i == 0:
            sum_of_divisors += i
    return sum_of_divisors == n

# Taking user input
num = int(input("Enter a number: "))

# Checking if it's a perfect number
if is_perfect(num):
    print(f"{num} is a Perfect Number.")
else:
    print(f"{num} is NOT a Perfect Number.")
