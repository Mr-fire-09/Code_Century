def sum_of_array(arr,n):
    total = 0
    for num in arr:
        total += num
        
    return total


n = int(input("Enter the number of elements : "))
arr = list(map(int,input().split()))
x = sum_of_array(arr,n)
print ("Sum of elements" , x ) 