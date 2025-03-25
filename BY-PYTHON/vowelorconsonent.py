def cheak_characters(char):
    vowel = "AEIOUaeiou"
    
    
    if char.isalpha():
        if char in vowel:
            print(f"{char} is a vowel character")
            
        else:
            print(f"{char} is a consonent character")
            
    else:
        print(f"{char} is not a character")
        
        
char = input("Enter a character: ")
x = cheak_characters(char)
print(x)