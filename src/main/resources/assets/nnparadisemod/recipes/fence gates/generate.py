from shutil import copyfile
types=["emerald","iron","diamond","gold","brick"]
blocks=["emerald_block","iron_block","diamond_block","gold_block","brick_block"]
items=["emerald","iron_ingot","diamond","gold_ingot","brick"]
master=open("type_fence_gate.json","r").read()
i=0
for Type in types:
    output=open(Type+"_fence_gate.json","w+")
    master2=master.replace("block",blocks[i])
    master3=master2.replace("items",items[i])
    master4=master3.replace("Type",types[i])
    output.write(master4)
    output.close()
    i=i+1
    
