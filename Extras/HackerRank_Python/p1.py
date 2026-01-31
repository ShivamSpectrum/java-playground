
n = int(input())
blank = n-1
space = ' '
if n>=1 and n<=9:
    for j in range(1,n+1):
        print(' '*blank, end = '')
        for i in range(1,j+1):            
            print (str(i), end = '')
        print('')
        blank-=1

else :
    print("not a valid number !")
