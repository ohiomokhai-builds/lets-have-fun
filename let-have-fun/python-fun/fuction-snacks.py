
temperature = int(input("Enter the temperature in celsius (c): "))
unit = input("Enter the temperature type: ")
threshold_value = 10

def temperature_check(temperature):
	celsius = temperature
	return celsius

celsius_converter = 0
fahrenheit_converter = 0
	
if temperature_check(temperature) and unit = "f"
    celsius_converter = (temperature_check(temperature) - 32) * 5/9
    print (celsius)
else
    fahrenheit_converter = (temperature_check(temperature) * 9/5) + 32
    print (fahrenheit)
#fahrenheit = (temperature_check(temperature) * 9/5) + 32
#print (fahrenheit)

for temperature_weigh in range (1, 3):
	match temperature_weigh:
		case 1:
			#temperature_check(temperature)
			if fahrenheit < threshold_value:
				print ("Cold advisory")
		case 2:
			#temparture_check (temperature)
			if fahrenheit > threshold_value:
				print ("Heat alert")
		case _:
			print ("Omo na you sabi!!")
