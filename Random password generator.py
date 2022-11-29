import random
import string

while True:
    LETTERS = string.ascii_letters
    DIGITS = string.digits
    SPECIAL_CHARS = string.punctuation
    print("Welcome to password generator.")
    print(
        "0) Exit\n1) Password with letters\n2) Password with digits\n3) Password with letters & digits\n4) Password with letters, digits & special characters")
    passType = int(input("Select password type:\n"))
    if passType == 0:
        break
    passLength = int(input("Input password length:\n"))
    if passType == 1:
        letterRandom = ''.join(random.choices(LETTERS, k=passLength))
        print(letterRandom)
    if passType == 2:
        digitsRandom = ''.join(random.choices(DIGITS, k=passLength))
        print(digitsRandom)
    if passType == 3:
        letterDigitsRandom = ''.join(random.choices(LETTERS + DIGITS, k=passLength))
        print(letterDigitsRandom)
    if passType == 4:
        specialCharactersRandom = ''.join(random.choices(LETTERS + DIGITS + SPECIAL_CHARS, k=passLength))
        print(specialCharactersRandom)
