allCoin=[50, 10, 5, 5]
targetV=65

def giveChange(preAllCoin, lv):
	
	for i in range(lv, len(allCoin)):
		
		myAllCoin=preAllCoin.copy()
		pringLv(lv, "preAllCoin="+str(preAllCoin)+" allCoin["+str(i)+"]="+ str(allCoin[i]))	
		myAllCoin.append(allCoin[i])
		
		if sum(myAllCoin) == targetV:
	 		pringLv(lv, "add "+ str(allCoin[i])+" targetV="+str(myAllCoin))	
	 		continue

		if sum(myAllCoin) < targetV:
			pringLv(lv, "less then add "+ str(allCoin[i])+"="+str(myAllCoin))
			giveChange(myAllCoin, i+1)		
#############################
def pringLv(lv, s):
	tmpS=""
	for cnt in range(lv,0,-1):
		tmpS+="  "
	print(tmpS+str(lv)+" "+s)
#############################		
giveChange([],0)