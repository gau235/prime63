牌箱=['紅心2', '梅花3', '紅心4', '紅心5', '紅心6', '紅心8', '紅心9']
同花張數=5

def 抓同花迭代法 (抽幾張):
	牌箱深度=len(牌箱)
	仿牌箱=[] # 存放指標
	複合集合=[] # 回傳這個
	嘔吐袋=[]
	
	# 初始化:
	for 指標 in range(0, 牌箱深度): 仿牌箱.append(指標)
	print("仿牌箱=", 仿牌箱)
	for 指標 in 仿牌箱: 複合集合.append([指標]) # 用掉 1 張牌了
	print("複合集合=", 複合集合)
	# 初始化結束
	
	for 抽幾張 in range(抽幾張-1, 0, -1):
		for 指標 in range(0, len(複合集合)):
			單筆值=複合集合[指標][-1:][0]+1
			既有花色=牌箱[單筆值-1][0:2]
			print("複合集合["+str(指標)+"][-1:]="+ str(複合集合[指標][-1:])+" 單筆值="+ str(單筆值))
			
			for 單筆值 in range(單筆值, 牌箱深度):
				print("單筆值="+ str(單筆值) + " 牌箱深度="+ str(牌箱深度))
				if 既有花色 == 牌箱[仿牌箱[單筆值]][0:2]: # 檢查同花
					拷貝內容=複合集合[指標].copy()
					拷貝內容.append(仿牌箱[單筆值])
					嘔吐袋.append(拷貝內容)
			秀出("指標="+str(指標)+" 嘔吐袋=\n", 嘔吐袋)
		複合集合=嘔吐袋 # 迭代
		嘔吐袋=[]
	秀出複合集合('抓同花=\n', 複合集合)
#######################
def 秀出(前綴字串, 容器):
	容器深度=len(容器)
	print(前綴字串, end='')
	for 指標 in range(0, 容器深度): print("第"+str(指標+1)+"="+ str(容器[指標]))	
#######################
def 秀出複合集合(前綴字串, 複合集合):
	牌箱深度=len(複合集合)
	字串=''
	for 指標 in range(0, 牌箱深度):
		拷貝內容=複合集合[指標]
		牌箱深度2=len(拷貝內容)
		for 指標2 in range(0, 牌箱深度2): 字串 += str(牌箱[複合集合[指標][指標2]])+', '
		字串 += '\n'
	print(前綴字串 + 字串)
#######################
抓同花迭代法(同花張數)

# 輸出:
# 紅心2, 紅心4, 紅心5, 紅心6, 紅心8,
# 紅心2, 紅心4, 紅心5, 紅心6, 紅心9,
# 紅心2, 紅心4, 紅心5, 紅心8, 紅心9,
# 紅心2, 紅心4, 紅心6, 紅心8, 紅心9,
# 紅心2, 紅心5, 紅心6, 紅心8, 紅心9,
# 紅心4, 紅心5, 紅心6, 紅心8, 紅心9,