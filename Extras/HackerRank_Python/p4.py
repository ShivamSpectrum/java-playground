n = int(input())
arr1 = map(int, input(). split())
arr1 = list(arr1)

arr1.sort()
# print(arr1)


count = 0
for i in range(arr1):
    if arr1[i] == arr1[i+1] - 1:
        count += 1
    
print(count)