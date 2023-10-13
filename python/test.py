from itertools import *

牌箱=['紅心1', '黑桃2', '紅心2', '梅花3', '方塊8', '黑桃9', '紅心9', '方塊9', '梅花9']
myBag=list(combinations(牌箱, 2)) # print(list(permutations("ABC",2)))
for ii in myBag:
	print("樣態=", ii)

list1 =['譚', '維', '維']
list2 =['譚', '維','維',]

print("list1=" + str(list1))
print("list2=" + str(list2))
 
if list1== list2: print("111")	
else: print("000")
