#寶箱=[10, 10, 10, 20, 20, 20, 20, 30, 30]
寶箱=['愛','愛','愛', '完','不','完']
回傳的互斥集=緩衝空間=[] # 緩衝空間 1 單位
取出字數=3

def 長尾巴(曾經擁有): # 十字法 里程表法
		global 緩衝空間
		if len(曾經擁有) == 取出字數:
			if 曾經擁有 != 緩衝空間:
				緩衝空間=曾經擁有  #很重要
				回傳的互斥集.append(曾經擁有)
			return # 上帝指示

		新歡=排除元素(寶箱, 曾經擁有)
		
		while len(新歡)!=0:
			拷貝那份=曾經擁有.copy()
			拷貝那份.append(新歡.pop(0))
			長尾巴(拷貝那份)
#########################
def 排除元素(原容器, 該排除的元素):
	新容器 = 原容器.copy()
	for 元素 in 該排除的元素:
		新容器.remove(元素)
	return 新容器
#########################
def 加工輸出(容器):
	容器.sort()
	緩衝空間=[]
	計數值=0
	容器長度值=len(容器)
	for 指標 in range(0, 容器長度值):
		if (容器[指標]!=緩衝空間):
			緩衝空間=容器[指標]
			計數值+=1
			if 計數值%1==0:
				print(str(計數值)+'='+str(容器[指標]))
	print( '總樣態數='+str(計數值))
#######################
寶箱.sort()
長尾巴([])
print( '寶箱='+str(寶箱)+' 長尾巴後 size='+str(len(回傳的互斥集)))
加工輸出(回傳的互斥集)
#輸出:
# 1=['不', '完', '完']
# 2=['不', '完', '愛']
# 3=['不', '愛', '完']
# 4=['不', '愛', '愛']
# 5=['完', '不', '完']
# 6=['完', '不', '愛']
# 7=['完', '完', '不']
# 8=['完', '完', '愛']
# 9=['完', '愛', '不']
# 10=['完', '愛', '完']
# 11=['完', '愛', '愛']
# 12=['愛', '不', '完']
# 13=['愛', '不', '愛']
# 14=['愛', '完', '不']
# 15=['愛', '完', '完']
# 16=['愛', '完', '愛']
# 17=['愛', '愛', '不']
# 18=['愛', '愛', '完']
# 19=['愛', '愛', '愛']
# 總樣態數=19