def solution(num, k):
    num_str = str(num)
    k_str = str(k)
    
    idx = num_str.find(k_str)
    return idx+1 if idx !=-1 else -1