from itertools import *

甲輪牌箱=['紅心1', '黑桃2', '紅心2', '梅花3', '方塊8', '黑桃9', '紅心9', '方塊9', '梅花9']
tmpBag=[]
myBag=list(combinations(甲輪牌箱,3))
#print(list(permutations("ABCD",2)))

for iii in myBag: # 抓三條
	if(iii[0][-1:]==iii[1][-1:]==iii[2][-1:]):
		tmpBag.append(iii[0])
		tmpBag.append(iii[1])
		tmpBag.append(iii[2])
		print("抓三條 "+str(iii))
#######################
def 排除元素(原容器, 該排除的元素):
	新容器 = []
	for 元素 in 原容器:
		if 元素 not in 該排除的元素:
			新容器.append(元素)
	return 新容器
#######################
剩下那些=排除元素(甲輪牌箱, tmpBag)
print('剩下那些 ' + str(剩下那些))

myBag=list(combinations(剩下那些,2))

for iii in myBag: # 抓一對
	if(iii[0][-1:]==iii[1][-1:]):
		print("抓一對 "+str(iii))
		
# 輸出:
# 抓三條 ('黑桃9', '紅心9', '方塊9')
# 抓三條 ('黑桃9', '紅心9', '梅花9')
# 抓三條 ('黑桃9', '方塊9', '梅花9')
# 抓三條 ('紅心9', '方塊9', '梅花9')
# 剩下那些 ['紅心1', '黑桃2', '紅心2', '梅花3', '方塊8']
# 抓一對 ('黑桃2', '紅心2')
