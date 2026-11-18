
sum = 0;
counter = 0;

while counter <=9:
	score = int(input("Enter any score: "))
	for number in range (0, 100+1):
		if score == number:
			sum = sum + score
	counter += 1
print("The sum of valid score between 0-100  is: ", sum)

