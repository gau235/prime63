base=[1000, 200, 30, 4] # 每個籌碼都是不可分割的剛性物體
someK=2 # 設定取幾個

def pickSome(myBag, idx):

	if idx == len(base):
			
		if len(myBag) == someK: # 當籌碼個數有 2 個的情況下
			print("抓到 "+str(myBag[0])+" 元 跟 "+str(myBag[1])+" 元")
		 		
		return # 上帝指示

	pickSome(myBag, idx+1) # 問取不取? 不取
		
	tmpBag=myBag.copy() # 拷貝 1 份
	tmpBag.append(base[idx]) # 加進去
	pickSome(tmpBag, idx+1) # 問取不取? 取

#######################
pickSome([], 0) # 取物開始

# output:
# 抓到 30 元 跟 4 元
# 抓到 200 元 跟 4 元
# 抓到 200 元 跟 30 元
# 抓到 1000 元 跟 4 元
# 抓到 1000 元 跟 30 元
# 抓到 1000 元 跟 200 元