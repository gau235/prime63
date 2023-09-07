oldList=[2,2,3,7,7,7,9,9,10,10]

def distinct (oldList): # 排除重複
	
	# 初始化:
	count=1
	max=oldList[0]
	# 初始化 end

	for v in oldList: # oldList 必須是遞增數列
		if v > max:
			oldList[count]=v
			print("v="+str(v)+" count="+str(count) +" max="+str(max))
			count+=1
			max=v

	oldLen=len(oldList)
	if count < oldLen: # 不重複的值只占用 oldList 前幾個位置
		for v in range(count, oldLen): print("pop="+str(oldList.pop())) # trim tail
#####################################
print("befDistinct=", oldList)
distinct (oldList)
print("aftDistinct="+str(oldList)+" len="+str(len(oldList)))