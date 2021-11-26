def biSearch(ary, key):
		iLeft = 0;	iRight = len(ary)
		while (iLeft <= iRight):
			
			iMid = (iRight + iLeft)//2
	
			if (ary[iMid] == key): return iMid
			elif (ary[iMid] < key):	iLeft = iMid + 1
			elif (ary[iMid] > key): iRight = iMid - 1
			
		#return -iLeft
		return -1
		
ary = [ 2, 3, 5, 7, 11, 13]
key=11
print('biSearch(', str(key), ')=', biSearch(ary,key))

def biSearch(ary, key, iLeft, iRight): # recursive way
		
		if (iLeft > iRight): return -1
	
		iMid = (iRight + iLeft)//2
	
		if (ary[iMid] == key): return iMid
		elif (ary[iMid] < key):	return biSearch(ary, key, iMid+1, iRight)
		elif (ary[iMid] > key): return biSearch(ary, key, iLeft, iMid-1)


key=12
print('biSearch(', str(key), ')=', biSearch(ary,key,0,len(ary)))