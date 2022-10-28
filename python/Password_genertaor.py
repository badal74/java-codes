import random
length = int(input("Enter the length of your password: "))
s="abcdefghijklmnopqrstuvwxyz01234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()?"
p =  "".join(random.sample(s,length))
print ("Your Genertaed password is: "p)
