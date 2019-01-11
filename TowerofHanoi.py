# Moving n disks from initial peg to destination peg using auxillary peg

n  = int(input())
def TowerofHanoi(n,frompeg,topeg,auxpeg):
    if(n==1):
        print("Move disk 1 from ",frompeg," to ",topeg)
        return
    TowerofHanoi(n-1,frompeg,auxpeg,topeg)
    print("Move disk",n," from ",frompeg," to ",topeg)
    TowerofHanoi(n-1,auxpeg,topeg,frompeg)
    return
frompeg = '1'
topeg = '3'
auxpeg = '2'
TowerofHanoi(n,frompeg,topeg,auxpeg)