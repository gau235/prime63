allCoin=[50, 10, 5, 5]
targetV=60
def retCash(prefix, idx):
	
	for i in range(idx, len(allCoin)):
		
		curPrefix=prefix.copy()
		
		curPrefix.append(allCoin[i])
		#print(allCoin[i])
		#print(curPrefix)
		
		if	sum(curPrefix) == targetV:
	 		print("size="+ str(len(curPrefix)), curPrefix)	
	 		continue
	 		
		if	sum(curPrefix) > targetV:
	 		continue
				
		retCash(curPrefix, i+1)


retCash([],0)