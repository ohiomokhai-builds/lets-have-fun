
sum = 0;
counter = 0;

while counter <=9:
	score = int(input("Enter any score: "))
	if score % 2 == 0:
		sum = sum + score
	counter += 1
print("The sum of even number is: ", sum)

