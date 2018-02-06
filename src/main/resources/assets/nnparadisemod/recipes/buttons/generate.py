from shutil import copyfile
materials=["nnparadisemod:compressed_cactus","end_stone","obsidian","diamond","emerald","gold","iron","cobblestone","mossy_cobblestone","nnparadisemod:glowing_obsidian"]
types=["cactus","end","obsdidian","diamond","emerald","gold","iron","cobblestone","mossy","glowing_obsidian"]
woodtypes=["spruce","birch","jungle","acacia","dark_oak"]
stonetypes=["andesite","diorite","granite"]
stonemeta=[5,3,1]
master=open("type_button.json","r").read()
i=0
for Type in types:
    output=open(Type+"_button.json","w+")
    master2=master.replace("Type",Type)
    master3=master2.replace("material",materials[i])
    output.write(master3)
    output.close()
    i=i+1
i=0
for wood in woodtypes:
    output=open(wood+"_button.json","w+")
    master2=master.replace("Type",wood)
    master3=master2.replace("material","planks")
    master4=master3.replace("0",str(i+1))
    output.write(master4)
    output.close()
    i=i+1
i=0
for stone in stonetypes:
    output=open(stone+"_button.json","w+")
    master2=master.replace("Type",stone)
    master3=master2.replace("material","stone")
    master4=master3.replace("0",str(stonemeta[i]))
    output.write(master4)
    output.close()
    i=i+1
    
