def smaller(arr):
    arr2=[]
    count=0
    print(arr)
    for i in range(len(arr)):
        count=0
        for j in range(i, len(arr)):
            if arr[j] < arr[i]:
                count=count+1
        arr2.append(count)
    return arr2
