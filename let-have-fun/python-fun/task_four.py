
sum = 0
counter = 0

while counter <=9:
	score = int(input("Enter any score: "))

	if counter % 2 == 0:
		sum = sum + score
	counter += 1

print ("The sum score of even indexes  is: ", sum)
#print ("The average of the score is: "average)

