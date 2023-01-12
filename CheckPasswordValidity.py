def validPassword(passwords, key):
    if len(key) != 5:
        return []
    actualUpperCase = int(key[0:1])
    reversedCharacter = reverse(key[1:4])
    sumDigit = int(key[4:])
    validList = []
    for password in passwords:
        # Check number of upper cases
        if actualUpperCase > numberOfUppercaseCharacter(password):
            continue
        # Check last 3 characters reverse
        elif reversedCharacter not in password:
            continue
        # Check number of digits
        elif sumDigit != int(sumOfDigits(password)):
            continue
        else:
            validList.append(password)
    return validList



def numberOfUppercaseCharacter(password):
    count = 0
    for i in password:
        if i.isupper():
            count += 1
    return count

def reverse(inputStr):
    return inputStr[::-1]

def sumOfDigits(input):
    sum = 0
    for i in input:
        if i.isdigit():
            sum += int(i)
    return sum


def main():
    # Test-1
    passwords = ["P@ssWORD1", "20passWORD20", "PASS6word"]
    print(validPassword(passwords, "4dro6"))

    # Test-2
    passwords = ["theBestpassword", "myPassword#3"]
    print(validPassword(passwords, "1dro0"))

    # Test-3
    passwords = ["MyPassword2", "crazyPassword1#$%"]
    print(validPassword(passwords, "1%$#1"))

    # Test-4
    passwords = ["luckyPASSWORD#$$$", "luckyDay666"]
    print(validPassword(passwords, "6pass7"))






main()
