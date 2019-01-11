# No. of way integer X can be expressed as sum of Nth power of natural no.s
X = int(input())
N = int(input())
num = 1
def PowerSum(X,N,num):
    if(pow(num,N)<X):
        return PowerSum(X,N,num+1)+PowerSum(X-pow(num,N),N,num+1)
    if(pow(num,N)==X):
        return 1
    else:
        return 0
print(PowerSum(X,N,num))


    