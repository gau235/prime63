# trim the sorted ary
list=[2,2,3,7,7,7,9,9,10,10]
print("old list=", list);

count=1
max=list[0]
for val in list: # list 必須是遞增數列
	if (val > max):
		list[count]=val
		print("val="+str(val)+" count="+str(count) +" max="+str(max), end='\n')
		count+=1
		max=val


print("old list=", list)

newLen=len(list)
if (newLen > count): # 不重複的值只占用 list 前幾個位置
	for val in range(count, newLen): # trim tail
		print("pop ", list.pop())
		

print("count=", count)
print("new list=", list)