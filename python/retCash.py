allCoin=[50, 20, 20, 15, 10, 2, 1, 1, 1]

def retCash(x):
	ret=[]
	
	for coin in allCoin:
		if coin<=x:
			x-=coin
			ret.append(coin)
			
		if x<=0: break;
				
	return ret

ans=retCash(75)
print(ans)	