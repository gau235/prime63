寶箱=['新', '竹', '社', '團']
寶箱深度=len(寶箱)
計數=0

def 長尾巴(曾經擁有): # 十字法 里程表法
		
	if len(曾經擁有) == 寶箱深度:
		global  計數
		計數 += 1
		print(str(計數)+'='+str(曾經擁有))
		return # 上帝指示

	新歡=排除元素(寶箱, 曾經擁有)

	while len(新歡)!=0:
		拷貝那份=曾經擁有.copy()
		拷貝那份.append(新歡.pop(0)) 
		長尾巴(拷貝那份)
#########################
def 排除元素(原容器, 該排除的元素):
	新容器 = 原容器.copy()
	for 元素 in 該排除的元素: 新容器.remove(元素)
	return 新容器
#########################
長尾巴([])

# 輸出:
# 21=['團', '竹', '新', '社']
# 22=['團', '竹', '社', '新']
# 23=['團', '社', '新', '竹']
# 24=['團', '社', '竹', '新']