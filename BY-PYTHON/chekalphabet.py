def is_alphabet(ch):
    if (ch >= 'a' and ch <= 'z') or (ch >= 'A' and ch <= 'Z'):
        print("alphabet")
        
    else: 
        print("not alphabet")
        
        
        
ch = input("Enter any character: ")
x = is_alphabet(ch)
print(x)