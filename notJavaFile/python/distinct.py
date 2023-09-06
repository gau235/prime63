# trim the sorted ary
oldList=[2,2,3,7,7,7,9,9,10,10]
print("old oldList=", oldList);

count=1
max=oldList[0]

for v in oldList: # oldList 必須是遞增數列
	if v > max:
		oldList[count]=v
		print("v="+str(v)+" count="+str(count) +" max="+str(max), end='\n')
		count+=1
		max=v

print("oldList="+str(oldList))
newLen=len(oldList)
if newLen > count: # 不重複的值只占用 oldList 前幾個位置
	for v in range(count, newLen): print("pop="+str(oldList.pop())) # trim tail
#####################################
print("newList="+str(oldList)+" len="+str(count))