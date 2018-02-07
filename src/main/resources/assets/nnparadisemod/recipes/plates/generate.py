from shutil import copyfile
materials=["nnparadisemod:compressed_cactus","diamond","emerald","cobblestone","mossy_cobblestone","end_stone"]
types=["cactus","diamond","emerald","cobblestone","mossy","end"]
woodtypes=["spruce","birch","jungle","acacia","dark_oak"]
stonetypes=["andesite","diorite","granite"]
stonemeta=[5,3,1]
master=open("type_pressure_plate.json","r").read()
i=0
for Type in types:
    output=open(Type+"_pressure_plate.json","w+")
    master2=master.replace("Type",Type)
    master3=master2.replace("material",materials[i])
    output.write(master3)
    output.close()
    i=i+1
i=0
for wood in woodtypes:
    output=open(wood+"_pressure_plate.json","w+")
    master2=master.replace("Type",wood)
    master3=master2.replace("material","planks")
    master4=master3.replace("0",str(i+1))
    output.write(master4)
    output.close()
    i=i+1
i=0
for stone in stonetypes:
    output=open(stone+"_pressure_plate.json","w+")
    master2=master.replace("Type",stone)
    master3=master2.replace("material","stone")
    master4=master3.replace("0",str(stonemeta[i]))
    output.write(master4)
    output.close()
    i=i+1
    
