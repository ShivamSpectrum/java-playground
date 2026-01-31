n = int(input())
arr1 = map(int, input(). split())
arr1 = list(arr1)
l1 = []

for i in arr1:
    if n == len(arr1) and arr1.count(i) <= 1:
        l1.append(i)

if len(l1) > 0 :
    print(l1[0])
else:
    print(None)