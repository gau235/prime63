寶箱=[1000, 200, 30, 4] # 每個籌碼都是不可分割的剛性物體
目標個數=2 # 設定抓幾個
寶箱size=len(寶箱)

def 抓東西(我的收集, 第幾層):

		if 第幾層 == 寶箱size:
			
		 	if len(我的收集) == 目標個數: # 當抓到籌碼個數有 2 個的情況下
		 		print("抓到 " + str(我的收集) + " 元")
		 		
		 	return # 上帝指示

		抓東西(我的收集, 第幾層+1) # 問抓不抓? 不抓
		
		暫存袋=我的收集.copy() # 拷貝 1 份
		暫存袋.append(寶箱[第幾層]) # 加進去
		抓東西(暫存袋, 第幾層+1) # 問抓不抓? 抓

#########################
抓東西([], 0) # 開始抓東西

#輸出:
#抓到 30 元 跟 4 元
#抓到 200 元 跟 4 元
#抓到 200 元 跟 30 元
#抓到 1000 元 跟 4 元
#抓到 1000 元 跟 30 元
#抓到 1000 元 跟 200 元