
sum = 0
counter = 0

while counter <=9:
	score = int(input("Enter any score: "))
	for number in range(0, 100+1):
		if score > -1:
			if score == number:
				sum = sum + score
	counter += 1
average = sum / counter
print("The avergae of valid only score between 0-100 is: ", average)


