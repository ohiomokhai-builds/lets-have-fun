
sum = 0
counter = 0

while counter <=9:
	score = int(input("Enter any score: "))
	if score % 2 == 0:
		sum = sum + score
	counter += 1

average = sum / counter
print("The sum of even number is: ", sum)
print("The average of the score is: ", average)
