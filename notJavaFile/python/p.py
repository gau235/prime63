寶箱=['新', '竹', '社', '團']
baseLen=len(寶箱)
cnt=0

def 排列(曾經擁有): # 十字法 里程表法
		global  cnt
		if len(曾經擁有) == baseLen:
			cnt+=1
			print(str(cnt)+'='+str(曾經擁有))
			return # 上帝指示

		新歡=排除元素(寶箱, 曾經擁有)

		while len(新歡)!=0:
			拷貝那份=曾經擁有.copy()
			拷貝那份.append(新歡.pop(0)) 
			排列(拷貝那份)
#########################
def 排除元素(原容器, 該排除的元素):
	新容器 = 原容器.copy()
	for 元素 in 該排除的元素:
		新容器.remove(元素)
	return 新容器
#########################
排列([])
#輸出:
# 21=['團', '竹', '新', '社']
# 22=['團', '竹', '社', '新']
# 23=['團', '社', '新', '竹']
# 24=['團', '社', '竹', '新']