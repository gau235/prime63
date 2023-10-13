牌箱=['梅花3', '梅花5', '方塊6', '黑桃8', '紅心7', '方塊9', '梅花9']
順子張數= 5
牌箱深度=len(牌箱)

def 抓順子(手上的牌, 第幾抽):
	
	if len(手上的牌) >= 2 and int(手上的牌[-1:][0][-1:])-int(手上的牌[-2:][0][-1:]) >= 順子張數: 
		return # 過濾相差大於 5 的 2 張牌
	
	if 第幾抽 == 牌箱深度:
		if len(手上的牌) == 順子張數:
		 	暫存牌箱=[]
		 	for 單張牌 in 手上的牌: 暫存牌箱.append(int(單張牌[-1:]))
		 	暫存牌箱.sort()
		 	
		 	if 暫存牌箱[4]-暫存牌箱[3]==1==暫存牌箱[3]-暫存牌箱[2]==暫存牌箱[2]-暫存牌箱[1]==暫存牌箱[1]-暫存牌箱[0]: 
		 		print("抓順子=", 手上的牌) # bug 同花順
		return # 上帝指示

	抓順子(手上的牌, 第幾抽+1) # 不掀開即為不抓
	
	掀開的牌=牌箱[第幾抽]
	拷貝那份=手上的牌.copy()
	拷貝那份.append(掀開的牌) # 加進手上的牌
	手上的牌=拷貝那份
	抓順子(手上的牌, 第幾抽+1)
#########################
抓順子([], 0)

# 輸出:
# 抓順子 ['梅花5', '方塊6', '黑桃8', '紅心7', '梅花9']
# 抓順子 ['梅花5', '方塊6', '黑桃8', '紅心7', '方塊9']
