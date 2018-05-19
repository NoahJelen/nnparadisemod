from shutil import copyfile
oredict_dyes=["Black","Red","Green","Brown","Blue","Purple","Cyan","LightGray","Gray","Pink","Lime","Yellow","LightBlue","Magenta","Orange","White"]
colors=["black","red","green","brown","blue","purple","cyan","silver","gray","pink","lime","yellow","light_blue","magenta","orange","white"]
master=open("color_redstone_lamp.json","r").read()
print(master)
i=0
for color in colors:
    print(color)
    output=open(color+"_redstone_lamp.json","w+")
    master2=master.replace("color",color)
    master3=master2.replace("Color",oredict_dyes[i])
    output.write(master3)
    output.close()
    i=i+1 
    
