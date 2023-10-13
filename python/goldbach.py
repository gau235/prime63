#哥德巴赫猜想
#任一大於 2 的偶數, 都可表示成兩個質數之和
pAry = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37]
#以前 14=2*7
#現在 14=3+11 (這是人類的進步)

def goldbach(n, pAry):
	for p1 in pAry:
		for p2 in pAry:
			if p1<p2 and p1+p2 == n:
				print ("偶數 "+str(n)+" = 質數 "+str(p1)+" 加質數 "+ str(p2))
				return
#######################################
goldbach(36, pAry)	#回傳單調 (遞增) 級數 3+37