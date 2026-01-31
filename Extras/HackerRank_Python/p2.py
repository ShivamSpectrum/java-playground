n = int(input())
arr1 = map(int, input(). split())
arr1 = list(arr1)

count = 0
for i in arr1:
    if i%2 == 0:
        count += 1

print(count)

