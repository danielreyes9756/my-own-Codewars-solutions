def divisors(integer):
    aux=[]
    for i in range(2,integer):
        if integer%i==0:
            aux.append(i)
    if len(aux) > 0:
        return aux
    res=str(integer)+" is prime"
    return res
