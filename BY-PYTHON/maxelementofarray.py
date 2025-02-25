n = int(input("Enter the number of array : "))
a = list(map(int,input("Enter an array : ").split()))

max_element = a[0]

for i  in range(len(a)):
     if a[i] > max_element:
         max_element = a[i]
         
         
print(max_element)