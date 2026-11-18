
sum = 0
counter = 0
#valid_check = 0

while counter <=9:
	score = int(input("Enter any score: "))
	for number in range(0, 100+1):
		if score > -1:
			if score == number:
				sum = sum + score
	counter += 1
print("The sum of valid only score between 0-100  is: ", sum)

