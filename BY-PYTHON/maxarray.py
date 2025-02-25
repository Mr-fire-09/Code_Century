def findmaxelemnet(n,arr):
    
     max_element = arr[0]
     
     
     for i in range(1,len(arr)):
         if arr[i] > max_element:
             max_element = arr[i]
             
     return max_element
 
 
 
 
n = int(input("Number of elements"))
arr = list(map(int,input("Enter an array : ").split()))
             
             
print(findmaxelemnet(n,arr))