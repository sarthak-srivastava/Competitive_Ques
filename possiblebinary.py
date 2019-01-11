n = int(input())
# In this code, I am going to use exhaustive search to print all possible binary digits containing n digits
def PrintBinary(n):
    PrintBinaryHelper(n,"")

def PrintBinaryHelper(n,s):
    if(n==0):
        print(s)
        return
    PrintBinaryHelper(n-1,s+'0')
    PrintBinaryHelper(n-1,s+'1')

PrintBinary(n)