num = int(input("Enter   a number :"))

temp = num
sum = 0

f  = [0] * 10
f[0] = 1
f[1] = 1


for i in range(2,10):
    f[i] = f[i-1] * i
    
    
while temp:
    r = temp % 10
    temp //= 10
    sum += f[r]
    
if sum == num:
    print("yes" , num,"is  a strong number .")
else :
    print("no",num,"is not  a strong  number .")